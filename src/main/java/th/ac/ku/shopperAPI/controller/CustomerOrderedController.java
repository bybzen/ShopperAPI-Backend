package th.ac.ku.shopperAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.shopperAPI.model.CheckOutOrder;
import th.ac.ku.shopperAPI.model.Customer;
import th.ac.ku.shopperAPI.model.CustomerOrdered;
import th.ac.ku.shopperAPI.service.CheckOutOrderService;
import th.ac.ku.shopperAPI.service.CustomerOrderedService;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/ordered")
public class CustomerOrderedController {
    @Autowired
    private CustomerOrderedService service;


    @GetMapping
    public List<CustomerOrdered> getAll() {
        return service.getAll();
    }

    @PostMapping
    public CustomerOrdered create(@RequestBody CustomerOrdered customerOrdered) {
        return service.create(customerOrdered);
    }

    public CustomerOrderedService getService() {
        return service;
    }

    @GetMapping("/{id}")
    public CustomerOrdered getCustomerOrdered (@PathVariable UUID id) {
        return service.getCustomerOrdered(id);
    }

    @DeleteMapping("/{id}")
    public CustomerOrdered delete(@PathVariable UUID id) {
        return service.delete(id);
    }


    @PutMapping("/{id}")
    public CustomerOrdered update(@PathVariable UUID id,
                                @RequestBody CustomerOrdered customerOrdered) {
        return service.update(id, customerOrdered);
    }




}

