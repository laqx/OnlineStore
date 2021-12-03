package OnlineStoreApp.demo.controllers;

import OnlineStoreApp.demo.model.CustomUserDetails;
import OnlineStoreApp.demo.model.LoggedUser;
import OnlineStoreApp.demo.model.User;
import OnlineStoreApp.demo.services.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.Connection;
@Controller
public class AdminLoginController {
    private UserService userService;

    //account.html
    @GetMapping("/loginAdmin")
    public String getAdminLoginAccountPage(Model model){
        model.addAttribute("adminLoginForm", new LoggedUser());
        return "loginAdmin";
    }
    @PostMapping("/loginAdmin")
    public String getLoggedAdminAccount(@ModelAttribute LoggedUser loggedUser, Model model){
        userService.validateLoggedUser();


        return "user-profile";
    }


}
