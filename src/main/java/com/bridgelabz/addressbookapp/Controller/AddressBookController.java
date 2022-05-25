package com.bridgelabz.addressbookapp.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/address")
public class AddressBookController {

    @RequestMapping(value={"","/","/home"})
    public ResponseEntity<String>getAddressBookData() {
        return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
    }

    @GetMapping("/get/{name}")
    public ResponseEntity<String> getAddressBookData(@PathVariable String name , @RequestParam long phonenumber){
        return new ResponseEntity<String>("name : "+ name + "\n Phonenumber : "+phonenumber, HttpStatus.OK);
    }

    @GetMapping("getid/{id}")
    public ResponseEntity<String> getAddressBookDatabyID(@PathVariable int id){
        return new ResponseEntity<String>("Get Call Success for ID : "+id, HttpStatus.OK);
    }

     @PostMapping("/create")
    public ResponseEntity<String> addAddressBookData(@RequestParam String name ,@RequestParam long phonenumber) {
        return new ResponseEntity<>("name : "+ name + "\n PhonenumberAddress : "+phonenumber,HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateAddressBookData(@RequestParam String name ,@RequestParam String phonenumber) {
        return new ResponseEntity<>("Updated Employee Payroll Data for :"+ "name : "+ name + "\n Phonenumber : "+phonenumber,HttpStatus.OK);
    }


    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<String> deleteAddressBookData(@PathVariable int Id) {
        return new ResponseEntity<>("Delete Call Success for id : "+Id ,HttpStatus.OK);
    }

}
