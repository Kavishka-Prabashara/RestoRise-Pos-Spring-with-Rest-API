/*
package lk.ijse.restorisespring.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.restorisespring.dao.CustomerDao;
import lk.ijse.restorisespring.customStatusCode.SelectedCustomerErrorCode;
import lk.ijse.restorisespring.dto.CustomerStatus;
import lk.ijse.restorisespring.dto.impl.CustomerDTO;
import lk.ijse.restorisespring.entity.impl.CustomerEntity;
import lk.ijse.restorisespring.exeption.CustomerNotFoundException;
import lk.ijse.restorisespring.service.CustomerService;
import lk.ijse.restorisespring.util.AppUtil;
import lk.ijse.restorisespring.util.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CustomerServiceImpl  {


    @Autowired
    private CustomerDao customerDAO;
    @Autowired
    private Mapping mapping;

    @Override
    public CustomerStatus getCustomer(String ID) {
        if (customerDAO.existsById(ID)) {
            CustomerEntity selectedCus = customerDAO.getReferenceById(ID);
            return mapping.toCustomerDTO(selectedCus);
        } else {
            return new SelectedCustomerErrorCode(2, "Customer Not Found!");
        }
    }

    @Override
    public List<CustomerDTO> getALLCustomers() {
        return mapping.getCustomerDTOList(customerDAO.findAll());
    }

    @Override
    public void saveCustomer(CustomerDTO dto) {
        dto.setCustomerID(AppUtil.generateCustomerID());
        System.out.println(dto.getGender());
        CustomerEntity savedCustomer =
                customerDAO.save(mapping.toCustomerEntity(dto));
        if (savedCustomer == null)
            throw new DataPersistException("Customer Not Saved!");
    }

    @Override
    public void updateCustomer(String ID, CustomerDTO dto) {
        Optional<CustomerEntity> tmpCustomer = customerDAO.findById(ID);
        if (!tmpCustomer.isPresent())
            throw new CustomerNotFoundException("Customer Not Found!");
        else
            tmpCustomer.get().setName(dto.getName());
        tmpCustomer.get().setGender(String.valueOf(dto.getGender()));
        tmpCustomer.get().setGmail(dto.getGmail());
        tmpCustomer.get().setPhnNo(dto.getPhnNo());
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return List.of();
    }

    @Override
    public void deleteCustomer(String ID) {
        Optional<CustomerEntity> tmpCustomer = customerDAO.findById(ID);
        if (!tmpCustomer.isPresent())
            throw new CustomerNotFoundException("Customer Not Found!");
        else
            customerDAO.deleteById(ID);
    }

}


*/
