package com.oops.abstract_class.example;


public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem getNextItem() {
        return this.nextItem;
    }

    @Override
    ListItem getPrevItem() {
        return this.prevItem;
    }

    @Override
    void setNextItem(ListItem next) {
        this.nextItem = next;
    }

    @Override
    void setPrevItem(ListItem prev) {
        this.prevItem = prev;
    }

    @Override
    int compareTo(ListItem other) {
        if(other != null){
            // the value is stored in the Object type for making it more flexible
            // so when retrieving the value we can type cast into the correct form.
            return ( ( (String)super.getValue() ).compareTo( (String) other.getValue() ) );
        } else {
            return -1;
        }
    }
}
