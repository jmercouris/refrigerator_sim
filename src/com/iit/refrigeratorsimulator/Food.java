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

    public Food() {
        name = null;
        quantity = 0;

    }

    public String getName() {
        return name;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public void buy(float inputAmount) {
        quantity += inputAmount;
    }

    public void buy() {
        quantity++;
    }

    public boolean eat(float inputAmount) {
        if (quantity >= inputAmount) {
            quantity -= inputAmount;
            return true;
        }
        return false;
    }

    public boolean eat() {
        if (quantity >= 1) {
            quantity--;
            return true;
        }
        return false;
    }
}
