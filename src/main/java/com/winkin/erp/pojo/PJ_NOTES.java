package com.winkin.erp.pojo;

import com.winkin.erp.model.WKM_ATTACHMENT;
import com.winkin.erp.model.WKM_NOTES;
import com.winkin.erp.model.WKR_NOTES_TAGS;

public class PJ_NOTES {
	
	String title;
	String content;
	String link;
	String tag;
	Integer tid;
	
	public PJ_NOTES() {
		super();
	}
	public PJ_NOTES(WKR_NOTES_TAGS O_WKR_NOTES_TAGS,WKM_ATTACHMENT O_WKM_ATTACHMENT,WKM_NOTES O_WKM_NOTES) {
		
		this.title =O_WKM_NOTES.getWKMN_TITLE() ;
		this.content = O_WKM_NOTES.getWKMN_CONTENT();
		this.link = O_WKM_ATTACHMENT.getWKMA_LINK();
		this.tag = O_WKR_NOTES_TAGS.getWKRNT_TAG();
		this.tid=O_WKR_NOTES_TAGS.getWKRNT_ID().getWKM_N_AG_ID();
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	
	
	
	
	
}
