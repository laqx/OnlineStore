package OnlineStoreApp.demo.services;

import OnlineStoreApp.demo.SQL.ProductDao;
import OnlineStoreApp.demo.model.Category;
import OnlineStoreApp.demo.model.Product;
import OnlineStoreApp.demo.model.Subcategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private ProductDao productDao;

    public List<Category> getCategories() {
        return productDao.getCategories();
    }

    public void saveCategory(Category category){
        productDao.saveCategory(category);
    }

    public List<Product> getProducts(){
        return productDao.getProducts();
    }

    public void saveProduct(Product product){
        productDao.saveProduct(product);
    }

    public List<Subcategory> getSubcategory(){
        return productDao.getSubcategory();
    }
    public void saveSubcategory(Subcategory subcategory){
        productDao.saveSubcategory(subcategory);
    }

}


