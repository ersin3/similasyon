package nOdevDemo.business.concretes;

import nOdevDemo.business.abstracts.CustomerService;

import nOdevDemo.dataAccess.abstracts.CustomerDao;
import nOdevDemo.entity.concrete.Customer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerManager implements CustomerService {
    private CustomerDao customerDao;
    public CustomerManager(CustomerDao customerDao){
        this.customerDao=customerDao;
    }
    @Override
    public void customerAdd(Customer customer) {
        Pattern p = Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(customer.getMail());
        if(customer.getPassword().length()<6){
            System.out.println("şifreniz 6 haneden büyük olmalıdır");
        }if(customer.getLastName().length()<2 || customer.getName().length()<2){
            System.out.println("iki haneden az olmamalı isim soyisim");
        }if(m.find()){
                customerDao.add(customer);

        }else{
            System.out.println("email geçersiz");
        }
    }

    @Override
    public String getUserByMail(String email) {
    return email;
    }
}
