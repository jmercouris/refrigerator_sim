/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iit.refrigeratorsimulator;

/**
 *
 * @author HKIIT
 */
public class Milk extends Food {
    
    private final int ADD_AMOUNT = 2;
    private final float DEC_AMOUNT = (float) 0.5;
    
    public Milk(){
        super();
        super.setName("Milk");
        super.setQuantity(0);
    }
    
    public void buyMilk(){
        float curr = super.getQuantity();
        super.setQuantity(curr + ADD_AMOUNT);
    }
    
    public void drinkMilk(){
        float curr = super.getQuantity();
        if (curr != 0)
           super.setQuantity(curr - DEC_AMOUNT);
    }
}
