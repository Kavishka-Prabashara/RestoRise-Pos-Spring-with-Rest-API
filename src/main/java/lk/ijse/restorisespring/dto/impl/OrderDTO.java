package lk.ijse.restorisespring.dto.impl;

import lk.ijse.restorisespring.dto.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDTO implements OrderStatus {

    private String orderId;
    private int orderQTY;


}
