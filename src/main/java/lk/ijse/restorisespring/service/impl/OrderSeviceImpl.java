package lk.ijse.restorisespring.service.impl;

import lk.ijse.restorisespring.dto.OrderStatus;
import lk.ijse.restorisespring.dto.impl.OrderDTO;
import lk.ijse.restorisespring.service.OrderService;

import java.util.List;

public class OrderSeviceImpl implements OrderService {
    @Override
    public void saveOrder(OrderDTO orderDTO) {

    }

    @Override
    public void deleteOrder(String orderDTO) {

    }

    @Override
    public void updateOrder(String orderId, OrderDTO orderDTO) {

    }

    @Override
    public List<OrderDTO> getAllOrder() {
        return List.of();
    }

    @Override
    public OrderStatus getOrder(String orderId) {
        return null;
    }
}
