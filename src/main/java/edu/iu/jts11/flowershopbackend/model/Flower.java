package edu.iu.jts11.flowershopbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema="flowers", name="flower")
public final class Flower {
    @Id
    private int id;
    private String name;
    private Type type;
    private Occasion occasion;
    private Color color;
    private float price;
    private float subscriptionPrice;

    public Flower() {
    }

    public Flower(int id, String name, Type type, Occasion occasion, Color color, float price, float subscriptionPrice) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.occasion = occasion;
        this.color = color;
        this.price = price;
        this.subscriptionPrice = subscriptionPrice;
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Occasion getOccasion() {
        return occasion;
    }

    public void setOccasion(Occasion occasion) {
        this.occasion = occasion;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public double getSubscriptionPrice() {
        return subscriptionPrice;
    }

    public void setSubscriptionPrice(float subscriptionPrice) {
        this.subscriptionPrice = subscriptionPrice;
    }
}
