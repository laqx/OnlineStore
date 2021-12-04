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
<<<<<<< HEAD
    @GetMapping("/login")
    public String getLoginAccountPage(Model model){
        model.addAttribute("loginForm", new LoggedUser());
        return "login";
=======
    @GetMapping("/account")
    public String getLoginPage(Model model) {
        model.addAttribute("loginData", new LoggedUser());
        return "account";
>>>>>>> 8220e98 (login update)
    }
    @PostMapping("/login")
    public String getLoggedUserAccount( @ModelAttribute LoggedUser loggedUser, Model model){
       User loadUserByEmail = userService.loadUserByEmail(loggedUser.getEmail());
       User loadUserByPassword = userService.loadUserByPassword(loggedUser.getPassword());
       if((loadUserByEmail.getEmail()).equals(loggedUser.email) && (loadUserByPassword).equals(loggedUser.password)){
           return "shop";
       } return "login";

    @PostMapping("/account_signed_in")
    public String handleLoggedUser (@ModelAttribute LoggedUser loggeduser, Model model){

//        userService.checkUserPasswordByEmail(loggeduser.password);


        /*BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);*/

        return "user-profile";
    }

    }


}
