package com.winkin.erp.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.winkin.erp.SingleTon;

@Controller("app-user")
@RequestMapping("/app/users")
public class UserController {
	

    @GetMapping(value = {"","/"})
    public ModelAndView signinPage(HttpSession httpSession, Model model) {

    	if(SingleTon.isNewSession(httpSession) ) {
    		
            return new ModelAndView("redirect:auth/signin");

    	}

    	
        return new ModelAndView(SingleTon.PAGE_USER_HOME);
    }

}
