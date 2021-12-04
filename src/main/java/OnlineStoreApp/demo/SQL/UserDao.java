package OnlineStoreApp.demo.SQL;

import OnlineStoreApp.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import java.io.PrintStream;
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
//        user.setPassword(resultSet.getString("role"));

        return user;
    }

    public void saveUser(User user) {

        jdbcTemplate.update("INSERT INTO users (firstname, lastname,  address, email, password) VALUES (?,?,?,?,?)",
                user.getFirstName(), user.getLastName(), user.getAddress(), user.getEmail(), user.getPassword());



    }

<<<<<<< HEAD
    public User findByEmail(Connection connection, String email) {
        String query = "SELECT * FROM users WHERE email = ?";
=======
  /*  public User findByEmail (Connection connection, String email){
        String query ="SELECT * FROM users WHERE email = ?";
>>>>>>> 8220e98 (login update)
        User user = new User();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, email);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                user.setEmail(rs.getString("email"));

            }
        } catch (SQLException var5) {
        }
        return user;
    }

    //    @Query("SELECT FROM users WHERE u.name = :name")
//    public User getUserByName(@Param("name") String name) {
//        User user = new User();
//        return user;
//    }
    public List<User> findUserByName(String name) {
        RowMapper<User> rowMapper = (rs, rowNumber) -> mapUser(rs);
        return jdbcTemplate.query("SELECT * FROM users WHERE name = ?", rowMapper, name);
    }
    public String findPasswordByEmail (Connection connection, String password){
        String query ="SELECT password FROM users WHERE email = ?";
        User user = new User();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, password);
            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()) {
                user.setPassword(rs.getString("password")); ;

            }
        } catch (SQLException var5) {
        }
<<<<<<< HEAD
        return password;
=======
     return user;
    }*/

    public User findByEmail(String email){
        String query ="SELECT * FROM users WHERE email = ?";
        User user = new User();
        try {
            Connection connection = DriverManager.getConnection(

//            "jdbc:mysql://localhost:3306/OnlineStore", "root", "Oxford1984");
                    "jdbc:mysql://localhost:3306/onlinestore ", "root", "root");
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, email);
            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()) {
                user.setEmail(rs.getString("email")) ;

            }
        } catch (SQLException var5) {
        }
        return user;

>>>>>>> 8220e98 (login update)
    }
    public String findPasswordByEmail (String email, String password){
        String query ="SELECT password FROM onlinestore.users where email=?";
        User user = new User();
        try {
            Connection connection = DriverManager.getConnection(

//            "jdbc:mysql://localhost:3306/OnlineStore", "root", "Oxford1984");
                    "jdbc:mysql://localhost:3306/onlinestore ", "root", "root");
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, password);
            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()) {
                user.setEmail(rs.getString("password")) ;

            }
        } catch (SQLException var5) {
        } return password;



    }

       /* BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);*/

}