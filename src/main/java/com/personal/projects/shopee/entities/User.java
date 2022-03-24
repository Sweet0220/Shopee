package com.personal.projects.shopee.entities;


import java.util.Date;

public class User {
    private Long user_id;
    private String first_name;
    private String last_name;
    private Date dob;
    private String email;
    private String password;
    private String phone_number;
    private String token;

    public User(Long user_id, String first_name, String last_name, Date dob,
                String email, String password, String phone_number, String token) {
        this.user_id = user_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.dob = dob;
        this.email = email;
        this.password = password;
        this.phone_number = phone_number;
        this.token = token;
    }

    public User() {
    }

    public User(String first_name, String last_name, Date dob, String email, String password, String phone_number, String token) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.dob = dob;
        this.email = email;
        this.password = password;
        this.phone_number = phone_number;
        this.token = token;
    }

    public User(String first_name, String last_name, Date dob, String email, String password, String phone_number) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.dob = dob;
        this.email = email;
        this.password = password;
        this.phone_number = phone_number;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
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

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
