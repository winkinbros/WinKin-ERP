package com.winkin.erp;

import javax.servlet.http.HttpSession;

import com.winkin.erp.pojo.PJ_SESSION;

public class SingleTon {

	public static final String SESSION_CURRENT_ROLE_ID = "roleid";
	public static final String SESSION_USER_ID = "userid";
	public static final String SESSION_CURRENT_COMPANY = "currentcompany";

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
	public static final String PAGE_NOTES = "notes";

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

		return (Integer) httpSession.getAttribute(SingleTon.SESSION_CURRENT_ROLE_ID);

	}

	// Session Validation
	public static boolean isNewSession(HttpSession httpSession) {

		if (httpSession.getAttribute(SingleTon.SESSION_USER_ID) == null
				|| httpSession.getAttribute(SingleTon.SESSION_USER_ID).toString().trim().equals("")) {

			return true;

		} else {

			return false;

		}
	}

	public static PJ_SESSION getSessionData(HttpSession httpSession) {

		PJ_SESSION O_PJ_SESSION = new PJ_SESSION();
		
		O_PJ_SESSION.setUserid((String) httpSession.getAttribute(SingleTon.SESSION_USER_ID));
		
		O_PJ_SESSION.setCompanyid((String) httpSession.getAttribute(SingleTon.SESSION_CURRENT_COMPANY));
		
		O_PJ_SESSION.setRole((String) httpSession.getAttribute(SingleTon.SESSION_CURRENT_ROLE_ID));
		
		return O_PJ_SESSION;
	}

}