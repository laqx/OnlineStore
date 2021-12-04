package OnlineStoreApp.demo.controllers;
import OnlineStoreApp.demo.model.Role;

import OnlineStoreApp.demo.model.User;
import OnlineStoreApp.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegistrationController {

    @Autowired
    private UserService userService;


    //register-success.html
    @PostMapping("/account")
    public String getUserAccount(@ModelAttribute User user, Model model){

        User validateUser = userService.validateUser(user);



        return "register-success";
    }

    @GetMapping("/register-success")
    public String getRegCon (){
        return "register-success";
    }
    //account.html
    @GetMapping("/account")
    public String getAccountPage(Model model){
        model.addAttribute("userData", new User());
        return "account";
    }



}