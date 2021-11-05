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

    @GetMapping("/{username}")
    public CustomerOrdered getCustomerOrdered (@PathVariable String username) {
        return service.getCustomerOrdered(username);
    }

    @DeleteMapping("/{username}")
    public CustomerOrdered delete(@PathVariable String username) {
        return service.delete(username);
    }


    @PutMapping("/{username}")
    public CustomerOrdered update(@PathVariable String username,
                                @RequestBody CustomerOrdered customerOrdered) {
        return service.update(username, customerOrdered);
    }




}

