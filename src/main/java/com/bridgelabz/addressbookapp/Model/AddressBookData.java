package com.bridgelabz.addressbookapp.Model;

import com.bridgelabz.addressbookapp.DTO.AddressBookDTO;


public class AddressBookData {
    private int id ;
    private String name ;
    private long phonenumber;



    public AddressBookData(int id ,AddressBookDTO addressBookDTO)
    {
        this.id = id;

        this.name = addressBookDTO.getname() ;

        this.phonenumber=addressBookDTO.getPhonenumber();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }
}
