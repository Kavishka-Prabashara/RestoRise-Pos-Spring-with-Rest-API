package lk.ijse.restorisespring.service.impl;

import lk.ijse.restorisespring.dto.StaffStatus;
import lk.ijse.restorisespring.dto.impl.StaffDTO;
import lk.ijse.restorisespring.entity.impl.StaffEntity;  // Assuming you have a Staff entity
import lk.ijse.restorisespring.dao.StaffDao;  // Assuming you have a StaffRepository or DAO
import lk.ijse.restorisespring.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffDao staffDao;  // Injecting repository to handle DB operations

    @Override
    public void saveStaff(StaffDTO staffDTO) {
        // Convert DTO to Entity and save to the database
        StaffEntity staffEntity = new StaffEntity(staffDTO.getStaffId(), staffDTO.getStaffName(), staffDTO.getStaffMobileNo());
        staffDao.save(staffEntity);
    }

    @Override
    public boolean deleteStaff(String staffId) {
        // Delete a staff member by ID
        staffDao.deleteById(staffId);
        return false;
    }

    @Override
    public void updateStaff(String staffId, StaffDTO staffDTO) {
        // Find the existing staff member, update fields, and save the updated entity
        StaffEntity existingStaff = staffDao.findById(staffId).orElseThrow(() -> new RuntimeException("Staff not found"));
        existingStaff.setStaffName(staffDTO.getStaffName());
        existingStaff.setStaffMobileNo(staffDTO.getStaffMobileNo());
        staffDao.save(existingStaff);  // Use staffDao instance, not StaffDao
    }

    @Override
    public List<StaffDTO> getAllStaff() {
        // Fetch all staff members and map them to DTOs
        return staffDao.findAll().stream()
                .map(staffEntity -> new StaffDTO(staffEntity.getStaffId(), staffEntity.getStaffName(), staffEntity.getStaffMobileNo()))
                .collect(Collectors.toList());
    }

    @Override
    public StaffStatus getStaff(String staffId) {
        // Find a specific staff member by ID and convert to DTO
        StaffEntity staffEntity = staffDao.findById(staffId).orElseThrow(() -> new RuntimeException("Staff not found"));
        return new StaffDTO(staffEntity.getStaffId(), staffEntity.getStaffName(), staffEntity.getStaffMobileNo());
    }
}
