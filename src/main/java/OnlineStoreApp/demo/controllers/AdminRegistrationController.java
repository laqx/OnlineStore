package OnlineStoreApp.demo.controllers;
import OnlineStoreApp.demo.model.Role;


import OnlineStoreApp.demo.model.User;
import OnlineStoreApp.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AdminRegistrationController {

    @Autowired
    private UserService userService;


    //register-success.html
    @PostMapping("/accountAdmin")
    public String getAdminAccount(@ModelAttribute User user, Model model){
//        user.setRole("ADMIN");
        User validateUser = userService.validateUser(user);


        return "register-success-admin";
    }

    @GetMapping("/register-success-admin")
    public String getRegCon (){
        return "register-success-admin";
    }
    //account.html
    @GetMapping("/accountAdmin")
    public String getAdminAccountPage(Model model){
        model.addAttribute("adminData", new User());
        return "accountAdmin";
    }



}