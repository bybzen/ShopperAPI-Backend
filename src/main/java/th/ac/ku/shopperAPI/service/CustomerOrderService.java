package th.ac.ku.shopperAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.shopperAPI.model.CustomerOrder;
import th.ac.ku.shopperAPI.repository.CustomerOrderRepository;


import java.util.List;
import java.util.UUID;

@Service
public class CustomerOrderService {

    @Autowired
    private CustomerOrderRepository repository;


    public List<CustomerOrder> getAll() {
        return repository.findAll();
    }

    public CustomerOrder create (CustomerOrder customerOrder) {
        repository.save(customerOrder);
        return customerOrder;
    }

    public CustomerOrder getCustomerOrder(UUID id) {
        return repository.findById(id).get();
    }


    public CustomerOrder delete(UUID id) {
        CustomerOrder record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }


    public CustomerOrder update(UUID id, CustomerOrder requestBody) {
        CustomerOrder record = repository.findById(id).get();
        record.setCustomerOrderId(requestBody.getCustomerOrderId());
        record.setItemList(requestBody.getItemList());
        repository.save(record);

        return record;
    }





}

