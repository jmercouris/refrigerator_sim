/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iit.refrigeratorsimulator;

/**
 *
 * @author jmercouris, hkim
 */
public class User {

    private float money = 2500;
    private int hunger = 0;
    private int thirst = 0;
    private Refrigerator refrigerator;

    User() {
        refrigerator = new Refrigerator();
        
    }

    ////////////////////////////////////////////////////////////////////////////
    // Buy Water Filter
    ////////////////////////////////////////////////////////////////////////////
    public void buyWaterFilter() {
        if(spendMoney(Prices.WATER_FILTER_COST))
        {
        refrigerator.installWaterFilter(Store.sellWaterFilter(Prices.WATER_FILTER_COST));
        }
    }
    
    ////////////////////////////////////////////////////////////////////////////
    // Spend Money
    ////////////////////////////////////////////////////////////////////////////
    private boolean spendMoney(float inputCost){
        if (inputCost > money)
        {
            return false;
        }
        else
        {
            money-=inputCost;
            return true;
        }
    }
}
