package com.jms.chat.controller;

import com.jms.chat.validator.UserValidator;
import com.jms.chat.entity.User;
import com.jms.chat.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class MainController {

    @Autowired
    UserService userService;

    @Autowired
    UserValidator userValidator;

    Logger logger = Logger.getLogger(MainController.class);

    @RequestMapping(value = "/register")
    public String home(Model model)
    {
        model.addAttribute("user", new User());
        return "register";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveUser(@ModelAttribute("user") @Valid User user, BindingResult bindingResult)
    {
        if (bindingResult.hasErrors()){
            return "/register";
        }
        userService.saveUser(user);
        return "saved";
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        webDataBinder.setValidator(userValidator);
    }

}
