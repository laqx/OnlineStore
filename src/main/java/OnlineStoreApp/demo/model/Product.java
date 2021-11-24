package OnlineStoreApp.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor

public class Product {
    long id;
    Subcategory subcategory;
    String title;
    String description;
    BigDecimal price;
  /*  int discount;
    boolean inStock;*/
    int quantity;

    public Product (long id, Subcategory subcategory, String title, String description, BigDecimal price, //int discount, boolean inStock,//
                    int quantity){
        this.id=id;
        this.subcategory=subcategory;
        this.title = title;
        this.description=description;
        this.price = price;
      /*  this.discount = discount;
        this.inStock = inStock;*/
        this.quantity = quantity;
    }
    public long getId(){
        return id;
    }
    public Subcategory getSubcategory(){
        return subcategory;
    }
    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
    public BigDecimal getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
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


