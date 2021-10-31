package th.ac.ku.shopperAPI.model;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.UUID;


//ตะกร้า
public class CustomerOrder {
    private Customer itemCart;
    ArrayList<Items> itemList = new ArrayList<>();

    public void removeItemFromCart(Items item){
        itemList.remove(item);
    }
    public void addItemToCart(Items item){
        itemList.add(item);
    }

    public void setItemCart(Customer itemCart) {
        this.itemCart = itemCart;
    }

    public Customer getItemCart() {
        return itemCart;
    }

    public ArrayList<Items> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Items> itemList) {
        this.itemList = itemList;
    }
}
