package OnlineStoreApp.demo.model;

import java.math.BigDecimal;

public class Customer extends User {
    String address;
    String city;
    public Customer (long id, String firstName, String lastName, String email, String password, String address,
                     String city){
        super(id, firstName, lastName, email, password);
    }

    public long getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public String getAddress(){
        return address;
    }
    public String getCity(){
        return city;
    }




/*   public void buyProduct(String name, int orderQuantity, ArrayList <Category> categoryList){
       for (int i = 0; i < categoryList.size(); i++) {
           ArrayList<Product> cartProducts = categoryList.get(i).products;
           for (int j = 0; j <cartProducts.size(); j++){
               if (cartProducts.get(j).name.equals(name)) {
                   if (cartProducts.get(j).getQuantity() >= orderQuantity) {
                       double cartPrice = cartProducts.get(j).getPrice() * orderQuantity;
                       if (balance >= cartPrice){
                           System.out.println("Sum to pay" + cartPrice);
                           return;
                       }else {
                           System.out.println("Balance is not enough to execute an order");
                           return;
                       }


                   } else {
                       System.out.println("Not enough items in stock");
                       return;
                   }
               }


               }
               System.out.println("This product is not in stock");



       }

   }*/

}
