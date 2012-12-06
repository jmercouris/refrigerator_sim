/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iit.refrigeratorsimulator;

/**
 *
 * @author hkim, jmercouris
 */
public class OrangeJuice extends Food {
    
    private final int ADD_AMOUNT = 2;
    private final float DEC_AMOUNT = (float) 0.5;
    
    public OrangeJuice(){
        super();
        super.setName("Orange Juice");
        super.setQuantity(0);
    }
    
    
    public boolean eat(){
        return super.eat(DEC_AMOUNT);
    }
    
    public void buy(){
        super.buy(ADD_AMOUNT);
    }
    
    
}
