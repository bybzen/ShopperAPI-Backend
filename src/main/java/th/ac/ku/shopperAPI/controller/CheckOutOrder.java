package th.ac.ku.shopperAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.shopperAPI.model.Customer;
import th.ac.ku.shopperAPI.service.CustomerService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/customer")
public class CheckOutOrder {


    @Autowired
    private CustomerService service;

    @GetMapping
    public List<Customer> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Customer create(@RequestBody Customer customer) {
        return service.create(customer);
    }

    public CustomerService getService() {
        return service;
    }
    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable UUID id) {
        return service.getCustomer(id);
    }

    @DeleteMapping("/{id}")
    public Customer delete(@PathVariable UUID id) {
        return service.delete(id);
    }


    @PutMapping("/{id}")
    public Customer update(@PathVariable UUID id,
                           @RequestBody Customer customer) {
        return service.update(id, customer);
    }

}
