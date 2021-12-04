package OnlineStoreApp.demo.Shop;

import OnlineStoreApp.demo.SQL.ProductDao;
import OnlineStoreApp.demo.model.Product;
import OnlineStoreApp.demo.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

public class Shop {

    @Autowired
    private ProductDao productDao;


    @RequestMapping(value= "shop")
    public String getAllProducts(Model model) {
        List<Product> products = productDao.getProducts();

        model.addAttribute("products", products);
        return "shop";
    }



}