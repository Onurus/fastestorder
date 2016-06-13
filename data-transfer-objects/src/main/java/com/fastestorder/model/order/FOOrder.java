package com.fastestorder.model.order;

import java.io.Serializable;
import java.util.List;

public class FOOrder implements Serializable, Cloneable {

    private static final long serialVersionUID = -3042986130833456718L;

    private long id;
    private List<FOOrderItem> orderList;

    public FOOrder() {
	super();
    }

    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
    }

    public List<FOOrderItem> getOrderList() {
	return orderList;
    }

    public void setOrderList(List<FOOrderItem> orderList) {
	this.orderList = orderList;
    }

}
