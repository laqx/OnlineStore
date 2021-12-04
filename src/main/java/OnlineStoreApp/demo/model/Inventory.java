package OnlineStoreApp.demo.model;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Long, Product> products = new HashMap<>();

    public void add(Product product){
        this.products.put(product.getId(), product);
    }

    public Product get(Long id){
        return products.get(id);
    }
}
