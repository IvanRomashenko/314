package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.UserService;

@Controller
public class UserController {
//        private final UserService userService;
//
//  //  @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @GetMapping("/user")
//    public String getUser(Model model,@AuthenticationPrincipal User user) {
//        model.addAttribute("user", user);
//        return "user";
//    }
    @GetMapping("/user")
    public ModelAndView userPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user");
        return modelAndView;
    }
}
