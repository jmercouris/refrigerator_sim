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
    private double money = 300;
    private int hunger = 80;
    private int thirst = 0;
    private Refrigerator refrigerator;

    User() {
        
    }
    
    public void punishHunger (){
        hunger -=1;
    }
    
    public int getHunger(){
        return hunger;
    }
    
    public void incrementHunger(int calorie)
    {
        hunger += calorie;
    }
    
    public void decrementHunger()
    {
        if (hunger > 5)
        {
        hunger = (int)(hunger * .8);
        }
        else if (hunger > 0)
        {
            hunger--;
        }
        
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
    public boolean spendMoney(double inputCost){
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
    
    public double getMoney(){
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
