package th.ac.ku.shopperAPI.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // กำหนดว่าใน Database จะสร้างตารางที่ชื่อว่า Admin (ถ้ายังไม่มีตารางชื่อ Admin)
        // และ Map ข้อมูลในตารางมาเป็น Obj ในอัตโนมัติ
public class Admin {

    @Id // กำหนดว่า Id เป็น Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ให้ JPA สร้าง Id ให้
    private int id;

    private String firstName;
    private String lastName;
    private String username;
    private String password;


      public int getId() {
          return id;
      }

      public void setId(int id) {
          this.id = id;
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
  }
