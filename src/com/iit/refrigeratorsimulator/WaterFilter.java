package com.iit.refrigeratorsimulator;

public class WaterFilter {
    // Expiration Date Calculcated based on creation time Plus Thirty Days
    private double expirationDate;
    // Expiration Life is set to Thirty Days in seconds
    private static int expirationLife = 30;
    private static int quantity = 1;
    
    ////////////////////////////////////////////////////////////////////////////
    // Create New Water Filter
    ////////////////////////////////////////////////////////////////////////////
    WaterFilter()
    {
        
    }
    
    ////////////////////////////////////////////////////////////////////////////
    // Get Expiration Status
    ////////////////////////////////////////////////////////////////////////////
    public boolean getExpirationStatus()
    {
        if (expirationLife < 6)
            return true;
        else
            return false;
    }
    
    public int getExpDate(){
        return expirationLife;
    }
    
    public int getQuantity(){
        if (quantity == 0)
            return quantity;
        else
            return quantity-1;
    }
    
    public void setNewFilter(){
        expirationLife = 30;
    }
    
    public void decExpDate(){
        if (expirationLife > 0)
            expirationLife -= 1;
    }
    
    public void incQuantity(){
        quantity += 1;
    }
    
    public void decQuantity(){
        quantity -= 1;
    }
    
}