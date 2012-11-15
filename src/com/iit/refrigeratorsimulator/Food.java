/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iit.refrigeratorsimulator;

/**
 *
 * @author jmercouris, hkim
 */
public class Food {
    
    private String name;
    private float quantity;
    
    
    public Food(){
        name = null;
        quantity = 0;
        
    }
    
    public String getName(){
        return name;
    }
    
    public float getQuantity(){
        return quantity;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setQuantity(float quantity){
        this.quantity = quantity;
    }
    
}
