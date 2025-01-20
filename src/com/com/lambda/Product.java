package com.com.lambda;

public class Product implements Comparable<Product>{

    private int id;
    private String name;
    private float price;
    private float rating;

    public Product() {
    }

    public Product(int id, String name, float price, float rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        if(this.getId() < o.getId())
            return -1;
        else if (this.getId() > o.getId())
            return 1;
        else
            return 0;
    }
}
