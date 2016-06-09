package com.fastestorder.dto;

import java.io.Serializable;

public class FOMenuItem implements Serializable, Cloneable {

    private static final long serialVersionUID = -5392464906963858205L;

    private String itemName;
    private double itemPrice;

    public FOMenuItem() {
	super();
    }

    public FOMenuItem(String itemName, double itemPrice) {
	super();
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

}
