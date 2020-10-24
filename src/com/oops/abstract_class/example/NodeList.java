package com.oops.abstract_class.example;

public interface NodeList {

    ListItem getRoot();
    boolean addITem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
