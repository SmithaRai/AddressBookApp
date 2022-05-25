package com.bridgelabz.addressbookapp.Controller;

import com.bridgelabz.addressbookapp.DTO.AddressBookDTO;
import com.bridgelabz.addressbookapp.DTO.ResponseDTO;
import com.bridgelabz.addressbookapp.Model.AddressBookData;
import com.bridgelabz.addressbookapp.Service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/address")
public class AddressBookController {

    @Autowired
    AddressBookService addressBookService;
    @GetMapping("/get/")
    public ResponseEntity<ResponseDTO> getAddressBookData(){
       return addressBookService.getAddressBookData();
    }

    @GetMapping("getid/{id}")
    public ResponseEntity<ResponseDTO> getAddressBookDatabyID(@PathVariable int id){
        return addressBookService.getAddressBookDatabyID(id);
    }

     @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
        return addressBookService.addAddressBookData(addressBookDTO);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
        return addressBookService.updateAddressBookData(addressBookDTO);
    }


    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable int Id) {
       return addressBookService.deleteAddressBookData(Id);
    }

}
