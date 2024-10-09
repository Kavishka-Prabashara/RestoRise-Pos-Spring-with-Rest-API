package lk.ijse.restorisespring.dto.impl;

import lk.ijse.restorisespring.dto.StaffStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StaffDTO implements StaffStatus {

    private String staffId;
    private String staffName;
    private int staffMobileNo;

}
