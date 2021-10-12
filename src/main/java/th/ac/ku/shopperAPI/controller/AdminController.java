package th.ac.ku.shopperAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.shopperAPI.model.Admin;
import th.ac.ku.shopperAPI.model.User;
import th.ac.ku.shopperAPI.service.AdminService;
import th.ac.ku.shopperAPI.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/admin")

public class AdminController {

    @Autowired
    private AdminService service;


    @GetMapping // คืนค่า Admin ทั้งหมด
    public List<Admin> getAll() {
        return service.getAll();
    }

    @PostMapping // insert
    public Admin create(@RequestBody Admin admin) {
        return service.create(admin);
    }

//    public UserService getService() {
//        return service;
//    }
//
//    @GetMapping("/{id}")
//    public User getUser(@PathVariable int id) {
//        return service.getUser(id);
//    }
//
//    @DeleteMapping("/{id}")
//    public User delete(@PathVariable int id) {
//        return service.delete(id);
//    }


}
