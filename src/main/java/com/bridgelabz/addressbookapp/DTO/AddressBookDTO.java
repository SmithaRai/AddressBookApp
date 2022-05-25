package com.bridgelabz.addressbookapp.DTO;

public class AddressBookDTO {
    private String name ;
    private long phonenumber;

    public AddressBookDTO(AddressBookDTO addressBookDTO)
    {
        this.name = name;
        this.phonenumber = phonenumber;
    }

    public String getname() {
        return name;
    }

    public void setname(String fname) {
        this.name = fname;
    }



    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "AddressBookDTO{" +
                "fname='" + name + '\'' +
                ", phonenumber=" + phonenumber +
                '}';
    }
}
