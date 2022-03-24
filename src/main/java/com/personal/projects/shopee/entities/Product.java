package com.personal.projects.shopee.entities;

public class Product {
    private Long product_id;
    private String category;
    private String name;
    private String code;
    private Double price;
    private String description;
    private Double rating;
    private Long shop_id;
    private Long order_id;

    public Product(Long product_id, String category, String name, String code, Double price,
                   String description, Double rating, Long shop_id, Long order_id) {
        this.product_id = product_id;
        this.category = category;
        this.name = name;
        this.code = code;
        this.price = price;
        this.description = description;
        this.rating = rating;
        this.shop_id = shop_id;
        this.order_id = order_id;
    }

    public Product(String category, String name, String code, Double price,
                   String description, Double rating, Long shop_id, Long order_id) {
        this.category = category;
        this.name = name;
        this.code = code;
        this.price = price;
        this.description = description;
        this.rating = rating;
        this.shop_id = shop_id;
        this.order_id = order_id;
    }

    public Product(String category, String name, String code, Double price, String description, Double rating) {
        this.category = category;
        this.name = name;
        this.code = code;
        this.price = price;
        this.description = description;
        this.rating = rating;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Long getShop_id() {
        return shop_id;
    }

    public void setShop_id(Long shop_id) {
        this.shop_id = shop_id;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                ", shop_id=" + shop_id +
                ", order_id=" + order_id +
                '}';
    }
}
