package OnlineStoreApp.demo.dataBaseAccessObjects;

import OnlineStoreApp.demo.model.Category;
import OnlineStoreApp.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        category.setSubcategory_id(resultSet.getLong("subcategory_id"));

        return category;
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
        product.setUser_id(resultSet.getLong("user_id"));
        product.setQuantity(resultSet.getInt("quantity"));
        product.setSubcategory_id(resultSet.getLong("subcategory_id_p"));
        product.setDescription(resultSet.getString("description"));

        return product;
    }

    public void saveProduct(Product product){
        jdbcTemplate.update("INSERT INTO product (title, price, users_id, quantity, subcategory_id_p, description) VALUES (?, ?, ?, ?, ?, ?)," +
                product.getTitle(), product.getPrice(), product.getUser_id(), product.getQuantity(), product.getSubcategory_id(), product.getDescription());
    }
}
