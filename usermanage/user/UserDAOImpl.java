/**
 * 
 */
package com.google.user;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Administrator
 *
 */
public class UserDAOImpl implements UserDAO{

	// 用户信息保存
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		// 将用户信息保存在本地文件中
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(user.getUsername()));
			out.write((user.getUsername()+user.getUserpassword()));
			out.close();
			System.out.println("user data saved !");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return user;
	}

}
