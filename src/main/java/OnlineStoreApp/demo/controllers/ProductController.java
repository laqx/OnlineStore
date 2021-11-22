package OnlineStoreApp.demo.controllers;

import OnlineStoreApp.demo.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/shop")
public class ProductController {
    @GetMapping("/create")
    public String showOrderForm(final ModelMap modelMap){
        modelMap.addAttribute("product", new Product());
        modelMap.addAttribute("elements", List.of("one", "two", "three"));
        return "Product";
    }
   /* @PostMapping("/create")
    public String handleNewOrder(@Valid @ModelAttribute("orderForm") final OrderForm orderForm, final Errors errors){
        // orderForm fields are filled with user values
        // code that handles new orders
        if(errors.hasErrors()){
            return "Order";

        }

        return "redirect:/shop";

    }*/
}