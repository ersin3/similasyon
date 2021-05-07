package nOdevDemo.business.concretes;

import nOdevDemo.business.abstracts.AuthService;
import nOdevDemo.business.abstracts.CustomerService;
import nOdevDemo.core.EmailManager;
import nOdevDemo.core.EmailServices;
import nOdevDemo.core.GoogleService;
import nOdevDemo.entity.concrete.Customer;
import nOdevDemo.entity.dtos.LoginDto;

public class AuthManager implements AuthService {
    private CustomerService customerService;
    private GoogleService googleService;

    public AuthManager(CustomerService customerService, GoogleService googleService) {
        this.customerService = customerService;
        this.googleService=googleService;
    }

    @Override
    public void login(LoginDto loginDto, Customer customer) {
        var customer1 = customerService.getUserByMail(loginDto.getEmail());
        if (customer == null){
            System.out.println("Böyle bir kullanıcı sistemde mevcut değildir");
        }
        else{
            if (loginDto.getPassword().equals(customer.getPassword())){
                System.out.println("Hoşgeldiniz : " + customer.getName());
            }else{
                System.out.println("Hatalı şifre");
            }
        }
    }

    @Override
    public void register(Customer customer) {
      //Similasyon
        customerService.customerAdd(customer);
        googleService.addToLoginService("Lütfen mailinize gelen linkten hesabınızı onaylayınız "+customer.getName());
    }
}
