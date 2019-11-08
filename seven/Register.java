/**
 * @program:Login
 * @Description: 利用“Java图形用户界面(gui)”，创建注册窗口
 * @author: 卓佳倩
 * @date: 2019/11/8
 */
package com.apple.chapter.seven;

import javax.swing.*;

public class Register {
    public static void main(String[] args){
        JFrame frame = new JFrame("用户注册窗口");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel){
        panel.setLayout(null);

        JLabel userLabel = new JLabel("用户名:");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        JLabel emailLabel = new JLabel("用户邮箱:");
        emailLabel.setBounds(10,50,80,25);
        panel.add(emailLabel);

        JTextField emailText = new JTextField(20);
        emailText.setBounds(100,50,165,25);
        panel.add(emailText);

        JLabel passwordLabel = new JLabel("用户密码:");
        passwordLabel.setBounds(10,80,80,25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,80,165,25);
        panel.add(passwordText);

        JButton registerButton = new JButton("注册");
        registerButton.setBounds(120,100,80,25);
        panel.add(registerButton);
    }
}
