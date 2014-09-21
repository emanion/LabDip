/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2eds;
import javax.swing.*;

/**
 *
 * @author emanion
 */
public class OutputTipCalculatorGUI implements OutputTipCalculator {
    
    public void showTip(double tipAmount)
    {
        JOptionPane.showMessageDialog(null, "The Tip Amount is " + tipAmount);
    }
    
}
