package com.winkin.erp.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.winkin.erp.model.WKM_ATTACHMENT;
import com.winkin.erp.model.WKM_NOTES;
import com.winkin.erp.model.WKR_NOTES_TAGS;
import com.winkin.erp.pojo.PJ_NOTES;

@Repository("NotesDao")
@Transactional
@Component
public class NotesDaoImpl implements NotesDao{

	@Autowired
	SessionFactory A_SessionFactory;
	

	@Override
	public Boolean AddNotes(PJ_NOTES rO_PJ_NOTES) {
		Session session = A_SessionFactory.getCurrentSession();
        
        		
 
        			WKM_NOTES O_WKM_NOTES = new  WKM_NOTES();
        			O_WKM_NOTES.setWKMN_CONTENT("hai");
        			O_WKM_NOTES.setWKMN_TITLE("notes");
        			session.save(O_WKM_NOTES);
        		WKM_ATTACHMENT O_WKM_ATTACHMENT = new WKM_ATTACHMENT();
        		
        		O_WKM_ATTACHMENT.setWKMA_FLAG("NOTES");
        		O_WKM_ATTACHMENT.setWKMA_LINK("wKMA_LINK");
        		O_WKM_ATTACHMENT.setWKMA_P_ID(3);
    			session.save(O_WKM_ATTACHMENT);
    			
    			WKR_NOTES_TAGS O_WKM_NOTES_TAGS = new WKR_NOTES_TAGS();
    			O_WKM_NOTES_TAGS.setWKRNT_TAG("ijrgi");
    			O_WKM_NOTES_TAGS.setWKRNT_ID(session.get(WKM_NOTES.class, O_WKM_NOTES.getWKM_N_AG_ID()));
    			session.save(O_WKM_NOTES_TAGS);

    			return null;
	}

	
	}