package lk.ijse.restorisespring.controller;

import lk.ijse.restorisespring.dto.impl.StaffDTO;
import lk.ijse.restorisespring.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;

    // 1. Get all staff members
    @GetMapping
    public List<StaffDTO> getAllStaff() {
        return staffService.getAllStaff();
    }

    // 2. Get a single staff member by ID
    @GetMapping("/{id}")
    public ResponseEntity<StaffDTO> getStaffById(@PathVariable String id) {
        StaffDTO staff = (StaffDTO) staffService.getStaff(id);
        if (staff != null) {
            return new ResponseEntity<>(staff, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // 3. Add a new staff member
    @PostMapping
    public ResponseEntity<StaffDTO> addStaff(@RequestBody StaffDTO staffDTO) {
        staffService.saveStaff(staffDTO);
        return new ResponseEntity<>(staffDTO, HttpStatus.CREATED);
    }

    // 4. Update an existing staff member
    @PutMapping("/{id}")
    public ResponseEntity<StaffDTO> updateStaff(@PathVariable String id, @RequestBody StaffDTO staffDTO) {
        staffService.updateStaff(id, staffDTO);
        return new ResponseEntity<>(staffDTO, HttpStatus.OK);
    }

    // 5. Delete a staff member by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStaff(@PathVariable String id) {
        boolean isDeleted = staffService.deleteStaff(id);
        if (isDeleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}



