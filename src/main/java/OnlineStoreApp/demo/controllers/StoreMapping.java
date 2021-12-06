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
    /*//category.html
    @GetMapping("/category")
    public String getCategory(final ModelMap modelMap){
        return "categories-page";
    }
    //subcategory.html
    @GetMapping("/subcategory")
    public String getSubCategory(final ModelMap modelMap){
        return "subcategories-page";
    }*/


    //plants-product-page.html
    @GetMapping("/plants")
    public String getPlantsPage(final ModelMap modelMap){
        return "plants-product-page";
    }

    //arrangements.html
    @GetMapping("/arrangements")
    public String getArrangementsPage(final ModelMap modelMap){
        return "arrangements";
    }


    //candy-gift-basket.html
    @GetMapping("/candy-gift-basket")
    public String getCandyGiftBasketPage(final ModelMap modelMap){
        return "candy-gift-basket";
    }

    //spa-gift-basket.html
    @GetMapping("/spa-gift-basket")
    public String getSpaGiftBasketPage(final ModelMap modelMap){
        return "spa-gift-basket";
    }

    //shop-category-flowers.html
    @GetMapping("/shop-category-flowers")
    public String getShopCategoryFlowersPage(final ModelMap modelMap){
        return "shop-category-flowers";
    }

    //shop-category-baskets.html
    @GetMapping("/shop-category-baskets")
    public String getShopCategoryBasketsPage(final ModelMap modelMap){
        return "shop-category-baskets";
    }


    //category.html
    @GetMapping("/plants/{id}")
    public String getPlantsById(final ModelMap modelMap){
        return "plants";
    }

}
