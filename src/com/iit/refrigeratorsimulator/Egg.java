/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iit.refrigeratorsimulator;

/**
 *
 * @author HKIIT
 */
public class Egg extends Food {
    
    private final int ADD_AMOUNT = 6;
    private final int DEC_AMOUNT = 2;
    
    public Egg(){
        super();
        super.setName("Egg");
        super.setQuantity(0);
    }
    
    public void buyEgg(){
        float curr = super.getQuantity();
        super.setQuantity(curr + ADD_AMOUNT);
    }
    
    public void eatEgg(){
        float curr = super.getQuantity();
        if (curr != 0)
           super.setQuantity(curr - DEC_AMOUNT);
    }
    
}
