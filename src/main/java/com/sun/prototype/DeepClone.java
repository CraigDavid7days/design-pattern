package com.sun.prototype;

public class DeepClone {

 
	
	public User clone(User user) {
		User u = null;
		try {
			u = (User) user.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
}
