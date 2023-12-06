package gui;

import commonComponents.CommonConstants;

import javax.swing.*;

public class Form extends JFrame {
    //Constructor Here...
    public Form(String Title){
        super(Title);

        //size of GUI
        setSize(520,680);

        //Configuring GUI when process will be end after closing..
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //set layout to null to disable layout management so we can use absolute positioning
        //to place the components wherever we want...
        setLayout(null);

        //load GUI to center of screen
        setLocationRelativeTo(null);

        //prevent GUI to changing size
        setResizable(false);

        //change the background color of GUI
        getContentPane().setBackground(CommonConstants.PRIMARY_COLOR);
    }
}
