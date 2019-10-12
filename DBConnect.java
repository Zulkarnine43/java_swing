package client;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shaon
 */
public class DBConnect {
    private Connection con;
    private Statement st;
    private ResultSet rs;
        public DBConnect(){
        try{
            Class.forName("com.mysql.jbdc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/client?zeroDateTimeBehavior=convertToNull","root","");
                st = con.createStatement();
        }catch(Exception ex){
            System.out.println("Error"+ex);
        }
    }
         public void getData(){
        try{
           // String query ="INSERT INTO userData (username,password) VALUES ";
           // rs=st.executeQuery(query);
           // System.out.println("Records from database");
            System.out.println("Database connect successfully");
           
        }catch(Exception ex){
            System.out.println("Error"+ex);
        }
}
}
