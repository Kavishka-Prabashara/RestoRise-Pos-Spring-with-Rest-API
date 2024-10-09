package lk.ijse.restorisespring.entity.impl;

import jakarta.persistence.*;
import lk.ijse.restorisespring.entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "staff")
public class StaffEntity implements SuperEntity {
    @Id
    @Column(name = "staff_id", nullable = false)
    private String staffId;

    @Column(name = "staff_name", nullable = false)
    private String staffName;

    @Column(name = "staff_mobile_no", nullable = false)
    private int staffMobileNo;
}
