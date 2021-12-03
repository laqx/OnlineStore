package OnlineStoreApp.demo.services;

import OnlineStoreApp.demo.SQL.UserDao;
import OnlineStoreApp.demo.model.CustomUserDetails;
import OnlineStoreApp.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
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


    public UserDetails loadUserByEmail (Connection connection, String email) throws UsernameNotFoundException{
        User user = userDao.findByEmail(connection, email);
        if (user ==null){
            throw new UsernameNotFoundException("User not found");
        }
        return new CustomUserDetails(user);
    }

    public User validateUser(User user){
//       if(!user.getFirstName().isEmpty() && !user.getLastName().isEmpty() &&
//        !user.getAddress().isEmpty() && !user.getEmail().isEmpty()){

            userDao.saveUser(user);
            return user;

    }
    public UserDetails loadUserByName (Connection connection, String name) throws UsernameNotFoundException{
        User user = (User) userDao.findUserByName(name);
        if (user ==null){
            throw new UsernameNotFoundException("User not found");
        }
        return new CustomUserDetails(user);
    }
}
