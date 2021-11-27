package OnlineStoreApp.demo.services;

import OnlineStoreApp.demo.SQL.UserDao;
import OnlineStoreApp.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public List<User> getUsers(){
        return userDao.getUsers();
    }

    public User validateUser(User user){
//       if(!user.getFirstName().isEmpty() && !user.getLastName().isEmpty() &&
//        !user.getAddress().isEmpty() && !user.getEmail().isEmpty()){

            userDao.saveUser(user);
            return user;

    }
}
