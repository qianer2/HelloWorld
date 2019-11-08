/**
 * @program:Login
 * @Description: 利用“Java图形用户界面(gui)”，创建登录窗口
 * @author: 卓佳倩
 * @date: 2019/11/8
 */
package com.apple.chapter.seven;

import javax.swing.*;

public class Login {
    //整个页面的大小设置，此处设置长宽均为400
    public static void main(String[] args){
        JFrame frame = new JFrame("用户登录窗口");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }
    private static void placeComponents(JPanel panel){
        panel.setLayout(null);
//这里的x,y是设置页面中用户名这三个字所处的位置
// width和height是我们设置的用户名这三个字所占的位置篇幅
        JLabel userLabel = new JLabel("用户名:");
        userLabel.setBounds(20,20,80,25);
        panel.add(userLabel);

//这里的xy是我们填入用户名的方框所在的位置
//width和height是这个方框所占的位置篇幅
        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

//这里的x,y是设置页面中密码这两个字所处的位置
// width和height是我们设置的密码这两个字所占的位置篇幅
        JLabel passwordLabel = new JLabel("密码:");
        passwordLabel.setBounds(20,50,80,25);
        panel.add(passwordLabel);

//这里的xy是我们要输入密码的方框所处的位置
//width和height是这个方框所占的位置篇幅
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

//xy是登录按钮所在的位置
        JButton loginButton = new JButton("登录");
        loginButton.setBounds(120,80,80,25);
        panel.add(loginButton);

    }
}
