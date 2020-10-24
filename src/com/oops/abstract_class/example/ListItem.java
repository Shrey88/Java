package com.oops.abstract_class.example;

public abstract class ListItem {

    protected ListItem nextItem = null;
    protected ListItem prevItem = null;

    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    abstract ListItem getNextItem();

    abstract ListItem getPrevItem();

    abstract void setNextItem(ListItem next);

    abstract void setPrevItem(ListItem prev);

    abstract int compareTo(ListItem other);

}
