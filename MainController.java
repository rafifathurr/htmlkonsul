/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.MainModel;
import query.MainQuery;



/**
 *
 * @author USER
 */
public class MainController extends BaseController {
    MainQuery query = new MainQuery();
    ArrayList arrayList = new ArrayList();
    
    public ArrayList get() throws SQLException{
        String query = this.query.get;
        ResultSet rs = this.get(query);
        
        while (rs.next()){
            MainModel model = new MainModel();
            model.setId(rs.getString("id"));
            model.setName(rs.getString("name"));
            model.setCategory(rs.getString("catagory"));
            model.setExpired_at(rs.getString("expired_at"));
            model.setQty(rs.getInt("qty"));
            
            arrayList.add(model);
            
        }
        return arrayList;
        
    }

}