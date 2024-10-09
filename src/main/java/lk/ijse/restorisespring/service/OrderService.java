package lk.ijse.restorisespring.service;

import lk.ijse.restorisespring.dto.OrderStatus;
import lk.ijse.restorisespring.dto.impl.OrderDTO;

import java.util.List;

public interface OrderService {
    void saveOrder(OrderDTO orderDTO);
    void deleteOrder(String orderDTO);
    void updateOrder(String orderId, OrderDTO orderDTO);
    List<OrderDTO> getAllOrder();
    OrderStatus getOrder(String orderId);
}
