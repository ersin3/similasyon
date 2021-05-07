package nOdevDemo.entity.dtos;

import nOdevDemo.entity.abstracts.Entity;

public class LoginDto implements Entity {
    private String email;
    private String password;
    public LoginDto (String email,String password){
        this.setEmail(email);
        this.setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
