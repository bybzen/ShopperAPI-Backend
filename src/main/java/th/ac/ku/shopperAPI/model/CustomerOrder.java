package th.ac.ku.shopperAPI.model;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.UUID;

public class CustomerOrder {  // ตะกร้าสินค้า


    private ArrayList<Items> itemCart = new ArrayList<>();

    public void removeItemFromCart(Items item){
        itemCart.remove(item);
    }

    public void addItemToCart(Items item){
        itemCart.add(item);
    }

    public ArrayList<Items> getItemCart() {
        return itemCart;
    }



}
