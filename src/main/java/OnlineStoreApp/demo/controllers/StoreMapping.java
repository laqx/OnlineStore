package OnlineStoreApp.demo.controllers;

import OnlineStoreApp.demo.model.Product;
import OnlineStoreApp.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StoreMapping {

    // index.html
    @GetMapping("/index")
    public String getIndex(final ModelMap modelMap){
        return "index";
    }

    //cart.html
    @GetMapping("/cart")
    public String getCart(final ModelMap modelMap){
        return "cart";
    }

    //wishlist.html
    @GetMapping("/wishlist")
    public String getWishlist(final ModelMap modelMap){
        return "wishlist";
    }

    //shop.html
    @GetMapping("/shop")
    public String getShop(final ModelMap modelMap) {
        modelMap.addAttribute("product", new Product());
        return "shop";
    }

    //register-success.html
    @GetMapping("/register-success")
    public String getRegCon(Model model){
        return "register-success";
    }

}
