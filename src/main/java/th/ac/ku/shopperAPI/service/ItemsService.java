package th.ac.ku.shopperAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.shopperAPI.model.Items;
import th.ac.ku.shopperAPI.repository.ItemsRepository;

import java.util.List;
import java.util.UUID;

@Service
public class ItemsService {

    @Autowired
    private ItemsRepository repository;

    public List<Items> getAll() {
        return repository.findAll();
    }


    public Items create (Items items) {
        repository.save(items);
        return items;
    }

    public Items getItems(UUID id) {
        return repository.findById(id).get();
    }


    public Items delete(UUID id) {
        Items record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }


    public Items update(UUID id, Items requestBody) {
        Items record = repository.findById(id).get();

        if (requestBody.getNameProduct() != null){
            record.setNameProduct(requestBody.getNameProduct());
        }
        if (requestBody.getPrice() >= 0){
            record.setPrice(requestBody.getPrice());
        }
        if (requestBody.getBrand() != null){
            record.setBrand(requestBody.getBrand());
        }
        if (requestBody.getSize() != null){
            record.setSize(requestBody.getSize());
        }
        if (requestBody.getType() != null){
            record.setType(requestBody.getType());
        }
        if (requestBody.getQuantity() >= 0) {
            record.setQuantity(requestBody.getQuantity());
        }

        repository.save(record);

        return record;
    }

}
