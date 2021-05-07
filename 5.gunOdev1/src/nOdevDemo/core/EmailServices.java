package nOdevDemo.core;

import nOdevDemo.entity.concrete.Customer;

public interface EmailServices {
    void sendMail(Customer customer,String message);
}
