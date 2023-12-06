package gui;

import commonComponents.CommonConstants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LoginForm extends Form{
    public LoginForm(){
        super("Login");
        guiComponents();
    }
    private void guiComponents(){
        //create login label
        JLabel loginLabel = new JLabel("Login");

        //configure component's x,y position and width/height values relative to GUI
        loginLabel.setBounds(0,25,520,100);

        //change the font color
        loginLabel.setForeground(CommonConstants.TEXT_COLOR);

        //change font size
        loginLabel.setFont(new Font("Dialog",Font.BOLD,40));

        // center text
        loginLabel.setHorizontalAlignment(SwingConstants.CENTER);

        //add components to GUI
        add(loginLabel);

        //create username label
        JLabel usernameLabel =new JLabel("Username");
        usernameLabel.setBounds(30,150,400,25);
        usernameLabel.setForeground(CommonConstants.TEXT_COLOR);
        usernameLabel.setFont(new Font("Dialog", Font.PLAIN,18));

        //create username text filed
        JTextField usernameField = new JTextField();
        usernameField.setBounds(30,185,450,55);
        usernameField.setBackground(CommonConstants.SECONDARY_COLOR);
        usernameField.setForeground(CommonConstants.TEXT_COLOR);
        usernameLabel.setFont(new Font("Dialog",Font.PLAIN,24));

        add(usernameLabel);
        add(usernameField);

        //create password label
        JLabel passwordLabel =new JLabel("Password");
        passwordLabel.setBounds(30,335,400,25);
        passwordLabel.setForeground(CommonConstants.TEXT_COLOR);
        passwordLabel.setFont(new Font("Dialog", Font.PLAIN,18));

        //create username text filed
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(30,365,450,55);
        passwordField.setBackground(CommonConstants.SECONDARY_COLOR);
        passwordField.setForeground(CommonConstants.TEXT_COLOR);
        passwordLabel.setFont(new Font("Dialog",Font.PLAIN,24));

        add(passwordLabel);
        add(passwordField);

        // create login button
        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("Dialog",Font.BOLD,18));

        //change the cursor to a hand when hover over the button
        loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        loginButton.setBackground(CommonConstants.TEXT_COLOR);
        loginButton.setBounds(125,520,250,50);

        add(loginButton);

        //create register label (used to load register GUI)
        JLabel registerLabel = new JLabel("Not a user ? Register Here");
        registerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        registerLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        registerLabel.setForeground(CommonConstants.TEXT_COLOR);

        //add functionality so that when clicked it will launch the register form
        registerLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //dispose of this GUI
                LoginForm.this.dispose();

                //launch the register GUI
                new RegisterForm().setVisible(true);
            }

        });

        registerLabel.setBounds(125,600,250,30);

        add(registerLabel);
    }

}
