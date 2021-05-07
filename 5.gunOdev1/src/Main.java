import nOdevDemo.business.abstracts.AuthService;
import nOdevDemo.business.abstracts.CustomerService;
import nOdevDemo.business.concretes.AuthManager;
import nOdevDemo.business.concretes.CustomerManager;
import nOdevDemo.business.concretes.GoogleLoginServices;
import nOdevDemo.core.GoogleService;
import nOdevDemo.core.GoogleServiceAdapter;
import nOdevDemo.dataAccess.concrete.HıbernateCustomerDao;
import nOdevDemo.entity.abstracts.Entity;
import nOdevDemo.entity.concrete.Customer;
import nOdevDemo.entity.dtos.LoginDto;

public class Main {

    public static void main(String[] args) {

        Customer customer1=new Customer(1,"ersin","karaaslan","54weewsa","ekaraaslan9699@gmail.com");
        CustomerService customerService=new CustomerManager(new HıbernateCustomerDao());
        GoogleService googleService1=new GoogleServiceAdapter();
        AuthService googleService=new GoogleLoginServices(googleService1);
        AuthService authService=new AuthManager(customerService,googleService1);
        LoginDto loginDto=new LoginDto("ekaraaslan9699@gmail.com ","45465454");

        authService.register(customer1);
        googleService.login(loginDto,customer1);
    }
}
