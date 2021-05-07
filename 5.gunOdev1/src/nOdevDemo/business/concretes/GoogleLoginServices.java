package nOdevDemo.business.concretes;

import nOdevDemo.business.abstracts.AuthService;
import nOdevDemo.core.GoogleService;
import nOdevDemo.entity.concrete.Customer;
import nOdevDemo.entity.dtos.LoginDto;

public class GoogleLoginServices implements AuthService
{
    private GoogleService googleService;



    public GoogleLoginServices(GoogleService googleService) {
        this.googleService = googleService;
    }



    @Override
    public void login(LoginDto loginDto, Customer customer) {
        googleService.addToLoginService(loginDto.getEmail()+"hoş geldiniz");
    }

    @Override
    public void register(Customer customer) {
        System.out.println("hoş geldiniz");
    }
}
