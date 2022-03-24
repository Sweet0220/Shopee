package com.personal.projects.shopee.entities;

public class Address {
    private Long address_id;
    private String country;
    private String state;
    private String city;
    private String street;
    private Integer street_no;
    private String apartment;
    private Long user_id;
    private Long shop_id;

    public Address(Long address_id, String country, String state, String city,
                   String street, Integer street_no, String apartment, Long user_id, Long shop_id) {
        this.address_id = address_id;
        this.country = country;
        this.state = state;
        this.city = city;
        this.street = street;
        this.street_no = street_no;
        this.apartment = apartment;
        this.user_id = user_id;
        this.shop_id = shop_id;
    }

    public Address(String country, String state, String city,
                   String street, Integer street_no, String apartment, Long user_id, Long shop_id) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.street = street;
        this.street_no = street_no;
        this.apartment = apartment;
        this.user_id = user_id;
        this.shop_id = shop_id;
    }

    public Address(String country, String state, String city, String street, Integer street_no, String apartment) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.street = street;
        this.street_no = street_no;
        this.apartment = apartment;
    }

    public Long getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Long address_id) {
        this.address_id = address_id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getStreet_no() {
        return street_no;
    }

    public void setStreet_no(Integer street_no) {
        this.street_no = street_no;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getShop_id() {
        return shop_id;
    }

    public void setShop_id(Long shop_id) {
        this.shop_id = shop_id;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address_id=" + address_id +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", street_no=" + street_no +
                ", apartment='" + apartment + '\'' +
                ", user_id=" + user_id +
                ", shop_id=" + shop_id +
                '}';
    }
}
