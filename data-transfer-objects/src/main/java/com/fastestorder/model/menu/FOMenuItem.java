package com.fastestorder.model.menu;

import java.io.Serializable;

public class FOMenuItem implements Serializable, Cloneable {

    private static final long serialVersionUID = -5392464906963858205L;

    private int index;
    private String itemName;
    private int estimatedKCal;
    private double itemPrice;
    private String explanation;

    public FOMenuItem() {
	super();
    }

    public FOMenuItem(int index, String itemName, double itemPrice) {
	super();
	this.index = index;
	this.itemName = itemName;
	this.itemPrice = itemPrice;
    }

    public String getItemName() {
	return itemName;
    }

    public void setItemName(String itemName) {
	this.itemName = itemName;
    }

    public double getItemPrice() {
	return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
	this.itemPrice = itemPrice;
    }

    public int getIndex() {
	return index;
    }

    public void setIndex(int index) {
	this.index = index;
    }

    public int getEstimatedKCal() {
	return estimatedKCal;
    }

    public void setEstimatedKCal(int estimatedKCal) {
	this.estimatedKCal = estimatedKCal;
    }

    public String getExplanation() {
	return explanation;
    }

    public void setExplanation(String explanation) {
	this.explanation = explanation;
    }

}
