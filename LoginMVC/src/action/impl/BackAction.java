package action.impl;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;

public class BackAction extends AbstractAction {

	@Override
	public String execute(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return "/index.jsp";
	}

}
