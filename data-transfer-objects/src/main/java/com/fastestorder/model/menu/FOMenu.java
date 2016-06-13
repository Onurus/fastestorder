package com.fastestorder.model.menu;

import java.io.Serializable;
import java.util.Currency;
import java.util.List;

public class FOMenu implements Serializable, Cloneable {

    private static final long serialVersionUID = -4637499009276054295L;

    private Currency baseCurrency;
    private List<FOMenuCategory> calegories;

    public FOMenu() {
	super();
    }

    public FOMenu(Currency baseCurrency, List<FOMenuCategory> calegories) {
	super();
	this.baseCurrency = baseCurrency;
	this.calegories = calegories;
    }

    public Currency getBaseCurrency() {
	return baseCurrency;
    }

    public void setBaseCurrency(Currency baseCurrency) {
	this.baseCurrency = baseCurrency;
    }

    public List<FOMenuCategory> getCalegories() {
	return calegories;
    }

    public void setCalegories(List<FOMenuCategory> calegories) {
	this.calegories = calegories;
    }

}
