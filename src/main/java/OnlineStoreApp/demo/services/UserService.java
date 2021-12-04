package OnlineStoreApp.demo.services;

import OnlineStoreApp.demo.SQL.UserDao;
import OnlineStoreApp.demo.model.CustomUserDetails;
import OnlineStoreApp.demo.model.LoggedUser;
import OnlineStoreApp.demo.model.User;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.net.PasswordAuthentication;
import java.sql.Connection;
import java.util.List;

@Service
public class UserService  {
    @Autowired
    private UserDao userDao;
    private  BCryptPasswordEncoder bCryptPasswordEncoder;

    public List<User> getUsers(){
        return userDao.getUsers();
    }


<<<<<<< HEAD
  /*  public UserDetails loadUserByEmail (Connection connection, String email) throws UsernameNotFoundException{
        User user = userDao.findByEmail(connection, email);
=======
    public UserDetails loadUserByEmail (Connection connection, String email) throws UsernameNotFoundException{
        User user = userDao.findByEmail(email);
>>>>>>> 8220e98 (login update)
        if (user ==null){
            throw new UsernameNotFoundException("User not found");
        }
        return new CustomUserDetails(user);
    }*/


    public UserDetails checkUserPasswordByEmail (Connection connection, String email, String password) throws Exception {
        User user = userDao.findByEmail(email);
        if (user.getPassword() != userDao.findPasswordByEmail(email, password)){
            throw new Exception("password does not match");
        }
        return new CustomUserDetails(user);
    }





    public User validateUser(User user){
//       if(!user.getFirstName().isEmpty() && !user.getLastName().isEmpty() &&
//        !user.getAddress().isEmpty() && !user.getEmail().isEmpty()){
       /* boolean userExists = userDao
                .findByEmail(user.getEmail())
                .isPresent;
        if (userExists){
            throw  new IllegalStateException("email already taken");
        }*/
       /* String encodedPassword = bCryptPasswordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);*/
            userDao.saveUser(user);
            return user;

    }

<<<<<<< HEAD
    public void validateLoggedUser (LoggedUser loggedUser){

    }
    public UserDetails loadUserByEmail (Connection connection, String email) throws UsernameNotFoundException{
        User user = userDao.findByEmail(connection, email);
        if (user ==null){
            throw new UsernameNotFoundException("User not found");
        }
        return new CustomUserDetails(user);
    }


    public UserDetails checkUserPasswordByEmail (Connection connection, String email, String password) throws Exception {
        User user = userDao.findByEmail(connection,email);
        if (password != userDao.findPasswordByEmail(connection, password)){
            throw new Exception("password does not match");
        }
        return new CustomUserDetails(user);
    }

    public boolean validateLoggedUser(){
        
     return true;
    }
=======

>>>>>>> 8220e98 (login update)

}
