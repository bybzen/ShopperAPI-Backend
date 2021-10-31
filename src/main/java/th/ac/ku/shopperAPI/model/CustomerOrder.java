package th.ac.ku.shopperAPI.model;

import java.util.ArrayList;
//ตะกร้า

public class CustomerOrder {

    ArrayList<Items> itemList = new ArrayList<>();

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
