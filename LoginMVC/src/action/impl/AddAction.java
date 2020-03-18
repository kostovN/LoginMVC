package action.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import domain.User;

public class AddAction extends AbstractAction {

	@Override
	public String execute(HttpServletRequest request) {
		return "/WEB-INF/pages/newuser.jsp";
	}

}
