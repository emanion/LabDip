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
public class TipCalculatorServiceTestDrive {
    
    public static void main(String[] args) {
        
        // first -  try Baggage ServiceTip Calculator
        InputTipCalculator bagTipOne = new BaggageServiceTipCalculator();
        OutputTipCalculator showTipOne = new OutputTipCalculatorGUI();
        TipCalculatorService calculatorOne = new TipCalculatorService(bagTipOne, showTipOne);
        
        calculatorOne.performTipCalculator();
        
        
        
        
        //second -  try food service tip calculator
        InputTipCalculator foodTiptwo = new FoodServiceTipCalculator();
        OutputTipCalculator showTipTwo = new OutputTipCalculatorGUI();
        TipCalculatorService calculatorTwo = new TipCalculatorService(foodTiptwo, showTipTwo);
        
        calculatorTwo.performTipCalculator();
        
        
    }
    
}
