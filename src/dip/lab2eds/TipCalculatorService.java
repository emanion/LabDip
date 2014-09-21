/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2eds;

/**
 *
 * @author emanion
 */
public class TipCalculatorService {

    
    InputTipCalculator inputTipCalculator;
    OutputTipCalculator outputTipCalculator;
    
    public TipCalculatorService(InputTipCalculator inputTipCalculator, 
                                OutputTipCalculator outputTipCalculator)
    {
        this.inputTipCalculator = inputTipCalculator;
        this.outputTipCalculator = outputTipCalculator;
    }
            
    public void performTipCalculator()
    {
        ServiceQuality serviceQuality = inputTipCalculator.getServiceQuality();
        double baseAmount = inputTipCalculator.getBase();
        int quantity = inputTipCalculator.getQuantity();
        double tipAmount = inputTipCalculator.getTipAmount();
        outputTipCalculator.showTip(tipAmount);
    }
    
    
    
}
