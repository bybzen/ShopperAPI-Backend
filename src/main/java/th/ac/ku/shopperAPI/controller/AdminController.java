package th.ac.ku.shopperAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.shopperAPI.model.Admin;
import th.ac.ku.shopperAPI.service.AdminService;
import java.util.List;
import java.util.UUID;

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
        System.out.println(admin.toString()); // ดูข้อมูล
        return service.create(admin);

    }

    public AdminService getService() {
        return service;
    }

    @GetMapping("/{id}")  // Get ข้อมูลตาม Id
    public Admin getAdmin(@PathVariable UUID id) {
        return service.getAdmin(id);
    }

    @DeleteMapping("/{id}")
    public Admin delete(@PathVariable UUID id) {
        return service.delete(id);
    }

    @PutMapping("/{id}")
    public Admin update(@PathVariable UUID id,
                       @RequestBody Admin admin) {
        return service.update(id, admin);
    }

}
