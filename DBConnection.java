/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author USER
 */
public class DBConnection {
    
    public Connection Open() {
        Connection con;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/dataobat";
            String user = "root";
            String pass = "";
            con = (Connection)DriverManager.getConnection(url, user, pass);
            System.out.println("CONNECTED!");
            return con;
        }catch(Exception e){
            System.out.println("Error" +e.getMessage());  
            return null;
        }
    }
}
