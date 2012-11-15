/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iit.refrigeratorsimulator;

/**
 *
 * @author hkim, jmercouris
 */
public class Apple extends Food {
    
    private final int AMOUNT = 1;
    
    public Apple(){
        super();
        super.setName("Apple");
        super.setQuantity(0);
    }
    
    public void buyApple(){
        float curr = super.getQuantity();
        super.setQuantity(curr + AMOUNT);
    }
    
    public void eatApple(){
        float curr = super.getQuantity();
        if (curr != 0)
            super.setQuantity(curr - AMOUNT);
    }
    
    
    
}
