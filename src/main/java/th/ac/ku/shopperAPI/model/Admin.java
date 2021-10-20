package th.ac.ku.shopperAPI.model;
import org.hibernate.annotations.Type;
import javax.persistence.*;
import java.util.UUID;

@Entity // กำหนดว่าใน Database จะสร้างตารางที่ชื่อว่า Admin (ถ้ายังไม่มีตารางชื่อ Admin)
        // และ Map ข้อมูลในตารางมาเป็น Obj ในอัตโนมัติ
public class Admin {

//    @Id // กำหนดว่า Id เป็น Primary Key
//    @GeneratedValue(strategy = GenerationType.IDENTITY) // ให้ JPA สร้าง Id ให้

    @Id
    @GeneratedValue(generator = "UUID")
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(columnDefinition = "CHAR(36)")

    private UUID adminId;

    private String firstName;
    private String lastName;
    private String username;
    private String password;


    public UUID getAdminId() {
        return adminId;
    }

    public void setAdminId(UUID adminId) {
        this.adminId = adminId;
    }

    public String getFirstName() {
          return firstName;
      }

      public void setFirstName(String firstName) {
          this.firstName = firstName;
      }

      public String getLastName() {
          return lastName;
      }

      public void setLastName(String lastName) {
          this.lastName = lastName;
      }

      public String getUsername() {
          return username;
      }

      public void setUsername(String username) {
          this.username = username;
      }

      public String getPassword() {
          return password;
      }

      public void setPassword(String password) {
          this.password = password;
      }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + adminId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
