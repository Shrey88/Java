package com.collection.arrayList;

public class Contacts {
    private String contactName;
    private String contactNo;

    public Contacts(String contactName, String contactNo) {
        this.contactName = contactName;
        this.contactNo = contactNo;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
}
