package nOdevDemo.core;

import nOdevDemo.entity.concrete.Customer;

public class EmailManager implements EmailServices{
    @Override
    public void sendMail(Customer customer, String message) {
        System.out.println(customer.getName()+" "+customer.getLastName()+" "+message);
    }
}
