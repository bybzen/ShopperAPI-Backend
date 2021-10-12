package th.ac.ku.shopperAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.shopperAPI.model.Admin;
import th.ac.ku.shopperAPI.model.User;
import th.ac.ku.shopperAPI.repository.AdminRepository;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminRepository repository;

    public List<Admin> getAll(){  // ดึงข้อมูล Admin ทั้งหมดออกมาเป็น List
        return repository.findAll(); //
    }

    public Admin create (Admin admin) { // ส่ง Odj Admin
        repository.save(admin); // insert or update to repository
        return admin;
    }


}
