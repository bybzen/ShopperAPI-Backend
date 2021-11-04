package th.ac.ku.shopperAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import th.ac.ku.shopperAPI.model.CheckoutOrder;
import th.ac.ku.shopperAPI.model.Customer;
import th.ac.ku.shopperAPI.repository.CheckoutOrderRepository;


import java.util.List;
import java.util.UUID;

@Service
public class CheckoutOrderService {

    @Autowired
    private CheckoutOrderRepository repository;


    public List<CheckoutOrder> getAll() {
        return repository.findAll();
    }

    public CheckoutOrder create (CheckoutOrder checkoutOrder) {
        repository.save(checkoutOrder);
        return checkoutOrder;
    }

    public CheckoutOrder getCheckoutOrder(String id) {
        return repository.findById(id).get();
    }


    public CheckoutOrder delete(String id) {
        CheckoutOrder record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }


    public CheckoutOrder update(String id, CheckoutOrder requestBody) {
        CheckoutOrder record = repository.findById(id).get();
        record.setNameProduct(requestBody.getNameProduct());
        record.setSize(requestBody.getSize());
        record.setQuantity(requestBody.getQuantity());
        record.setCost(requestBody.getCost());
        record.setDateTime(requestBody.getDateTime());
        record.setAddressCustomer(requestBody.getAddressCustomer());
        repository.save(record);

        return record;
    }






}

