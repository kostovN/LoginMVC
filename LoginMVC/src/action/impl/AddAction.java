package action.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import action.AbstractAction;
import domain.User;

public class AddAction extends AbstractAction {

	@Override
	public String execute(HttpServletRequest request) {
		List<User> usersLog = (List<User>) request.getServletContext().getAttribute("usersLog");
		HttpSession session = request.getSession(true);
		User user = (User) session.getAttribute("user");
		if (usersLog.contains(user)) {
			return "/WEB-INF/pages/newuser.jsp";
		} else {
			request.setAttribute("errorMessage", "You must be logged in!");
			return "/index.jsp";
		}
	}

}
