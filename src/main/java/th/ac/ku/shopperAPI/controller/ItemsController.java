package th.ac.ku.shopperAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.shopperAPI.model.Customer;
import th.ac.ku.shopperAPI.model.Items;
import th.ac.ku.shopperAPI.service.CustomerService;
import th.ac.ku.shopperAPI.service.ItemsService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/items")
public class ItemsController {

        @Autowired
        private ItemsService service;


        @GetMapping
        public List<Items> getAll() {
            return service.getAll();
        }

        @PostMapping
        public Items create(@RequestBody Items items) {
            return service.create(items);
        }

        public ItemsService getService() {
            return service;
        }

        @GetMapping("/{id}")
        public Items getItems(@PathVariable UUID id) {
            return service.getItems(id);
        }

        @DeleteMapping("/{id}")
        public Items delete(@PathVariable UUID id ) {
            return service.delete(id);
        }


        @PutMapping("/{id}")
        public  Items update( @PathVariable UUID id, @RequestBody Items items) {
            return service.update(id, items);
        }
}
