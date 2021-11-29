package OnlineStoreApp.demo.controllers;

import OnlineStoreApp.demo.model.Category;
import OnlineStoreApp.demo.model.Product;
import OnlineStoreApp.demo.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/categories")
    public String getCategories(Model model) {
        model.addAttribute("categories", adminService.getCategories());
        model.addAttribute("category", new Category());
        return "categories";
    }

    @GetMapping("/products")
    public String getProduct(Model model) {
        model.addAttribute("products", adminService.getProducts());
        return "products-page"; // admin html view
    }

    @PostMapping("/products/create")
    public String addProduct(@ModelAttribute Product newProduct) {
        adminService.saveProduct(newProduct);
        return "redirect:/products-page";
    }
}
