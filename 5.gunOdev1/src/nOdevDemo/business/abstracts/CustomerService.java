package nOdevDemo.business.abstracts;

import nOdevDemo.entity.concrete.Customer;

public interface CustomerService {
    void customerAdd(Customer customer);
    String getUserByMail(String email);
}
