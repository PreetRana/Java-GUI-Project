package db;

import commonComponents.CommonConstants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//JDBC stands for Java Database Connectivity
//this class will be helpful in accessing our MySQL database
public class MyJDBC {
    //register new user to db
    //true - register success
    //false - register failure
    public static boolean register(String username, String password){
        //first check if username already exists in db

    }

    //check if username already exists in db
    //false - user doesn't exists
    //true - user exists in the db
    public static boolean checkUser(String username){
        try {
            Connection con = DriverManager.getConnection(CommonConstants.DB_URL,CommonConstants.DB_USERNAME,CommonConstants.DB_PASSWORD);
            PreparedStatement pst = con.prepareStatement("SELECT * FROM "+ CommonConstants.DB_USER_TABLE_NAME+ " WHERE USERNAME = ?");
        }
        catch (SQLException E){
            E.printStackTrace();
        }
    }

}
