package OnlineStoreApp.demo.services;

import OnlineStoreApp.demo.dataBaseAccessObjects.ProductDao;
import OnlineStoreApp.demo.model.Category;
import OnlineStoreApp.demo.model.Product;
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

public List<Product> getProducts(){
        return productDao.getProducts();
}

public void saveProduct(Product product){
        productDao.saveProduct(product);
}
}


