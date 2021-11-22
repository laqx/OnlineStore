package OnlineStoreApp.demo.model;

public abstract class User {
    long id;
    String firstName;
    String lastName;
    String email;
    String password;


    public User(long id, String firstName, String lastName, String email, String password){
        this.id=id;
        this.firstName = firstName;
        this.lastName=lastName;
        this.email = email;
        this.password=password;

    }

}
