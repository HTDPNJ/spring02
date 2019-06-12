package com.hfut.pojo;

public class Desk {
    private int id;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Desk{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }
}
