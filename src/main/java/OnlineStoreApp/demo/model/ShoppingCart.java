package OnlineStoreApp.demo.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ShoppingCart {
    private  Inventory inventory;

    private List<LineProduct> productsInCart = new ArrayList<>();

    public void addProduct(LineProduct lineProduct){
        Product product = inventory.get(Long.parseLong(lineProduct.getProductId()));
        lineProduct.setTitle(product.getTitle());
        lineProduct.setPrice(product.getPrice());
        this.productsInCart.add(lineProduct);
    }

    public int totalNumberOfProducts(){
        int totalProducts=  0;
        for (LineProduct lineProduct : productsInCart) {
            totalProducts+=lineProduct.getQuantity();

        }
        return totalProducts;  /// check this LATER!
    }
    public void remove(LineProduct lineProductToRemove){
        boolean deleteLineProduct = false;
        for (LineProduct productInCart : productsInCart) {
            if (Objects.equals(productInCart.getProductId(),lineProductToRemove.getProductId())){
                if(lineProductToRemove.getQuantity()==productInCart.getQuantity()){
                    deleteLineProduct = true;

                } else {
                    productInCart.reduceQuantityBy(lineProductToRemove.getQuantity());
                }

            }
        }
        if(deleteLineProduct){

            this.productsInCart.remove(lineProductToRemove.getProductId());
//            this.productsInCart.remove(lineProductToRemove);
        }



        }
        public List<LineProduct> listProductsInCart(){
            return Collections.unmodifiableList(this.productsInCart);
    }

}
