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
public interface InputTipCalculator {
    
    public abstract ServiceQuality getServiceQuality();
    public abstract double getBase();
    public abstract int getQuantity();
    public abstract double getTipAmount();
    
    
    
}
