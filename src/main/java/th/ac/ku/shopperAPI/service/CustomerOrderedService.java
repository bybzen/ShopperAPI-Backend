package th.ac.ku.shopperAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import th.ac.ku.shopperAPI.model.CustomerOrdered;
import th.ac.ku.shopperAPI.repository.CustomerOrderedRepository;

import java.util.List;
import java.util.UUID;

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

    public CustomerOrdered getCustomerOrdered(String username) {
        return repository.findById(username).get();
    }


    public CustomerOrdered delete(String username) {
        CustomerOrdered record = repository.findById(username).get();
        repository.deleteById(username);
        return record;
    }


    public CustomerOrdered update( String username, CustomerOrdered requestBody) {
        CustomerOrdered record = repository.findById(username).get();
        record.setPurchaseOrderId(record.getPurchaseOrderId());
        record.setUsername(requestBody.getUsername());
        record.setTotal(record.getTotal());
        record.setStatus(requestBody.getStatus());
        record.setDateTime(record.getDateTime());

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
