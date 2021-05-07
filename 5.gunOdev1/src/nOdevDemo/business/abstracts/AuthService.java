package nOdevDemo.business.abstracts;

import nOdevDemo.entity.concrete.Customer;
import nOdevDemo.entity.dtos.LoginDto;

public interface AuthService {
        void login(LoginDto loginDto,Customer customer);
        void register(Customer customer);
}
