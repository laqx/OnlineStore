package OnlineStoreApp.demo.controllers;

import OnlineStoreApp.demo.model.CustomUserDetails;
import OnlineStoreApp.demo.model.LoggedUser;
import OnlineStoreApp.demo.model.User;
import OnlineStoreApp.demo.services.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.Connection;
@Controller
public class LoginController {
    private UserService userService;

    //account.html
    @GetMapping("/login")
    public String getLoginAccountPage(Model model){
        model.addAttribute("loginForm", new LoggedUser());
        return "login";
    }
    @PostMapping("/login")
    public String getLoggedUserAccount( @ModelAttribute LoggedUser loggedUser, Model model){
        User loadUserByEmail = userService.loadUserByEmail(loggedUser.getEmail());
        User loadUserByPassword = userService.loadUserByPassword(loggedUser.getPassword());
        if((loadUserByEmail.getEmail()).equals(loggedUser.email) && (loadUserByPassword).equals(loggedUser.password)){
            return "shop";
        } return "login";


    }


}