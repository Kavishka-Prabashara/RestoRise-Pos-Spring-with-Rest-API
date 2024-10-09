package lk.ijse.restorisespring.dao;

import lk.ijse.restorisespring.entity.impl.StaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffDao  extends JpaRepository<StaffEntity,String> {
}
