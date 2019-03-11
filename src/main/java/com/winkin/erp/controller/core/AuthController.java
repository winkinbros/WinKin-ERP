package com.winkin.erp.controller.core;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller("auth")
@RequestMapping("/auth")
public class AuthController {



    @GetMapping(value = {"/page/signin"})
    public ModelAndView signinPage(HttpSession httpSession, Model model) {


        model.addAttribute("test","test");

        return new ModelAndView("login");
    }




}
