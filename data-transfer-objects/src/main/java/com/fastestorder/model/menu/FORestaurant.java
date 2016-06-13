package com.fastestorder.model.menu;

import java.io.Serializable;
import java.util.List;

public class FORestaurant implements Serializable, Cloneable {

    private static final long serialVersionUID = 9020315337106881464L;

    private long id;
    private String name;
    private String address;
    private FOMenu menu;
    private List<FOLanguage> supportedLanguages;

    public FORestaurant() {
	super();
    }

    public FORestaurant(long id, String name, String address, FOMenu menu, List<FOLanguage> supportedLanguages) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.menu = menu;
	this.supportedLanguages = supportedLanguages;
    }

    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getAddress() {
	return address;
    }

    public void setAddress(String address) {
	this.address = address;
    }

    public FOMenu getMenu() {
	return menu;
    }

    public void setMenu(FOMenu menu) {
	this.menu = menu;
    }

    public List<FOLanguage> getSupportedLanguages() {
	return supportedLanguages;
    }

    public void setSupportedLanguages(List<FOLanguage> supportedLanguages) {
	this.supportedLanguages = supportedLanguages;
    }

}
