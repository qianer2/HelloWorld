package com.google.user;

public class UserServiceImpl implements UserService{

	//用户 注册的具体实现
	@Override
	public User register(User user) {
		// TODO Auto-generated method stub
		// 把用户 输入的用户信息，用户名 和 密码，保存在系统中
		UserDAOImpl userDAOImpl = new UserDAOImpl();
		
		
		return userDAOImpl.saveUser(user);
	}

}
