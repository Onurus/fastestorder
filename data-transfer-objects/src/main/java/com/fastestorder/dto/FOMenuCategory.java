package com.fastestorder.dto;

import java.io.Serializable;
import java.util.List;

public class FOMenuCategory implements Serializable, Cloneable {

    private static final long serialVersionUID = -5860003882384991358L;

    private String name;
    private List<FOMenuItem> items;

    public FOMenuCategory() {
	super();
    }

    public FOMenuCategory(String name, List<FOMenuItem> items) {
	super();
	this.name = name;
	this.items = items;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public List<FOMenuItem> getItems() {
	return items;
    }

    public void setItems(List<FOMenuItem> items) {
	this.items = items;
    }

}
