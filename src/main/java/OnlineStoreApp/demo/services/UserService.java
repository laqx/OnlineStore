package OnlineStoreApp.demo.services;

import OnlineStoreApp.demo.SQL.UserDao;
import OnlineStoreApp.demo.model.CustomUserDetails;
import OnlineStoreApp.demo.model.LoggedUser;
import OnlineStoreApp.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> getUsers(){
        return userDao.getUsers();
    }


  /*  public UserDetails loadUserByEmail (Connection connection, String email) throws UsernameNotFoundException{
        User user = userDao.findByEmail(connection, email);
        if (user ==null){
            throw new UsernameNotFoundException("User not found");
        }
        return new CustomUserDetails(user);
    }*/

    public User validateUser(User user){
//       if(!user.getFirstName().isEmpty() && !user.getLastName().isEmpty() &&
//        !user.getAddress().isEmpty() && !user.getEmail().isEmpty()){

            userDao.saveUser(user);
            return user;

    }
 public User loadUserByEmail (String email){
        User userSQL = userDao.findByEmail(email);
        return userSQL;
    }
    public User loadUserByPassword (String password){
        User userSQL = userDao.findByPassword(password);
        return userSQL;
    }
   /* public User loadUserByEmail (String email) throws Exception{
        User userSQL = userDao.findByEmail(email);
        if (userSQL ==null){
            throw new Exception("email not found");
        }
        return userSQL;
    }
    public User loadUserByPassword (String password) throws Exception{

        User userSQL = userDao.findByPassword(password);
        if (userSQL ==null){
            throw new Exception("password not found");
        }
        return userSQL;
    }*/


   /* public User checkUserPasswordByEmail (Connection connection,  String password) throws Exception {
        User userSQL = userDao.findByEmail(connection,password);
        if (password != userDao.findPasswordByEmail(connection, password)){
            throw new Exception("password does not match");
        }
        return userSQL;
    }*/

    /*public boolean validateLoggedUser(Connection connection, String email, String password){
        if (loadUserByEmail(userDao.findByEmail(connection, email) ==loadUserByPassword(userDao.findByPassword(connection, password)))
        
     return true;
    }*/

}
