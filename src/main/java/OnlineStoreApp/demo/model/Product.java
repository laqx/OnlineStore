package OnlineStoreApp.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Data
@NoArgsConstructor

public class Product {
    private long id;
    private Subcategory subcategory;
    private String title;
    private BigDecimal price;
    private int quantity;
    private String description;
    private long subcategory_id_p;


    public Product (long id, Subcategory subcategory, String title, BigDecimal price, //int discount, boolean inStock,//
                    int quantity, String description, long subcategory_id_p){
        this.id=id;
        this.subcategory=subcategory;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
        this.description=description;
        this.subcategory_id_p=subcategory_id_p;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Subcategory getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(Subcategory subcategory) {
        this.subcategory = subcategory;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getSubcategory_id_p() {
        return subcategory_id_p;
    }

    public void setSubcategory_id_p(long subcategory_id_p) {
        this.subcategory_id_p = subcategory_id_p;
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


