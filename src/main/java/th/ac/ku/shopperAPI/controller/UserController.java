package th.ac.ku.shopperAPI.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.shopperAPI.model.User;
import th.ac.ku.shopperAPI.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService service;


    @GetMapping
    public List<User> getAll() {
        return service.getAll();
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return service.create(user);
    }

    public UserService getService() {
        return service;
    }
    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        return service.getUser(id);
    }

    @DeleteMapping("/{id}")
    public User delete(@PathVariable int id) {
        return service.delete(id);
    }


    @PutMapping("/{id}")
    public User update(@PathVariable int id,
                       @RequestBody User user) {
        return service.update(id, user);
    }




}
