/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iit.refrigeratorsimulator;

/**
 *
 * @author jmercouris, hkim
 */
public class Refrigerator {
    private final int NUM_FOOD = 4;
    public int time = 90;
    float [] quantStat = new float [6];
    
    User user = new User();
    
    Food apple = new Apple();
    Food oj = new OrangeJuice();
    Food egg = new Egg();
    Food milk = new Milk();
    
    WaterFilter waterFilter;
    
    
    public String [] getQuantity(){
        String [] display = new String [NUM_FOOD]; 
        
        display[0] = Integer.toString((int)apple.getQuantity());
        display[1] = Float.toString(oj.getQuantity());
        display[2] = Integer.toString((int)egg.getQuantity());
        display[3] = Float.toString(milk.getQuantity());
        
        return display;
    }
    
    public void decTime(){
        time -= 1;
        user.decHunger();
    }
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    // Update Status
    ////////////////////////////////////////////////////////////////////////////
    public void updateStatus(){
        checkWaterFilter();
        
        // Update UI
        
        
        // Check Foods
        
    }
    
    ////////////////////////////////////////////////////////////////////////////
    // Consume Food
    // Take food id as a parameter.
    // Decrement the food of the id.
    // return calories of the food to the user.
    
    public int consumeFood(int id){
        
        return 0;
    }
    
    public void buyWaterFilter(){
        
    }
    
    ////////////////////////////////////////////////////////////////////////////
    // Install Water Filter
    ////////////////////////////////////////////////////////////////////////////
    public void installWaterFilter(WaterFilter inputWaterFilter)
    {
        waterFilter = inputWaterFilter;
        System.out.println("Water Filter Installed");
    }
    
    ////////////////////////////////////////////////////////////////////////////
    // Get Water Filter
    ////////////////////////////////////////////////////////////////////////////
    public boolean checkWaterFilter()
    {
        System.out.println("Checking Water Filter");
        return waterFilter.getExpirationStatus();
    }
}
