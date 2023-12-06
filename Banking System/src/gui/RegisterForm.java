package gui;

import commonComponents.CommonConstants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RegisterForm  extends Form{
    public RegisterForm(){
        super("Register");
        guiComponents();
    }
    private void guiComponents(){
        //create register label
        JLabel registerLabel = new JLabel("Register");

        //configure component's x,y position and width/height values relative to GUI
        registerLabel.setBounds(0,25,520,100);

        //change the font color
        registerLabel.setForeground(CommonConstants.TEXT_COLOR);

        //change font size
        registerLabel.setFont(new Font("Dialog",Font.BOLD,40));

        // center text
        registerLabel.setHorizontalAlignment(SwingConstants.CENTER);

        //add components to GUI
        add(registerLabel);

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
        passwordLabel.setBounds(30,255,400,25);
        passwordLabel.setForeground(CommonConstants.TEXT_COLOR);
        passwordLabel.setFont(new Font("Dialog", Font.PLAIN,18));

        //create username text filed
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(30,285,450,55);
        passwordField.setBackground(CommonConstants.SECONDARY_COLOR);
        passwordField.setForeground(CommonConstants.TEXT_COLOR);
        passwordLabel.setFont(new Font("Dialog",Font.PLAIN,24));

        add(passwordLabel);
        add(passwordField);

        //create re-enter password label
        JLabel rePasswordLabel =new JLabel("Re-enter Password");
        rePasswordLabel.setBounds(30,365,400,25);
        rePasswordLabel.setForeground(CommonConstants.TEXT_COLOR);
        rePasswordLabel.setFont(new Font("Dialog", Font.PLAIN,18));

        //create username text filed
        JPasswordField rePasswordField = new JPasswordField();
        rePasswordField.setBounds(30,395,450,55);
        rePasswordField.setBackground(CommonConstants.SECONDARY_COLOR);
        rePasswordField.setForeground(CommonConstants.TEXT_COLOR);
        rePasswordField.setFont(new Font("Dialog",Font.PLAIN,24));

        add(rePasswordLabel);
        add(rePasswordField);

        // create register button
        JButton registerButton = new JButton("Register");
        registerButton.setFont(new Font("Dialog",Font.BOLD,18));

        //change the cursor to a hand when hover over the button
        registerButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        registerButton.setBackground(CommonConstants.TEXT_COLOR);
        registerButton.setBounds(125,520,250,50);

        add(registerButton);

        //create register label (used to load register GUI)
        JLabel loginLabel = new JLabel("Have an Account ? Login Here");
        loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
        loginLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        loginLabel.setForeground(CommonConstants.TEXT_COLOR);

        //add functionality so that when clicked it will launch the login form
        loginLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //dispose of this GUI
                RegisterForm.this.dispose();

                //launch the register GUI
                new LoginForm().setVisible(true);
            }

        });

        loginLabel.setBounds(125,600,250,30);

        add(loginLabel);
    }
}
