package lk.ijse.restorisespring.service.impl;

import lk.ijse.restorisespring.dto.StaffStatus;
import lk.ijse.restorisespring.dto.impl.StaffDTO;
import lk.ijse.restorisespring.service.StaffService;

import java.util.List;

public class StaffServiceImpl implements StaffService {
    @Override
    public void saveStaff(StaffDTO staffDTO) {

    }

    @Override
    public void deleteStaff(String staffDTO) {

    }

    @Override
    public void updateStaff(String staffId, StaffDTO staffDTO) {

    }

    @Override
    public List<StaffDTO> getAllStaff() {
        return List.of();
    }

    @Override
    public StaffStatus getStaff(String staffId) {
        return null;
    }
}
