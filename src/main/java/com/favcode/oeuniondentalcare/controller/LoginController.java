package com.favcode.oeuniondentalcare.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
    public String displayLoginPage(@RequestParam(value = "error", required = false) String error,
                                   @RequestParam(value = "logout", required = false) String logout, Model model){
        String errorMessage = null;
        String logoutMessage = null;
        if (error != null){
            errorMessage = "Username or Password is Incorrect!!";
        }
        if (logout != null){
            logoutMessage = "You have been successfully logged out!!";
        }
        model.addAttribute("errorMessage", errorMessage);
        model.addAttribute("logoutMessage", logoutMessage);
        return "login.html";
    }
}
