package com.personal.projects.shopee.entities;

import java.util.Date;

public class Order {
    private Long order_id;
    private Boolean is_paid;
    private Date date;
    private Double price;
    private Boolean is_completed;
    private Long product_id;
    private Long address_id;
    private Long user_id;

    public Order(Long order_id, Boolean is_paid, Date date, Double price,
                 Boolean is_completed, Long product_id, Long address_id, Long user_id) {
        this.order_id = order_id;
        this.is_paid = is_paid;
        this.date = date;
        this.price = price;
        this.is_completed = is_completed;
        this.product_id = product_id;
        this.address_id = address_id;
        this.user_id = user_id;
    }

    public Order(Boolean is_paid, Date date, Double price,
                 Boolean is_completed, Long product_id, Long address_id, Long user_id) {
        this.is_paid = is_paid;
        this.date = date;
        this.price = price;
        this.is_completed = is_completed;
        this.product_id = product_id;
        this.address_id = address_id;
        this.user_id = user_id;
    }

    public Order(Boolean is_paid, Date date, Double price, Boolean is_completed) {
        this.is_paid = is_paid;
        this.date = date;
        this.price = price;
        this.is_completed = is_completed;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public Boolean getIs_paid() {
        return is_paid;
    }

    public void setIs_paid(Boolean is_paid) {
        this.is_paid = is_paid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getIs_completed() {
        return is_completed;
    }

    public void setIs_completed(Boolean is_completed) {
        this.is_completed = is_completed;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public Long getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Long address_id) {
        this.address_id = address_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", is_paid=" + is_paid +
                ", date=" + date +
                ", price=" + price +
                ", is_completed=" + is_completed +
                ", product_id=" + product_id +
                ", address_id=" + address_id +
                ", user_id=" + user_id +
                '}';
    }
}
