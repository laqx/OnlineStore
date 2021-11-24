package OnlineStoreApp.demo.dataBaseAccessObjects;

import OnlineStoreApp.demo.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

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
}
