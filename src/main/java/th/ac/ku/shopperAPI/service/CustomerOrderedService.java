package th.ac.ku.shopperAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.shopperAPI.model.CustomerOrdered;
import th.ac.ku.shopperAPI.repository.CustomerOrderedRepository;

import java.util.List;

@Service
public class CustomerOrderedService {

    @Autowired
    private CustomerOrderedRepository repository;


    public List<CustomerOrdered> getAll() {
        return repository.findAll();
    }

    public CustomerOrdered create (CustomerOrdered customerOrdered) {
        repository.save(customerOrdered);
        return customerOrdered;
    }

    public CustomerOrdered getCustomerOrdered(String id) {
        return repository.findById(id).get();
    }


    public CustomerOrdered delete(String id) {
        CustomerOrdered record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }


    public CustomerOrdered update(String id, CustomerOrdered requestBody) {
        CustomerOrdered record = repository.findById(id).get();
        record.setStatus(requestBody.getStatus());
        record.setOrderedID(requestBody.getOrderedID());
        record.setUsername(requestBody.getUsername());

        //extends
//        record.setNameProduct(requestBody.getNameProduct());
//        record.setSize(requestBody.getSize());
//        record.setQuantity(requestBody.getQuantity());
//        record.setTotal(requestBody.getTotal());
//        record.setDateTime(requestBody.getDateTime());
//        record.setAddressCustomer(requestBody.getAddressCustomer());
        repository.save(record);

        return record;
    }

}
