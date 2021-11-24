package OnlineStoreApp.demo.controllers;

import OnlineStoreApp.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {

   /* @GetMapping("/create")
    public String getRegistrationPage( final ModelMap modelMap) {
        modelMap.addAttribute("userData", new Customer());
        return "account";
    }*/

}
