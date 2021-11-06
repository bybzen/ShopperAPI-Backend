package th.ac.ku.shopperAPI.model;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

//ประวัติ
@Entity
public class CustomerOrdered {

    @Id
    private String purchaseOrderId;
    private String username;
    private String nameProduct;
    private float price;
    private int quantity;
    private String size;
    private String imgSrc;
//    @GeneratedValue(generator = "UUID")
//    @Type(type = "org.hibernate.type.UUIDCharType")
//    @Column(columnDefinition = "CHAR(36)")
//    private Integer orderedID;

    public String getImgSrc() {
        return imgSrc;
    }

    private String status;
    private String dateTime;
    private float total;

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getTotal() {
        return total;
    }

    public void setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

//    public void setOrderedID(Integer orderedID) {
//        this.orderedID = orderedID;
//    }
//
//    public Integer getOrderedID() {
//        return orderedID;
//    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
