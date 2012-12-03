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
    private String name = "Test user";
    private float money = 2500;
    private int hunger = 80;
    private int thirst = 0;
    private Refrigerator refrigerator;

    User() {
        
    }
    
    public int getHunger(){
        return hunger;
    }
    
    public void incHunger(int calorie)
    {
        hunger += calorie;
    }
    
    public void decHunger()
    {
        hunger -= 20;
        
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
    
    public float getMoney(){
        return money;
    }
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        if (name.equals("")){
            this.name = "SPOOKY MYSTERY USER";}
        else{
            this.name = name;}
    }
}
