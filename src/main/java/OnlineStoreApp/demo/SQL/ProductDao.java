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
        return jdbcTemplate.query("SELECT * FROM product", rowMapper);
    }

    private Product mapProduct(ResultSet resultSet) throws SQLException {
        Product product = new Product();
        product.setId(resultSet.getLong("id"));
        product.setTitle(resultSet.getString("title"));
        product.setPrice(new BigDecimal(resultSet.getString("price")));
        product.setQuantity(resultSet.getInt("quantity"));
        product.setSubcategory_id_p(resultSet.getLong("subcategory_id_p"));
        product.setDescription(resultSet.getString("description"));

        return product;
    }

    public void saveProduct(Product product){
        jdbcTemplate.update("INSERT INTO product (title, price, quantity, subcategory_id_p, description) " +
                "VALUES (?, ?, ?, ?, ?)", product.getTitle(), product.getPrice(), product.getQuantity(), product.getSubcategory_id_p(), product.getDescription());
    }

    public void saveSubcategory(Subcategory subcategory) {
        jdbcTemplate.update("INSERT INTO subcategory (name, category_id) VALUES (?, ?)", subcategory.getName(), subcategory.getCategory());
    }

    public List<Subcategory> getSubcategory(){
        RowMapper<Subcategory> rowMapper = (rs, rowNumber) -> mapSubcategory(rs);
        return jdbcTemplate.query("SELECT * FROM subcategory", rowMapper);
    }

    private Subcategory mapSubcategory(ResultSet rs) throws SQLException {
        Category category = new Category();
        category.setId(rs.getLong("category_id"));

        Subcategory subcategory = new Subcategory();
        subcategory.setCategory(category);
        subcategory.setId(rs.getLong("id"));

        return subcategory;
    }

}
