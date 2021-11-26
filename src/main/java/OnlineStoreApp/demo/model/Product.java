package OnlineStoreApp.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Data
@NoArgsConstructor

public class Product {
    long id;
    String title;
    BigDecimal price;
    long user_id;
    int quantity;
    long subcategory_id;
    String description;
      /*  int discount;
    boolean inStock;*/

    public Product (long id, String title, BigDecimal price, long user_id, //int discount, boolean inStock,//
                    int quantity, long subcategory_id, String description){
        this.id=id;
        this.title = title;
        this.price = price;
        this.user_id=user_id;
        this.quantity = quantity;
        this.subcategory_id=subcategory_id;
        this.description=description;
      /*  this.discount = discount;
        this.inStock = inStock;*/
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getSubcategory_id() {
        return subcategory_id;
    }

    public void setSubcategory_id(long subcategory_id) {
        this.subcategory_id = subcategory_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
   /* public void getOrderSum(double price, int discount, int orderQuantity){
        double sum = 0;
        if (quantity>=orderQuantity){
            sum =orderQuantity*(1-0.01*discount)*price;
            System.out.println("Order sum is " + sum);
        } else {
            System.out.println("Sorry, required quantity is not in stock");
        }
    }*/
}


