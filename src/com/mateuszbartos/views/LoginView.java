package com.mateuszbartos.views;

import javax.swing.*;

public class LoginView {

    public LoginView() {
        JFrame frame = new JFrame("SBD2 Event Manager");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);

        JLabel welcomeLabel = new JLabel("Please log in to view events");
        welcomeLabel.setBounds(0, 0, 290, 25);
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(welcomeLabel);

        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 30, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 30, 160, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 60, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 60, 160, 25);
        panel.add(passwordText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 100, 80, 25);
        panel.add(loginButton);
    }

}