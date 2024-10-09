package lk.ijse.restorisespring.service;

import lk.ijse.restorisespring.dto.OrderStatus;
import lk.ijse.restorisespring.dto.StaffStatus;
import lk.ijse.restorisespring.dto.impl.StaffDTO;

import java.util.List;

public interface StaffService {
    void saveStaff(StaffDTO staffDTO);
    void deleteStaff(String staffDTO);
    void updateStaff(String staffId, StaffDTO staffDTO);
    List<StaffDTO> getAllStaff();
    StaffStatus getStaff(String staffId);
}
