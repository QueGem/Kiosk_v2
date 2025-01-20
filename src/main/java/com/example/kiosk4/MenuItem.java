package com.example.kiosk4;

public class MenuItem {
    private String name;
    private double price;
    private String introduce;

    public MenuItem(String name, double price, String introduce){
        this.name = name;
        this.price = price;
        this. introduce = introduce;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getIntroduce() {
        return introduce;
    }

    @Override
    public String toString() {
        return name + " | W" + price + " | " + introduce;
    }
}
