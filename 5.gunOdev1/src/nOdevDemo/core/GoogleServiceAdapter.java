package nOdevDemo.core;

import nOdevDemo.googleServiceDao.GoogleCustomerDao;

public class GoogleServiceAdapter implements GoogleService{
    @Override
    public void addToLoginService(String message) {
        GoogleCustomerDao googleCustomerDao =new GoogleCustomerDao();
        googleCustomerDao.login(message);
    }
}
