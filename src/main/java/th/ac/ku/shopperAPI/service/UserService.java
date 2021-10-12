package th.ac.ku.shopperAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.shopperAPI.model.User;
import th.ac.ku.shopperAPI.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;


    public List<User> getAll() {
        return repository.findAll();
    }

    public User create (User user) {
        repository.save(user);
        return user;
    }

    public User getUser(int id) {
        return repository.findById(id).get();
    }


    public User delete(int id) {
        User record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }


    public User update(int id, User requestBody) {
        User record = repository.findById(id).get();
        record.setFirstName(requestBody.getFirstName());
        record.setAddress(requestBody.getAddress());
        record.setLastName(requestBody.getLastName());
        record.setUsername(requestBody.getUsername());
        record.setPassword(requestBody.getPassword());

        repository.save(record);

        return record;
    }





}
