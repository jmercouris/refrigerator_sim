package com.iit.refrigeratorsimulator;

public class WaterFilter {
    // Expiration Date Calculcated based on creation time Plus Thirty Days
    private double expirationDate;
    // Expiration Life is set to Thirty Days in seconds
    private static double expirationLife = 7889230;
    
    ////////////////////////////////////////////////////////////////////////////
    // Create New Water Filter
    ////////////////////////////////////////////////////////////////////////////
    WaterFilter()
    {
        expirationDate = (System.currentTimeMillis() / 1000) + expirationLife;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    // Get Expiration Status
    ////////////////////////////////////////////////////////////////////////////
    public boolean getExpirationStatus()
    {
        if (expirationDate >= (System.currentTimeMillis() / 1000))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}