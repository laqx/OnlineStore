package OnlineStoreApp.demo.controllers;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import OnlineStoreApp.demo.model.User;
import OnlineStoreApp.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @Autowired
    private UserService userService;

    //account.html
    @GetMapping("/account")
    public String getAccountPage(Model model){
        model.addAttribute("userData", new User());
        return "account";
    }

    //register-success.html
    @PostMapping("/account#register#")
    public String getUserAccount(@ModelAttribute User user, Model model){
        User validateUser = userService.validateUser(user);
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        return "register-success";
    }


}