package th.ac.ku.shopperAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.shopperAPI.model.Admin;
import th.ac.ku.shopperAPI.repository.AdminRepository;

import java.util.List;
import java.util.UUID;

@Service
public class AdminService {



    @Autowired
    private AdminRepository repository;

    public List<Admin> getAll(){  // ดึงข้อมูล Admin ทั้งหมดออกมาเป็น List
        return repository.findAll(); //
    }

        public Admin create(Admin admin) { // ส่ง Odj Admin
//        Admin record = repository.findById(id).get();
        repository.save(admin); // insert or update to repository
//        admin.setFirstName("admin02");
//        admin.setLastName("shopper02");
//        admin.setUsername("admin02");
//        admin.setPassword("2222");
//        repository.save(admin);
        return admin;
    }

//    public Admin create(Admin admin) { // ส่ง Odj Admin
////        Admin record = repository.findById(id).get();
////        repository.save(admin); // insert or update to repository
//        admin.setFirstName("admin02");
//        admin.setLastName("shopper02");
//        admin.setUsername("admin02");
//        admin.setPassword("2222");
//        repository.save(admin);
//        return admin;
//    }

//    public Admin create(UUID id,Admin admin) { // แก้ไขข้อมูล ;ข้อมูลที่จะใส่
//        Admin record = repository.findById(id).get(); // ดึงข้อมูลใน Database
//        record.setFirstName("admin02");
//        record.setLastName("shopper02");
//        record.setUsername("admin02");
//        record.setPassword("2222");
//        repository.save(record); // เก็บลง Database ;return ค่าที่ update เป็นข้อมูลเดียวกับ record
//        return record;
//    }




    public Admin getAdmin(UUID id) {
        return repository.findById(id).get();
    }

    public Admin delete(UUID id) {
        Admin record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }

    public Admin update(UUID id, Admin requestBody) { // แก้ไขข้อมูล ;ข้อมูลที่จะใส่
        Admin record = repository.findById(id).get(); // ดึงข้อมูลใน Database
        if (requestBody.getFirstName() != null)
            record.setFirstName(requestBody.getFirstName());

        if (requestBody.getLastName() != null)
            record.setLastName(requestBody.getLastName());

        if (requestBody.getUsername() != null)
            record.setUsername(requestBody.getUsername());

        if (requestBody.getPassword() != null)
            record.setPassword(requestBody.getPassword());

        repository.save(record); // เก็บลง Database ;return ค่าที่ update เป็นข้อมูลเดียวกับ record

        return record;
    }




}
