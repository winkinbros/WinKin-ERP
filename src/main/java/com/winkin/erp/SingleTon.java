package com.winkin.erp;

import javax.servlet.http.HttpSession;


public class SingleTon {

	public static final String SESSION_DEFAULT_ROLE_ID = "roleid";
	public static final String SESSION_USER_ID = "userid";
	private static SingleTon singleTon;

	private SingleTon() {

	}

	public static final SingleTon getInstance() {

		if (singleTon == null) {
			singleTon = new SingleTon();
		}

		return singleTon;
	}

	
	
////////////////////////////////////////////////////
////////////////////////////////////////////////////
////////////////////////////////////////////////////
////////////////////////////////////////////////////
	public static final String PAGE_LOGIN = "login";
	public static final String PAGE_DASHBOARD = "dashboard";
////////////////////////////////////////////////////
////////////////////////////////////////////////////
////////////////////////////////////////////////////
////////////////////////////////////////////////////
	public static final String ERROR_MSG = "infoerror";

	
	public static void removeSession(HttpSession httpSession) {

		httpSession.removeAttribute("status");

	}

	public static String getSessionUserId(HttpSession httpSession) {

		return (String) httpSession.getAttribute(SingleTon.SESSION_USER_ID);

	}

	public static Integer getSessionRoleId(HttpSession httpSession) {

		return (Integer) httpSession.getAttribute(SingleTon.SESSION_DEFAULT_ROLE_ID);

	}

	
}