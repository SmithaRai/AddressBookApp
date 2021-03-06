package com.bridgelabz.addressbookapp.Controller;

import com.bridgelabz.addressbookapp.DTO.AddressBookDTO;
import com.bridgelabz.addressbookapp.DTO.ResponseDTO;
import com.bridgelabz.addressbookapp.Model.AddressBookData;
import com.bridgelabz.addressbookapp.Service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/address")
public class AddressBookController {

    @Autowired
    IAddressBookService addressBookService;
    @GetMapping("/get/")
    public ResponseEntity<ResponseDTO> getAddressBookData(){
       List<AddressBookData> addressBookDataList = null ;
        addressBookDataList = addressBookService.getAddressBookData();
        ResponseDTO respDTO = new ResponseDTO("Get Call Successful",addressBookDataList);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);

    }

    @GetMapping("getid/{id}")
    public ResponseEntity<ResponseDTO> getAddressBookDatabyID(@PathVariable int Id){
        AddressBookData addressBookData =null;
        addressBookData =  addressBookService.getAddressBookDatabyID(Id);
        ResponseDTO respDTO = new ResponseDTO("Get Call For ID Successful",addressBookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

     @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
         AddressBookData addressBookData = null;
         addressBookData = addressBookService.addAddressBookData(addressBookDTO);
         ResponseDTO respDTO = new ResponseDTO("Created Employee Payroll Data Successful",addressBookData);
         return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = addressBookService.addAddressBookData(addressBookDTO);
        ResponseDTO respDTO = new ResponseDTO("Updated Employee Payroll Data Successful",addressBookData);
        return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
    }


    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable int Id) {
        addressBookService.deleteAddressBookData(Id);
        ResponseDTO respDTO = new ResponseDTO("Deleted Successfully ","Deleted id : " +Id);
        return new ResponseEntity<ResponseDTO>(respDTO ,HttpStatus.OK);

    }

}
