package com.iit.refrigeratorsimulator;

public class Store {
    
    ////////////////////////////////////////////////////////////////////////////
    // Sell Water Filter
    ////////////////////////////////////////////////////////////////////////////
    public static WaterFilter sellWaterFilter (int inputMoney)
    {
        if (inputMoney > Prices.WATER_FILTER_COST)
        {
            return new WaterFilter();
        } 
       return null; 
    }
}
