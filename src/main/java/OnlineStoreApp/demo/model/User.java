package OnlineStoreApp.demo.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;


public class User {

    String role = "USER";
    long id;
    String firstName;
    String lastName;
    String address;
    String email;
<<<<<<< HEAD
    String password;

=======
   public String password;
//    String role;
//  Role role;
>>>>>>> 8220e98 (login update)


    public User(long id, String firstName, String lastName, String address, String email, String password){
        this.id=id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.password=password;


    }

    public User(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
