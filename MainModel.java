/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author USER
 */
public class MainModel {
    private String id;
    private String name;
    private int qty;
    private String expired_at;
    private String catagory;

    public void setId(String id) {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
     
    public int getQty() {
        return qty;
    }

    public void setExpired_at(String expired_at) {
        this.expired_at = expired_at;
    }

    public String getExpired_at() {
        return expired_at;
    }

    public void setCategory(String catagory) {
        this.catagory = catagory;
    }

    public String getCategory() {
        return catagory;
    }

}
