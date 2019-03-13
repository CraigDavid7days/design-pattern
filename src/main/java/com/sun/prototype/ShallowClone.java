package com.sun.prototype;

public class ShallowClone {
	
	public User clone(User user) {
		User u = new User();
		u.setAge(user.getAge());
		u.setName(user.getName());
		u.setAccounts(user.getAccounts());
		return u;
	}
}
