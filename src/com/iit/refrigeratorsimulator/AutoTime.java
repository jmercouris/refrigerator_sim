/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iit.refrigeratorsimulator;

import javax.swing.*;

/**
 *
 * @author jmercouris
 */
public class AutoTime implements Runnable {

    JProgressBar referenceBar;
    boolean run = false;
    Interface referenceInterface;

    public AutoTime(JProgressBar progressBarReferenceInput, Interface interfaceInput) {
        super();
        referenceBar = progressBarReferenceInput;
        run = true;
        referenceInterface = interfaceInput;
    }

    public void run() {
        while (run) {
            try {
                Thread.sleep(100);
                int currentValue = referenceBar.getValue();
                currentValue++;
                if (currentValue > 100) {
                    currentValue = 0;
                    referenceInterface.incrementTime();
                }
                referenceBar.setValue(currentValue);

            } catch (Exception e) {
            }

        }

    }

    public boolean toggleActive() {
        run = !run;
        return run;
    }
}
