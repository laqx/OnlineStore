package OnlineStoreApp.demo.services;

import OnlineStoreApp.demo.SQL.ProductDao;
import OnlineStoreApp.demo.model.Product;
import OnlineStoreApp.demo.model.Subcategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sound.midi.Soundbank;
import java.util.List;

@Service
public  class ProductService {

    @Autowired
    private  ProductDao productDao;

    public List<Product> getProducts(){
        return productDao.getProducts();
    }
    public Product getProductById(Long id){

       return productDao.getProductById(id);

    }

    public static void main(String[] args) {

ProductDao myProductdao = new ProductDao();
System.out.println(myProductdao.getProductById(5L));


    }


}
