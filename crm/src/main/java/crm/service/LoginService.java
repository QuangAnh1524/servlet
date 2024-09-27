package crm.service;

import java.util.List;

import crm.model.User;
import crm.repository.UserRepository;

public class LoginService {
	
	private UserRepository userRepository = new UserRepository();  
	
	public boolean checkLogin(String fullname, String password) {
		List<User> list = userRepository.getUserByFullNameandPassWord(fullname, password);
		if (list.size() > 0) {
			return true;
		} else {
			return false;
		}
	}

}
