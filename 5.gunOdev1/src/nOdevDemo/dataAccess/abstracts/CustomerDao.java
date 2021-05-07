package nOdevDemo.dataAccess.abstracts;

import nOdevDemo.entity.concrete.Customer;


public interface CustomerDao {
    void add(Customer customer);
    String mail(String message);
    void update(Customer customer);

}
