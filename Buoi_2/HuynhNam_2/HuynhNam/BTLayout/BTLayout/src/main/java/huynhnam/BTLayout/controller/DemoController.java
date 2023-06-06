package huynhnam.BTLayout.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DemoController {
    @RequestMapping("/")
    public String show(){
        return "layout/main-layout";
    }
    @RequestMapping("/home")
    public String showhome(){
        return "layout/home";
    }
    @RequestMapping("/contact")
    public String showcontact(){
        return "layout/contact";
    }
    @RequestMapping("/product")
    public String showproduct(){
        return "layout/product";
    }
}
