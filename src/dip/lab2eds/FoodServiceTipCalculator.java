/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2eds;

import javax.swing.JOptionPane;

/**
 *
 * @author emanion
 */
public class FoodServiceTipCalculator implements InputTipCalculator {
    private static final double MIN_BILL = 0.00;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + MIN_BILL;
    private static final double GOOD_RATE = 0.20;
    private static final double FAIR_RATE = 0.15;
    private static final double POOR_RATE = 0.10;

    private double bill;
    private ServiceQuality serviceQuality;

    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
    }
    

    public FoodServiceTipCalculator() {
    }

    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = bill * GOOD_RATE;
                break;
            case FAIR:
                tip = bill * FAIR_RATE;
                break;
            case POOR:
                tip = bill * POOR_RATE;
                break;
        }

        return tip;
    }

    public final void setBill(double billAmt) {
        if(billAmt < MIN_BILL) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        String serviceQualityString = JOptionPane.showInputDialog
                 ("Service Quality? (GOOD/FAIR/POOR");
        serviceQualityString = serviceQualityString.toUpperCase();

        if (serviceQualityString.equals("GOOD")) {
            setServiceRating(ServiceQuality.GOOD);
        } else if (serviceQualityString.equals("FAIR")) {
            setServiceRating(ServiceQuality.FAIR);
        } else {
            setServiceRating(ServiceQuality.POOR);
        }

        return serviceQuality;
    }


    public double getBase() {
        String billString = JOptionPane.showInputDialog("Food Bill Amount?");
        setBill(Double.parseDouble(billString));
        return bill;
    }
    
    public int getQuantity() {
        int billQuantity = 1;
        return billQuantity;
    }
    
    public double getTipAmount() {
        double tipAmount = 0;
        tipAmount = getTip();

        return tipAmount;
    }
    
}
