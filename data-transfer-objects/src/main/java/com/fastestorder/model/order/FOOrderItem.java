package com.fastestorder.model.order;

import java.io.Serializable;

import com.fastestorder.model.menu.FOMenuItem;

public class FOOrderItem implements Serializable, Cloneable {

    private static final long serialVersionUID = 1118369519603316953L;

    private FOMenuItem menuItem;

    private int amount;

    public FOOrderItem() {
	super();
    }

    public FOOrderItem(FOMenuItem menuItem, int amount) {
	super();
	this.menuItem = menuItem;
	this.amount = amount;
    }

    public FOMenuItem getMenuItem() {
	return menuItem;
    }

    public void setMenuItem(FOMenuItem menuItem) {
	this.menuItem = menuItem;
    }

    public int getAmount() {
	return amount;
    }

    public void setAmount(int amount) {
	this.amount = amount;
    }

}
