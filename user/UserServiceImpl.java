package com.google.user;

public class UserServiceImpl implements UserService{

	//�û� ע��ľ���ʵ��
	@Override
	public User register(User user) {
		// TODO Auto-generated method stub
		// ���û� ������û���Ϣ���û��� �� ���룬������ϵͳ��
		UserDAOImpl userDAOImpl = new UserDAOImpl();
		
		
		return userDAOImpl.saveUser(user);
	}

}
