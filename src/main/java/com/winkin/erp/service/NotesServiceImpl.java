package com.winkin.erp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.winkin.erp.dao.NotesDao;
import com.winkin.erp.pojo.PJ_NOTES;

@Service("NotesService")
@Transactional( propagation = Propagation.SUPPORTS,readOnly = true )
public class NotesServiceImpl implements NotesService{
	
	@Autowired
	private NotesDao A_NotesDao;

	@Override
	public Boolean AddNotes(PJ_NOTES rO_PJ_NOTES) {
		// TODO Auto-generated method stub
		return A_NotesDao.AddNotes(rO_PJ_NOTES);
	}

	@Override
	public Boolean DeleteNotes() {
		// TODO Auto-generated method stub
		return A_NotesDao.DeleteNotes();
	}

	@Override
	public Boolean UpdateNotes(PJ_NOTES rO_PJ_NOTES) {
		// TODO Auto-generated method stub
		return A_NotesDao.UpdateNotes(rO_PJ_NOTES);
	}

	
	
		
	
	}
	

