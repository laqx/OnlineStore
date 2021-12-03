package OnlineStoreApp.demo.SQL;

import OnlineStoreApp.demo.model.Category;
import OnlineStoreApp.demo.model.Product;
import OnlineStoreApp.demo.model.Subcategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.sql.*;
import java.util.List;

@Repository
public class ProductDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Category> getCategories(){
        RowMapper<Category> rowMapper = (resultSet, rowNumber) -> mapCategory(resultSet);
        return jdbcTemplate.query("SELECT * FROM category", rowMapper);
    }

    private Category mapCategory(ResultSet resultSet) throws SQLException {
        Category category = new Category();

        category.setId(resultSet.getLong("id"));
        category.setName(resultSet.getString("name"));

        return category;
    }

    public void saveCategory(Category category){
        jdbcTemplate.update("INSERT INTO category (name) VALUES (?)", category.getName());
    }

    public List<Product> getProducts(){
        RowMapper<Product> rowMapper = (resultSet, i) -> mapProduct(resultSet);
        return jdbcTemplate.query("SELECT p.id AS product_id, p.title, p.price, p.quantity, p.description, " +
                "s.id AS sub_id, s.name AS sub_name, c.id AS cat_id, c.name AS cat_name " +
                "FROM product p " +
                "INNER JOIN subcategory s ON p.subcategory_id_p = s.id " +
                "INNER JOIN category c ON s.category_id = c.id", rowMapper);
    }
// "SELECT * FROM product"
    private Product mapProduct(ResultSet resultSet) throws SQLException {
        Category category = new Category();
        category.setId(resultSet.getLong("cat_id"));
        category.setName(resultSet.getString("cat_name"));

        Subcategory subcategory = new Subcategory();
        subcategory.setCategory(category);
        subcategory.setId(resultSet.getLong("sub_id"));
        subcategory.setName(resultSet.getString("sub_name"));

        Product product = new Product();
        product.setSubcategory(subcategory);
        product.setId(resultSet.getLong("product_id"));
        product.setTitle(resultSet.getString("title"));
        product.setPrice(new BigDecimal(resultSet.getString("price")));
        product.setQuantity(resultSet.getInt("quantity"));
//        product.setSubcategory_id_p(resultSet.getLong("subcategory_id_p"));
        product.setDescription(resultSet.getString("description"));

        return product;
    }

    public void saveProduct(Product product){
        jdbcTemplate.update("INSERT INTO product (title, subcategory_id_p, price, quantity, description) " +
                "VALUES (?, ?, ?, ?, ?)", product.getTitle(), product.getSubcategory().getId(), product.getPrice(), product.getQuantity(), product.getDescription());
    }

    public void saveSubcategory(Subcategory subcategory) {
        jdbcTemplate.update("INSERT INTO subcategory (name, category_id) VALUES (?, ?)", subcategory.getName(), subcategory.getCategory().getId());
    }

    public List<Subcategory> getSubcategory(){
        RowMapper<Subcategory> rowMapper = (rs, rowNumber) -> mapSubcategory(rs);
        return jdbcTemplate.query("SELECT s.id AS s_id, s.name AS s_name, c.id AS c_id, c.name AS c_name FROM subcategory s " +
                "INNER JOIN category c ON s.category_id = c.id", rowMapper);
    }

    private Subcategory mapSubcategory(ResultSet rs) throws SQLException {
        Category category = new Category();
        category.setId(rs.getLong("c_id"));
        category.setName(rs.getString("c_name"));

        Subcategory subcategory = new Subcategory();
        subcategory.setCategory(category);
        subcategory.setId(rs.getLong("s_id"));
        subcategory.setName(rs.getString("s_name"));

        return subcategory;
    }

}
