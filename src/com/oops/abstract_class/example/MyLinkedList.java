package com.oops.abstract_class.example;

public class MyLinkedList implements NodeList {

    private ListItem root = null;

    public MyLinkedList(ListItem root){
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addITem(ListItem newItem) {
        if(this.root == null){
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = (currentItem.compareTo(newItem));

            if(comparison < 0){
                //newItem is greater, move right if possible
                if(currentItem.getNextItem() != null){
                    currentItem = currentItem.getNextItem();
                }else{
                    currentItem.setNextItem(newItem);
                    newItem.setPrevItem(currentItem);
                    return true;
                }
            } else if(comparison > 0){
                // new Item is less, insert before
                if(currentItem.getPrevItem() != null){
                    currentItem.getPrevItem().setNextItem(newItem);
                    newItem.setPrevItem(currentItem.getPrevItem());
                    newItem.setNextItem(currentItem);
                    currentItem.setPrevItem(newItem);
                }
                else {
                    //the node with a previous is root
                    newItem.setNextItem(this.root);
                    this.root.setPrevItem(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                System.out.println(newItem.getValue()  + " is already present, not added");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null){
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = currentItem.compareTo(item);
            if(comparison == 0){
                if(currentItem == this.root){
                    this.root = currentItem.getNextItem();
                } else {
                    currentItem.getPrevItem().setNextItem(currentItem.getNextItem());
                    if(currentItem.getNextItem() != null){
                        currentItem.getNextItem().setPrevItem(currentItem.getPrevItem());
                    }
                }
                return true;
            } else if (comparison < 0){
                currentItem = currentItem.getNextItem();
            } else {
                // comparison > 0
                // we are at an item greater than the one to be deleted.
                // so the item is not in the list.
            }
        }

        // we have reached the end of the list
        // without finding the item to delete
        return false;
    }

    @Override
    public void traverse(ListItem items) {
        if(items == null){
            System.out.println("The list is empty");
        }else {
            while (items != null) {
                System.out.println(items.getValue());
                items = items.getNextItem();
            }
        }
    }
}
