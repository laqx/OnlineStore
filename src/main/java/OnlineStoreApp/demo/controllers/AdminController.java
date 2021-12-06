package OnlineStoreApp.demo.controllers;

import OnlineStoreApp.demo.model.Category;
import OnlineStoreApp.demo.model.Product;
import OnlineStoreApp.demo.model.Subcategory;
import OnlineStoreApp.demo.services.AdminService;
import OnlineStoreApp.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private ProductService productService;

    @GetMapping("/categories")
    public String getCategories(Model model) {
        model.addAttribute("category", adminService.getCategories());
        model.addAttribute("newCategory", new Category());
        return "categories-page";
    }

    @PostMapping("/categories/add")
    public String addCategory(@ModelAttribute Category category){
        adminService.saveCategory(category);
        return "redirect:/categories";
    }

    @GetMapping("/products")
//    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public String getProduct(Model model) {
        model.addAttribute("product", adminService.getProducts());
        model.addAttribute("subcategory", adminService.getSubcategory());
        model.addAttribute("newProduct", new Product());
        return "products-page"; // admin html view
    }

    @PostMapping("/products/create")
    public String addProduct(@ModelAttribute Product newProduct) {
        adminService.saveProduct(newProduct);
        return "redirect:/products";
    }

    @GetMapping("/subcategories")
    public String getSubcategory(Model model){
        model.addAttribute("category", adminService.getCategories());
        model.addAttribute("subcategory", adminService.getSubcategory());
        model.addAttribute("newSubcategory", new Subcategory());

        return "subcategories-page";
    }

    @PostMapping("/subcategories/create")
    public String addSubcategory(@ModelAttribute Subcategory subcategory){
        adminService.saveSubcategory(subcategory);

        return "redirect:/subcategories";
    }


}