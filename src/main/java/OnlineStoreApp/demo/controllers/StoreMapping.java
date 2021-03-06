package OnlineStoreApp.demo.controllers;

import OnlineStoreApp.demo.model.Product;
import OnlineStoreApp.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

    //user-profile.html
    @GetMapping("/user-profile")
    public String getUserProfile(final ModelMap modelMap){
        return "user-profile";
    }
    //shopAdmin.html
    @GetMapping("/shopAdmin")
    public String getShopAdmin(final ModelMap modelMap){
        return "shopAdmin";
    }


}
