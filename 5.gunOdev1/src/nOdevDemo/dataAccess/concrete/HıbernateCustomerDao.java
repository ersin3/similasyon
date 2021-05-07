package nOdevDemo.dataAccess.concrete;

import nOdevDemo.dataAccess.abstracts.CustomerDao;
import nOdevDemo.entity.concrete.Customer;

public class HıbernateCustomerDao implements CustomerDao {
    @Override
    public void add(Customer customer) {
        System.out.println("hibernate ile güncellendi "+ customer.getName());
    }

    @Override
    public String mail(String mail) {
       return mail;

    }

    @Override
    public void update(Customer customer) {
        System.out.println("hibernate ile güncellendi "+ customer.getName());
    }
}
