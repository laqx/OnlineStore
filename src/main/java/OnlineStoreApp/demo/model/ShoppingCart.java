package OnlineStoreApp.demo.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ShoppingCart {
    private List<Product> productsInCart = new ArrayList<>();

    public void addProduct(Product product){
        this.productsInCart.add(product);
    }

    public int totalNumberOfProducts(){
        int totalProducts=  0;
        for (Product product : productsInCart) {
            totalProducts+=product.getQuantity();
        }
        return totalProducts;
    }
    public void remove(Product productToRemove){
        boolean deleteProduct = false;
        for (Product productInCart : productsInCart) {
            if (Objects.equals(productInCart.getId(),productToRemove.getId())){
                if(productToRemove.getQuantity()==productInCart.getQuantity()){
                    deleteProduct = true;

                } else {
                    productInCart.reduceQuantityBy(productToRemove.getQuantity());
                }

            }
        }
        if(deleteProduct){

            this.productsInCart.remove(productToRemove);
        }

        /*public List<Product> listProductsInCart(){
            return Collections.unmodifiableList(this.productsInCart);

        }*/
    }

}
