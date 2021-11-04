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
public class CheckoutOrder {  // หน้า Check out มั้ง

    @Id
    private String purchaseOrderId;
    private String nameProduct;
    private float cost; // ราคาจ่ายทั้งหมด
    private String size;
    private int quantity;
    private String dateTime; //เวลาที่ทำการสั่ง
    private String addressCustomer;


    //fk
    private String username;
    private ArrayList<Items> itemList = new ArrayList<>();

    public CheckoutOrder() {

    }

    public void setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public String getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public float getCost() {
        return cost;
    }

    public String getSize() {
        return size;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
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


    @Override
    public String toString() {
        return "CheckOutOrder{" +
                "purchaseOrderId=" + purchaseOrderId +
                ", nameProduct='" + nameProduct + '\'' +
                ", cost=" + cost +
                ", size='" + size + '\'' +
                ", quantity=" + quantity +
                ", dateTime='" + dateTime + '\'' +
                ", addressCustomer='" + addressCustomer + '\'' +
                '}';
    }
}
