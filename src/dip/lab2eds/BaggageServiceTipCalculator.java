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
public class BaggageServiceTipCalculator implements InputTipCalculator {

    private static final double MIN_BILL = 0.00;
    private static final double MAX_BILL = 100.00;
    private static final String BILL_ENTRY_ERR
            = "Error: bill must be between " + MIN_BILL + " and "
            + MAX_BILL;
    private static final double GOOD_RATE = 0.20;
    private static final double FAIR_RATE = 0.15;
    private static final double POOR_RATE = 0.10;

    private double baseTipPerBag;
    private int bagCount;
    private ServiceQuality serviceQuality;
    
    
    public BaggageServiceTipCalculator() {

        baseTipPerBag = 1.00; // set default value
    }

    public BaggageServiceTipCalculator(ServiceQuality q, int bags) {
        this.setServiceRating(q); // perform validation
        this.setBagCount(bags);

        baseTipPerBag = 1.00; // set default value
    }

    public double getTipForBaggeHandler() {
        double tip = 0.00; // always initialize local variables

        switch (serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + GOOD_RATE);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + FAIR_RATE);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + POOR_RATE);
                break;
        }

        return tip;
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

    public int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if (bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        if (baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

    public double getBase() {
        String baseTipString = JOptionPane.showInputDialog("Base Tip per bag?");
        setBaseTipPerBag(Double.parseDouble(baseTipString));
        return baseTipPerBag;
    }

    public int getQuantity() {
        String bagCountString = JOptionPane.showInputDialog("Bag count?");
        setBagCount(Integer.parseInt(bagCountString));
        return bagCount;
    }

    public double getTipAmount() {
        double tipAmount = 0;
        tipAmount = getTipForBaggeHandler();

        return tipAmount;
    }

}
