package lk.ijse.restorisespring.service.impl;

import lk.ijse.restorisespring.dto.CustomerStatus;
import lk.ijse.restorisespring.dto.impl.CustomerDTO;
import lk.ijse.restorisespring.service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public void saveCustomer(CustomerDTO customerDTO) {

    }

    @Override
    public void deleteCustomer(String customerId) {

    }

    @Override
    public void updateCustomer(String customerId, CustomerDTO customerDTO) {

    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return List.of();
    }

    @Override
    public CustomerStatus getCustomer(String customerId) {
        return null;
    }
}
