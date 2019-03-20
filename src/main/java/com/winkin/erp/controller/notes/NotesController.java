package com.winkin.erp.controller.notes;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.winkin.erp.SingleTon;
import com.winkin.erp.pojo.PJ_NOTES;
import com.winkin.erp.service.NotesService;
import com.winkin.erp.service.UserService;

@Controller("notes")
@RequestMapping("/app/notes")
public class NotesController {
	
	
	@Autowired
	private NotesService A_NotesService;
	
	
	@PostMapping(value = { "/add" })
	public ModelAndView post_add(HttpSession httpSession, Model model, @RequestBody PJ_NOTES RO_PJ_NOTES) {
		
		//model.addAllAttributes(SingleTon.PAGE_NOTES);
		Boolean O_PJ_NOTES = A_NotesService.AddNotes(RO_PJ_NOTES);
		
		
		
		return new ModelAndView(SingleTon.PAGE_NOTES);
		
	}

	//@DeleteMapping(value= {/"delete"})
	//public ModelAndView post_delete(HttpSession httpSession, Model model, @RequestBody PJ_NOTES RO_PJ_NOTES) {

	
	
	
	
	
}

