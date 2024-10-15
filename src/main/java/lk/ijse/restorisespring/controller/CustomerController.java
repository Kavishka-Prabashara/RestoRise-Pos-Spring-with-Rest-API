/*
package lk.ijse.restorisespring.controller;

import lk.ijse.restorisespring.dto.impl.CustomerDTO;
import lk.ijse.restorisespring.entity.impl.CustomerEntity;
import lk.ijse.restorisespring.service.CustomerService;
import lk.ijse.restorisespring.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staff")
public class CustomerController {

    @Autowired
    private CustomerServiceImpl customerService;

    // 1. Get all staff members
    @GetMapping
    public List<CustomerDTO> getAllCustomers() {
        return customerService.ge();
    }

    // 2. Get a single staff member by ID
    @GetMapping("/{id}")
    public ResponseEntity<CustomerDTO> getCustomerById(@PathVariable String id) {
        CustomerDTO customerDTO = (CustomerDTO) customerService.getCustomer(id);
        if (CustomerEntity != null) {
            return new ResponseEntity<>(customerEntity, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // 3. Add a new staff member
    @PostMapping
    public ResponseEntity<CustomerDTO> addCustomer(@RequestBody CustomerDTO customerDTO) {
        customerService.saveCustomer(customerDTO);
        return new ResponseEntity<>(customerDTO, HttpStatus.CREATED);
    }

    // 4. Update an existing staff member
    @PutMapping("/{id}")
    public ResponseEntity<CustomerDTO> updateCustomer(@PathVariable String id, @RequestBody CustomerDTO customerDTO) {
        customerService.updateCustomer(id, customerDTO);
        return new ResponseEntity<>(customerDTO, HttpStatus.OK);
    }

    // 5. Delete a staff member by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable String id) {
        boolean isDeleted = customerService.deleteCustomer(id);
        if (isDeleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}



*/
