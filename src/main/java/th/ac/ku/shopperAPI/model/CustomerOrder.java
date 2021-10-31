package th.ac.ku.shopperAPI.model;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.UUID;

//ตะกร้า
@Entity
public class CustomerOrder {
    @Id
    @GeneratedValue(generator = "UUID")
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(columnDefinition = "CHAR(36)")

    private UUID itemCartID;

    //fk
    private String customerOrderId;
    private ArrayList<Items> itemList = new ArrayList<>();


    public UUID getItemCartID() {
        return itemCartID;
    }

    public String getCustomerOrderId() {
        return customerOrderId;
    }

    public void setItemCartID(UUID itemCartID) {
        this.itemCartID = itemCartID;
    }

    public void setCustomerOrderId(String customerId) {
        this.customerOrderId = customerId;
    }

    public void removeItemFromCart(Items item){
        itemList.remove(item);
    }
    public void addItemToCart(Items item){
        itemList.add(item);
    }

    public ArrayList<Items> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Items> itemList) {
        this.itemList = itemList;
    }
}
