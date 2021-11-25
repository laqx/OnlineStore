package OnlineStoreApp.demo.dataBaseAccessObjects;

import OnlineStoreApp.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.List;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // request data from mySQL
    public List<User> getUsers() {
        RowMapper<User> rowMapper = (resultSet, rowNumber) -> mapUser(resultSet);
        return jdbcTemplate.query("SELECT * FROM users", rowMapper);
    }

    // mapping response from mySQL to object
    private User mapUser(ResultSet resultSet) throws SQLException {
        User user = new User();

        user.setId(resultSet.getLong("id"));
        user.setFirstName(resultSet.getString("firstname"));
        user.setLastName(resultSet.getString("lastname"));
        user.setAddress(resultSet.getString("address"));
        user.setEmail(resultSet.getString("email"));
        user.setPassword(resultSet.getString("password"));
        user.setPassword(resultSet.getString("role"));

        return user;
    }

    public void saveUser(User user){

        jdbcTemplate.update("INSERT INTO users (firstname, lastname,  address, email, password, role) VALUES (?,?,?,?, '123', ?)",
        user.getFirstName(), user.getLastName(), user.getAddress(), user.getEmail(), user.getPassword(), user.getRole());

    }
}