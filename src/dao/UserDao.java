package dao;

import entities.User;
import firstProject.DataStore;

public class UserDao {
	public User[] getUsers() {
		return DataStore.getUsers();
	}
}
