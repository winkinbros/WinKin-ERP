package com.winkin.erp.controller.user;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.winkin.erp.SingleTon;
import com.winkin.erp.service.UserService;

@Controller("app-user")
@RequestMapping("/app/users")
public class UserController {
	
	@Autowired
	private UserService I_UserService;

    @GetMapping(value = {"","/"})
    public ModelAndView signinPage(HttpSession httpSession, Model model) {

    	if(SingleTon.isNewSession(httpSession) ) {
    		
            return new ModelAndView("redirect:/auth/signin");

    	}

    	model.addAttribute("userlist",I_UserService.getUserlist());
    	model.addAttribute("rolelist",I_UserService.getRolelist());
	
        return new ModelAndView(SingleTon.PAGE_USER_HOME);
    }

}
