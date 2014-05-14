package br.com.jfac.facade;

import br.com.jfac.dao.UserDAO;
import br.com.jfac.model.User;

public class UserFacadeImpl implements UserFacade {

	private UserDAO userDAO;
	@Override
	public User findUserByEmail(String email) {
		
		return userDAO.findUserByEmail(email);
	}
}
