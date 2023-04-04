package org.example.Module;

public abstract class Product {
    private String name;
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + price;
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }


}
