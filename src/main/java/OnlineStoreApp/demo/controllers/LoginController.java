package OnlineStoreApp.demo.controllers;

import OnlineStoreApp.demo.model.User;
import OnlineStoreApp.demo.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
//import OnlineStoreApp.demo.model.LoggedUser;
//import OnlineStoreApp.demo.services.UserService;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//@Controller
//public class LoginController {
//    private UserService userService;
//
//    //account.html
//    @GetMapping("/account")
//    public String getLoginPage(Model model) {
//        model.addAttribute("loginData", new LoggedUser());
//        return "account";
//    }
//
//    @PostMapping("/login-account")
//    public String handleLoggedUser (@ModelAttribute LoggedUser loggeduser, Model model){
//
////        userService.checkUserPasswordByEmail(loggedUser.password);
//
//        /*BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        String encodedPassword = passwordEncoder.encode(user.getPassword());
//        user.setPassword(encodedPassword);*/
//        return "user-profile";
//    }
//
//}
