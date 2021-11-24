package OnlineStoreApp.demo.controllers;

import OnlineStoreApp.demo.model.Category;
import OnlineStoreApp.demo.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/admin/categories")
    public String getCategories(Model model){
        model.addAttribute("categories", adminService.getCategories());
        model.addAttribute("category", new Category());
            return "admin/categories";
        }
    }
