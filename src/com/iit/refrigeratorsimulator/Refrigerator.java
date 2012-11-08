/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iit.refrigeratorsimulator;

/**
 *
 * @author jmercouris
 */
public class Refrigerator {
    WaterFilter waterFilter;
    ////////////////////////////////////////////////////////////////////////////
    // Update Status
    ////////////////////////////////////////////////////////////////////////////
    public void updateStatus(){
        checkWaterFilter();
        
        // Update UI
        
        // Check Foods
        
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
