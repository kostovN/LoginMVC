package action.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import domain.User;

public class LoggedUsersAction extends AbstractAction {

	@Override
	public String execute(HttpServletRequest request) {
		List<User> usersLog = (List<User>) request.getServletContext().getAttribute("usersLog");
		if(usersLog.isEmpty()) {
			request.setAttribute("errorMessage", "Users list is empty!");
		}
		return "/WEB-INF/pages/loggedusers.jsp";
	}

}
