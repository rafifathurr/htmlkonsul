/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.mysql.cj.protocol.Resultset;
import com.sun.rowset.CachedRowSetImpl;
import config.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author USER
 */
public class BaseController {
    DBConnection con = new DBConnection();
    
    public ResultSet get(String sql){
        try{
            Connection conn = con.Open();
            
            Statement state = conn.createStatement();
            ResultSet rs = state.executeQuery(sql);
            
            CachedRowSetImpl crs = new CachedRowSetImpl();
            crs.populate(rs);
            
            return crs;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
