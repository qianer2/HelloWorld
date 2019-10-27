package com.google.user;

public class Manager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       UserServiceImpl userServiceImpl =  new UserServiceImpl();
       
       User user =  new User("Jame","123456");
       userServiceImpl.register(user);
	}

}
