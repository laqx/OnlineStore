package OnlineStoreApp.demo.SQL;

import java.sql.*;

public class SQLAddToDatabase {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(

//            "jdbc:mysql://localhost:3306/OnlineStore", "root", "Oxford1984");
//            "jdbc:mysql://localhost:3306/onlinestore ", "root", "root");
           "jdbc:mysql://localhost:1800/onlinestore", "root", "admin");

//            addNewProduct(con, "roses", 3.00, 1, 55, 1);
//            addNewSubCategory(con, "candles");
//            fetchCategory(con);

        } catch (Exception err) {
            System.out.println(err);
        }
    }
//
//    public static void addNewProduct(Connection connection, String title, Double price, int quantity, int subcategory_id_p, String description) {
//
//        String insertNewProduct = "INSERT INTO product(title, price, quantity, subcategory_id_p, description) VALUES(?,?,?,?,?)";
//        try (PreparedStatement insertQuery = connection.prepareStatement(insertNewProduct)) {
//            insertQuery.setString(1, title);
//            insertQuery.setDouble(2, price);
//            insertQuery.setInt(3, quantity);
//            insertQuery.setInt(4, subcategory_id_p);
//            insertQuery.setString(5, description);
//
//            insertQuery.executeUpdate();
//        } catch (SQLException err) {
//            err.printStackTrace();
//        }
//    }
//
//    public static void addNewSubCategory(Connection connection, String name) {
//
//        String insertNewSubCategory = "INSERT INTO subcategory(name) VALUES(?)";
//        try (PreparedStatement insertQuery = connection.prepareStatement(insertNewSubCategory)) {
//            insertQuery.setString(1, name);
//
//            insertQuery.executeUpdate();
//        } catch (SQLException err) {
//            err.printStackTrace();
//        }
//    }
//
//        public static void fetchCategory(Connection connection) {
//        String query = "select category.id, category.name, subcategory.name from category inner join subcategory on subcategory.id = category.subcategory_id";
//
//        try{
//            Statement statement = connection.createStatement();
//            ResultSet rs = statement.executeQuery(query);
//
//            while(rs.next())
//                System.out.println("Category " +rs.getString(2)+" has subcategory "+rs.getString(2));
//        }catch(SQLException err){
//            System.out.println(err);
//        }
//    }
}
