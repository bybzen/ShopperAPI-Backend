package th.ac.ku.shopperAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.shopperAPI.model.Customer;
import th.ac.ku.shopperAPI.model.CustomerOrder;
import th.ac.ku.shopperAPI.service.CustomerOrderService;
import th.ac.ku.shopperAPI.service.CustomerService;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/customerOrder")
public class CustomerOrderController {
    @Autowired
    private CustomerOrderService service;


    @GetMapping
    public List<CustomerOrder> getAll() {
        return service.getAll();
    }

    @PostMapping
    public CustomerOrder create(@RequestBody CustomerOrder customerOrder) {
        return service.create(customerOrder);
    }

    public CustomerOrderService getService() {
        return service;
    }
    @GetMapping("/{id}")
    public CustomerOrder getCustomerOrder(@PathVariable UUID id) {
        return service.getCustomerOrder(id);
    }

    @DeleteMapping("/{id}")
    public CustomerOrder delete(@PathVariable UUID id) {
        return service.delete(id);
    }


    @PutMapping("/{id}")
    public CustomerOrder update(@PathVariable UUID id,
                           @RequestBody CustomerOrder customerOrder) {
        return service.update(id, customerOrder);
    }




}

