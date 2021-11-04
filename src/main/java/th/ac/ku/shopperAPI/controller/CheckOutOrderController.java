package th.ac.ku.shopperAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import th.ac.ku.shopperAPI.model.CheckOutOrder;
import th.ac.ku.shopperAPI.service.CheckOutOrderService;

import java.util.List;


@RestController
@RequestMapping("/checkout")
public class CheckOutOrderController {
    @Autowired
    private CheckOutOrderService service;


    @GetMapping
    public List<CheckOutOrder> getAll() {
        return service.getAll();
    }

    @PostMapping
    public CheckOutOrder create(@RequestBody CheckOutOrder checkoutOrder) {
        return service.create(checkoutOrder);
    }

    public CheckOutOrderService getService() {
        return service;
    }

    @GetMapping("/{id}")
    public CheckOutOrder getCheckoutOrder(@PathVariable String id) {
        return service.getCheckoutOrder(id);
    }

    @DeleteMapping("/{id}")
    public CheckOutOrder delete(@PathVariable String id) {
        return service.delete(id);
    }


    @PutMapping("/{id}")
    public CheckOutOrder update(@PathVariable String id,
                                @RequestBody CheckOutOrder checkoutOrder) {
        return service.update(id, checkoutOrder);
    }




}

