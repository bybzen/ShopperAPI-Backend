package th.ac.ku.shopperAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.shopperAPI.model.Customer;
import th.ac.ku.shopperAPI.repository.CustomerRepository;

import java.util.List;
import java.util.UUID;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;


    public List<Customer> getAll() {
        return repository.findAll();
    }

    public Customer create (Customer customer) {
        repository.save(customer);
        return customer;
    }

    public Customer getCustomer(UUID id) {
        return repository.findById(id).get();
    }


    public Customer delete(UUID id) {
        Customer record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }


    public Customer update(UUID id, Customer requestBody) {
        Customer record = repository.findById(id).get();
        record.setFirstName(requestBody.getFirstName());
        record.setAddress(requestBody.getAddress());
        record.setLastName(requestBody.getLastName());
        record.setUsername(requestBody.getUsername());
        record.setPassword(requestBody.getPassword());
        record.setPhone(requestBody.getPhone());

        repository.save(record);

        return record;
    }





}
