package com.bridgelabz.addressbookapp.Model;

import com.bridgelabz.addressbookapp.DTO.AddressBookDTO;

import java.util.concurrent.atomic.AtomicLong;


public class AddressBookData {
    private int Id ;
    private String name ;
    private long phonenumber;

AtomicLong counter = new AtomicLong();



    public AddressBookData( int Id,AddressBookDTO addressBookDTO)
    {
        this.Id = Id;

        this.name = addressBookDTO.getname() ;

        this.phonenumber=addressBookDTO.getPhonenumber();

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = Id;
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
