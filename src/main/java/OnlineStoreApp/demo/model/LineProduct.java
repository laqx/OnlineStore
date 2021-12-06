package OnlineStoreApp.demo.model;

import java.math.BigDecimal;

public class LineProduct {
    private String productId;
    private int quantity;
    private BigDecimal price;
    private String title;



    public LineProduct(String productId, int quantity){
        this.productId = productId;
        this.quantity = quantity;
    }
    public LineProduct(String product){
        this(product, 1);
    }

    public String getProductId(){
        return productId;
    }

    public int getQuantity(){
        return quantity;
    }
    public void setPrice(BigDecimal price){
        this.price = price;
    }
    public void setTitle(String title){
        this.title = title;
    }



    @Override
    public boolean equals(Object o){
        if (this == o) return  true;
        if (o==null || getClass() !=o.getClass()) return false;

        LineProduct lineProduct = (LineProduct) o;
        if (quantity!= lineProduct.quantity) return false;
        return productId != null ? productId.equals(lineProduct.productId) : lineProduct.productId == null;

    }
    @Override
    public int hashCode(){
        int result = productId != null ? productId.hashCode() : 0;
        result = 31 * result + quantity;
        return result;
    }

    public void reduceQuantityBy (int quantityToReduceBy){
        this.quantity -= quantityToReduceBy;
    }
    public BigDecimal totalPrice(){
        return BigDecimal.ZERO;
    }

}
