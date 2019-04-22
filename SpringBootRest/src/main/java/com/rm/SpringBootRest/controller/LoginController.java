package com.rm.SpringBootRest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping(value = "/welcomemessage", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model) {
        model.put("name", "Roshan's Spring Security demo");
        return "index";
    }

}
