package nOdevDemo.entity.concrete;

import nOdevDemo.entity.abstracts.Entity;

public class Customer implements Entity {
    private int id;
    private String name;
    private String lastName;
    private String password;
    private String mail;
    public Customer(int id, String name, String lastName, String password, String mail) {
        this.setId(id);
        this.setName(name);
        this.setLastName(lastName);
        this.setPassword(password);
        this.setMail(mail);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
