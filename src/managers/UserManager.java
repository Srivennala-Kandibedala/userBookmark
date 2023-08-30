package managers;

import dao.UserDao;
import entities.User;

public class UserManager {
	static UserManager instance = new UserManager();

	private UserManager() {
	}

	public static UserManager getInstance() {
		return instance;
	}
	private static UserDao dao = new UserDao();

	public User createUser(long id, String email, String password, String firstName, String lastName, int gender,
			String userType) {
		User user = new User();
		user.setId(id);
		user.setEmail(email);
		user.setPassword(password);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setGender(gender);
		user.setUserType(userType);
		return user;
	}
	public User[] getUsers() {
		return dao.getUsers();
	}
}
