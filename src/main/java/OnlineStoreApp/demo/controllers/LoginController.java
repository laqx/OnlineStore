package OnlineStoreApp.demo.controllers;

import OnlineStoreApp.demo.model.CustomUserDetails;
import OnlineStoreApp.demo.model.User;
import OnlineStoreApp.demo.services.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Connection;
@Controller
public class LoginController {
    private UserService userService;

    //account.html
    @GetMapping("/account")
    public String getAccountPage(Model model){
        model.addAttribute("userData", new User());
        return "account";
    }



}
