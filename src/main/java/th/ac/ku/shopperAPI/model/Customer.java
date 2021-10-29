package th.ac.ku.shopperAPI.model;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.UUID;


@Entity
public class Customer {

    @Id
    @GeneratedValue(generator = "UUID")
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(columnDefinition = "CHAR(36)")

    private UUID customerId;

    private String firstName;
    private String lastName;
    private String address;
    private String username;
    private String password;
    private String phone;
    private ArrayList<Items> itemCart = new ArrayList<>();

    public Customer() {

    }

    public void removeItemFromCart(Items item){
        itemCart.remove(item);
    }

    public void addItemToCart(Items item){
        itemCart.add(item);
    }

    public ArrayList<Items> getItemCart() {
        return itemCart;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    public String getPhone() {
        return phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
