package com.bridgelabz.addressbookapp.Service;

import com.bridgelabz.addressbookapp.DTO.AddressBookDTO;
import com.bridgelabz.addressbookapp.DTO.ResponseDTO;
import com.bridgelabz.addressbookapp.Model.AddressBookData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AddressBookService {

   public ResponseEntity<ResponseDTO>getAddressBookData(){
      AddressBookData addressData = null;
      addressData = new AddressBookData(1,new AddressBookDTO("shravya",235465767));
      ResponseDTO respdata = new ResponseDTO("Get call success",addressData);
      return new ResponseEntity<ResponseDTO>(respdata, HttpStatus.OK);
   }

   public ResponseEntity<ResponseDTO> getAddressBookDatabyID(@PathVariable int id){
      AddressBookData addressData = null;
      addressData = new AddressBookData(id,new AddressBookDTO("shravya",235465767));
      ResponseDTO respdata = new ResponseDTO("Get call success",addressData);
      return new ResponseEntity<ResponseDTO>(respdata, HttpStatus.OK);
   }

   public ResponseEntity<ResponseDTO> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
      AddressBookData addressData = null;
      addressData = new AddressBookData(1,addressBookDTO);
      ResponseDTO respdata = new ResponseDTO("Created Addressbook Successfully",addressData);
      return new ResponseEntity<ResponseDTO>(respdata, HttpStatus.OK);
   }

   public ResponseEntity<ResponseDTO> updateAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
      AddressBookData addressData = null;
      addressData = new AddressBookData(1,addressBookDTO);
      ResponseDTO respdata = new ResponseDTO("Updated Addressbook Successfully",addressData);
      return new ResponseEntity<ResponseDTO>(respdata, HttpStatus.OK);
   }

   public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable int Id) {
      ResponseDTO respDTO = new ResponseDTO("Deleted Successfully ","Deleted id : " +Id);
      return new ResponseEntity<ResponseDTO>(respDTO ,HttpStatus.OK);

   }
}
