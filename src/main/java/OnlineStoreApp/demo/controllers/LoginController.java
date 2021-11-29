package OnlineStoreApp.demo.controllers;

import OnlineStoreApp.demo.model.CustomUserDetails;
import OnlineStoreApp.demo.model.LoggedUser;
import OnlineStoreApp.demo.model.User;
import OnlineStoreApp.demo.services.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.Connection;
@Controller
public class LoginController {
    private UserService userService;

    //account.html
    @GetMapping("/account")
    public String getLoginPage(Model model) {
        model.addAttribute("loginData", new LoggedUser());
        return "account";
    }

    @PostMapping("/account_signed_in")
    public String handleLoggedUser (@ModelAttribute LoggedUser loggeduser, Model model){

//        userService.checkUserPasswordByEmail(loggeduser.password);


        /*BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);*/

        return "user-profile";
    }


}
