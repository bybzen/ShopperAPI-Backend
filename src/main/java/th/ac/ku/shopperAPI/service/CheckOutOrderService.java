package th.ac.ku.shopperAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.PathVariable;
import th.ac.ku.shopperAPI.model.CheckOutOrder;
import th.ac.ku.shopperAPI.repository.CheckOutOrderRepository;


import java.util.List;
import java.util.UUID;

@Service
public class CheckOutOrderService {

    @Autowired
    private CheckOutOrderRepository repository;


    public List<CheckOutOrder> getAll() {
        return repository.findAll();
    }

    public CheckOutOrder create (CheckOutOrder checkoutOrder) {
        repository.save(checkoutOrder);
        return checkoutOrder;
    }

    public CheckOutOrder getCheckoutOrder(@PathVariable UUID id) {
        return repository.findById(id).get();
    }


    public CheckOutOrder delete(@PathVariable UUID id) {
        CheckOutOrder record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }


    public CheckOutOrder update(@PathVariable UUID id, CheckOutOrder requestBody) {
        CheckOutOrder record = repository.findById(id).get();
        record.setNameProduct(requestBody.getNameProduct());
        record.setPrice(requestBody.getPrice());
        record.setSize(requestBody.getSize());
        record.setQuantity(requestBody.getQuantity());
        record.setTotal(requestBody.getTotal());
        record.setDateTime(requestBody.getDateTime());
        record.setAddressCustomer(requestBody.getAddressCustomer());
        repository.save(record);

        return record;
    }






}

