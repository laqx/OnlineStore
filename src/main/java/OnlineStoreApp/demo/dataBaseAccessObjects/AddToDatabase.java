package OnlineStoreApp.demo.dataBaseAccessObjects;

import java.sql.*;

public class AddToDatabase {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                   "jdbc:mysql://localhost:3306/OnlineStore", "root", "Oxford1984");
//            "jdbc:mysql://localhost:3306/onlinestore ", "root", "root");
//            addNewProduct(con, "roses", 3.00, 1, 55, 1);
//            addNewSubCategory(con, "candles");
//            fetchCategory(con);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void addNewProduct(Connection connection, String title, Double price, int users_id, int quantity, int subcategory_id) {

        String insertNewProduct = "INSERT INTO product(title, price, users_id, quantity, subcategory_id) VALUES(?,?,?,?,?)";
        try (PreparedStatement insertQuery = connection.prepareStatement(insertNewProduct)) {
            insertQuery.setString(1, title);
            insertQuery.setDouble(2, price);
            insertQuery.setInt(3, users_id);
            insertQuery.setInt(4, quantity);
            insertQuery.setInt(5, subcategory_id);

            insertQuery.executeUpdate();
        } catch (SQLException err) {
            err.printStackTrace();
        }
    }

    public static void addNewSubCategory(Connection connection, String name) {

        String insertNewSubCategory = "INSERT INTO subcategory(name) VALUES(?)";
        try (PreparedStatement insertQuery = connection.prepareStatement(insertNewSubCategory)) {
            insertQuery.setString(1, name);

            insertQuery.executeUpdate();
        } catch (SQLException err) {
            err.printStackTrace();
        }
    }

        public static void fetchCategory(Connection conn) {
        String query = "select category.id, category.name, subcategory.name from category inner join subcategory on subcategory.id = category.subcategory_id";

        try{
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while(rs.next())
                System.out.println("Category " +rs.getString(2)+" has subcategory "+rs.getString(2));
        }catch(SQLException ex){

        }
    }
}
