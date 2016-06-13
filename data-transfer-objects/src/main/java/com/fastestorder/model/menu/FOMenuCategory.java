package com.fastestorder.model.menu;

import java.io.Serializable;
import java.util.List;

public class FOMenuCategory implements Serializable, Cloneable {

    private static final long serialVersionUID = -5860003882384991358L;

    private int index;

    private String name;

    private List<FOMenuItem> items;

    public FOMenuCategory() {
	super();
    }

    public FOMenuCategory(int index, String name, List<FOMenuItem> items) {
	super();
	this.index = index;
	this.name = name;
	this.items = items;
    }

    public int getIndex() {
	return index;
    }

    public void setIndex(int index) {
	this.index = index;
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
