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

    private final int ADD_AMOUNT = 1, DEC_AMOUNT = ADD_AMOUNT;

    public Apple() {
        super();
        super.setName("Apple");
        super.setQuantity(0);
    }

    public boolean eat() {
        return super.eat(DEC_AMOUNT);
    }

    public void buy() {
        super.buy(ADD_AMOUNT);
    }
}
