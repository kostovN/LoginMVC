package action.impl;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;

public class GoToLoginAction extends AbstractAction {

	@Override
	public String execute(HttpServletRequest request) {
		
		return "/WEB-INF/pages/login.jsp";
	}

}
