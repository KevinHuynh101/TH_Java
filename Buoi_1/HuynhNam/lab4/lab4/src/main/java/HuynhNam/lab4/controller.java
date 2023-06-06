package HuynhNam.lab4;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import HuynhNam.lab4.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

public class controller {

    @RequestMapping("/")
    public String home() {
        System.out.println("Going home...");
        return "index";
    }
    @GetMapping("/register")
    public String showForm(Model model) {
        User user = new User();
        user.setName("Nam Ha Minh");
        model.addAttribute("user", user);

        List<String> professionList = Arrays.asList("Developer", "Designer", "Tester", "Architect");
        model.addAttribute("professionList", professionList);

        return "register_form";
    }

    @PostMapping("/register")
    public String submitForm(@Valid @ModelAttribute("user") User user,
                             BindingResult bindingResult) {
        System.out.println(user);

        if (bindingResult.hasErrors()) {

            return "register_form";
        } else {
            return "register_success";
        }
    }
}
