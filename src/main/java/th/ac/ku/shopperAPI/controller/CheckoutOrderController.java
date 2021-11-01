package th.ac.ku.shopperAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import th.ac.ku.shopperAPI.model.CheckoutOrder;
import th.ac.ku.shopperAPI.service.CheckoutOrderService;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/checkout")
public class CheckoutOrderController {
    @Autowired
    private CheckoutOrderService service;


    @GetMapping
    public List<CheckoutOrder> getAll() {
        return service.getAll();
    }

    @PostMapping
    public CheckoutOrder create(@RequestBody CheckoutOrder checkoutOrder) {
        return service.create(checkoutOrder);
    }

    public CheckoutOrderService getService() {
        return service;
    }
    @GetMapping("/{id}")
    public CheckoutOrder getCheckoutOrder(@PathVariable UUID id) {
        return service.getCheckoutOrder(id);
    }

    @DeleteMapping("/{id}")
    public CheckoutOrder delete(@PathVariable UUID id) {
        return service.delete(id);
    }


    @PutMapping("/{id}")
    public CheckoutOrder update(@PathVariable UUID id,
                           @RequestBody CheckoutOrder checkoutOrder) {
        return service.update(id, checkoutOrder);
    }




}

