package com.bridgelabz.addressbookapp.Service;

import com.bridgelabz.addressbookapp.DTO.AddressBookDTO;
import com.bridgelabz.addressbookapp.Model.AddressBookData;

import java.util.List;

public interface IAddressBookService {

    public List<AddressBookData> getAddressBookData();

    public AddressBookData getAddressBookDatabyID(int Id);

    public AddressBookData addAddressBookData(AddressBookDTO addressBookDTO);

    public AddressBookData updateAddressBookData(int Id,AddressBookDTO addressBookDTO);

    public void deleteAddressBookData(int empId);
}
