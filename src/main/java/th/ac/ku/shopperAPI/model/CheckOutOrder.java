package th.ac.ku.shopperAPI.model;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class CheckOutOrder {  // หน้า Check out มั้ง

    @Id
    @GeneratedValue(generator = "UUID")
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(columnDefinition = "CHAR(36)")

    private UUID purchaseOrderId;
    private String nameProduct;
    private float cost; // ราคาจ่ายทั้งหมด
    private String size;
    private int quantity;
    private String dateTime; //เวลาที่ทำการสั่ง
    private String addressCustomer;
    private String status;

    public CheckOutOrder() {

    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public UUID getPurchaseOrderId() {
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
                ", status='" + status + '\'' +
                '}';
    }
}
