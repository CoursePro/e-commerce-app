package com.lp.ecom.customerservice.customer;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: Lucky Prabath
 * @since: 2024-06-29
 */
@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public ResponseEntity<String> createCustomer(@RequestBody @Valid CustomerRequest request) {
        return  ResponseEntity.ok(customerService.createCustomer(request));
    }

    @PutMapping
    public ResponseEntity<Void> updateCustomer(@RequestBody @Valid CustomerRequest request) {
        customerService.updateCustomer(request);
        return ResponseEntity.accepted().build();
    }

    @GetMapping
    public ResponseEntity<List<CustomerResponse>> findAll() {
        return ResponseEntity.ok(customerService.findAllCustomers());
    }

    @GetMapping("/exist/{customerId}")
    public ResponseEntity<Boolean> existById(@PathVariable("customerId") String customerId) {
        return ResponseEntity.ok(customerService.existById(customerId));
    }


    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable("customerId") String customerId) {
        return ResponseEntity.ok(customerService.findById(customerId));
    }

    @DeleteMapping("/{customerId}")
    public ResponseEntity<Void> delete(@PathVariable("customerId") String customerId) {
        customerService.deleteCustomer(customerId);
        return ResponseEntity.accepted().build();
    }
}
