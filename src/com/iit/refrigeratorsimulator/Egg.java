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
    
    public boolean eat(){
        return super.eat(DEC_AMOUNT);
    }
    
    public void buy(){
        super.buy(ADD_AMOUNT);
    }
    
}
