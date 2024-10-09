package lk.ijse.restorisespring.service;

import lk.ijse.restorisespring.dto.CustomerStatus;
import lk.ijse.restorisespring.dto.impl.CustomerDTO;

import java.util.List;

public interface CustomerService {
    void saveCustomer(CustomerDTO customerDTO);
    void deleteCustomer(String customerId);
    void updateCustomer(String customerId, CustomerDTO customerDTO);
    List<CustomerDTO> getAllCustomers();
    CustomerStatus getCustomer(String customerId);

}
