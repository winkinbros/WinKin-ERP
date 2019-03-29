package com.winkin.erp.dao;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.engine.spi.ExecutableList;
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
        			O_WKM_NOTES.setWKMN_CONTENT(rO_PJ_NOTES.getContent());
        			O_WKM_NOTES.setWKMN_TITLE(rO_PJ_NOTES.getTitle());
        			session.save(O_WKM_NOTES);
        		WKM_ATTACHMENT O_WKM_ATTACHMENT = new WKM_ATTACHMENT();
        		
        		O_WKM_ATTACHMENT.setWKMA_FLAG("NOTES");
        		O_WKM_ATTACHMENT.setWKMA_LINK(rO_PJ_NOTES.getLink());
        		O_WKM_ATTACHMENT.setWKMA_P_ID(3);
    			session.save(O_WKM_ATTACHMENT);
    			
    			WKR_NOTES_TAGS O_WKM_NOTES_TAGS = new WKR_NOTES_TAGS();
    			O_WKM_NOTES_TAGS.setWKRNT_TAG(rO_PJ_NOTES.getTag());
    			O_WKM_NOTES_TAGS.setWKRNT_ID(session.get(WKM_NOTES.class, O_WKM_NOTES.getWKM_N_AG_ID()));
    			session.save(O_WKM_NOTES_TAGS);

    			return null;
	}


	


  @Override 
  public Boolean DeleteNotes() {
  
  String strquery = "DELETE FROM WKM_NOTES WHERE WKM_N_AG_ID=:A_ID";
  
  Query query = A_SessionFactory.getCurrentSession().createQuery(strquery);
 query.setParameter("A_ID", 1);
 
 query.executeUpdate();
  
  String strquery1 ="DELETE FROM WKM_ATTACHMENT WHERE WKMA_P_ID=:p_ID AND WKMA_FLAG=:flag"; 
  Query query1 = A_SessionFactory.getCurrentSession().createQuery(strquery);
  
  query1.setParameter("p_ID", 1); query1.setParameter("flag", "NOTES");
  query1.executeUpdate();
  
  
  
  String strquery2 = "DELETE FROM WKR_NOTES_TAGS WHERE WKRNT_ID.WKM_N_AG_ID=:p_ID"; 
  Query query2 = A_SessionFactory.getCurrentSession().createQuery(strquery);
  query2.setParameter("p_ID", 1);
  
  query2.executeUpdate();
  
  return true; }





@Override
public Boolean UpdateNotes(PJ_NOTES rO_PJ_NOTES) {
	// TODO Auto-generated method stub
	return null;
}
  
  
//  @Override public Boolean UpdateNotes(PJ_NOTES rO_PJ_NOTES) {
//  
//  Session session = A_SessionFactory.openSession(); Transaction Tx
//  =session.beginTransaction(); 
//  try {
//	  String strquery ="FROM WKM_NOTES WHERE WKM_N_AG_ID=:A_ID"; 
//	  Query query =session.createQuery(strquery);
//	  query.setParameter("A_ID",1); WKM_NOTES
//   O_WKM_NOTES = (WKM_NOTES)query.list();
//  if(rO_PJ_NOTES !=null) {
//	  O_WKM_NOTES.setWKMN_CONTENT(rO_PJ_NOTES.getContent());
//  O_WKM_NOTES.setWKMN_TITLE(rO_PJ_NOTES.getTitle());
//  
//  } 
//  
//  String strquery1="FROM WKM_ATTACHMENT WHERE WKMA_AG_ID=:A_ID AND WKMA_FLAG=:Flag"; 
//  Query query1 = session.createQuery(strquery1);
//  
//  query1.setParameter("A_ID", 1); query1.setParameter("Flag","NOTES");
//  WKM_ATTACHMENT O_WKM_ATTACHMENT = (WKM_ATTACHMENT) query.list();
//  if(rO_PJ_NOTES !=null) { 
//	  
//O_WKM_ATTACHMENT.setWKMA_FLAG("NOTES");
//  O_WKM_ATTACHMENT.setWKMA_LINK(rO_PJ_NOTES.getLink());
//  O_WKM_ATTACHMENT.setWKMA_P_ID(1);
//  
//  }
//  
//  
//  
//  String strquery2 ="FROM WKR_NOTES_TAGS WHERE WKRNT_ID.WKM_N_AG_ID=:A_ID";
//  Query query2 = session.createQuery(strquery2);
//  
//  query2.setParameter("A_ID", 1); 
//  WKR_NOTES_TAGS O_WKR_NOTES_TAGS =(WKR_NOTES_TAGS) query.list();
//  
//  if(rO_PJ_NOTES != null) {
//  O_WKR_NOTES_TAGS.setWKRNT_ID(session.(WKM_NOTES.class, rO_PJ_NOTES));
//  O_WKR_NOTES_TAGS.setWKRNT_TAG(rO_PJ_NOTES.getTag());
//  
//  }
// 
//  Tx.commit();
//  session.close(); 
//  } catch (Exception e) 
//  { 
//	  if(Tx.isActive()) {
//		  
//  Tx.rollback(); 
//  } session.close(); 
//  return false;
//  
//   }
//  
//   return true; 
//  }
//  
  }