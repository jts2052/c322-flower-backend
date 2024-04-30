package edu.iu.jts11.flowershopbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema="flowers",name="orders")
public final class Order {
    @Id
    @GeneratedValue
    private int id;
    private String username;
    private int flowerId;

    private String purchaseOption; //Either "one-time" or "subscription"

    private String recipientFirstName;
    private String recipientLastName;
    private String recipientRelationship;

    private String deliveryDate; //Date is a string
    private String deliveryAddress;
    private String deliveryApt;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZipcode;

    private float totalCost;

    private String orderStatus;

    public Order() {
    }

    public Order(String username, int flowerId, String purchaseOption, String recipientFirstName, String recipientLastName, String recipientRelationship, String deliveryDate, String deliveryAddress, String deliveryApt, String deliveryCity, String deliveryState, String deliveryZipcode, float totalCost, String orderStatus) {
        this.username = username;
        this.flowerId = flowerId;
        this.purchaseOption = purchaseOption;
        this.recipientFirstName = recipientFirstName;
        this.recipientLastName = recipientLastName;
        this.recipientRelationship = recipientRelationship;
        this.deliveryDate = deliveryDate;
        this.deliveryAddress = deliveryAddress;
        this.deliveryApt = deliveryApt;
        this.deliveryCity = deliveryCity;
        this.deliveryState = deliveryState;
        this.deliveryZipcode = deliveryZipcode;
        this.totalCost = totalCost;
        this.orderStatus = orderStatus;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Order(int id, String username, int flowerId, String purchaseOption, String recipientFirstName, String recipientLastName, String recipientRelationship, String deliveryDate, String deliveryAddress, String deliveryApt, String deliveryCity, String deliveryState, String deliveryZipcode, float totalCost, String orderStatus) {
        this.id = id;
        this.username = username;
        this.flowerId = flowerId;
        this.purchaseOption = purchaseOption;
        this.recipientFirstName = recipientFirstName;
        this.recipientLastName = recipientLastName;
        this.recipientRelationship = recipientRelationship;
        this.deliveryDate = deliveryDate;
        this.deliveryAddress = deliveryAddress;
        this.deliveryApt = deliveryApt;
        this.deliveryCity = deliveryCity;
        this.deliveryState = deliveryState;
        this.deliveryZipcode = deliveryZipcode;
        this.totalCost = totalCost;
        this.orderStatus = orderStatus;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getFlowerId() {
        return flowerId;
    }

    public void setFlowerId(int flowerId) {
        this.flowerId = flowerId;
    }

    public String getPurchaseOption() {
        return purchaseOption;
    }

    public void setPurchaseOption(String purchaseOption) {
        this.purchaseOption = purchaseOption;
    }

    public String getRecipientFirstName() {
        return recipientFirstName;
    }

    public void setRecipientFirstName(String recipientFirstName) {
        this.recipientFirstName = recipientFirstName;
    }

    public String getRecipientLastName() {
        return recipientLastName;
    }

    public void setRecipientLastName(String recipientLastName) {
        this.recipientLastName = recipientLastName;
    }

    public String getRecipientRelationship() {
        return recipientRelationship;
    }

    public float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }

    public void setRecipientRelationship(String recipientRelationship) {
        this.recipientRelationship = recipientRelationship;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryApt() {
        return deliveryApt;
    }

    public void setDeliveryApt(String deliveryApt) {
        this.deliveryApt = deliveryApt;
    }

    public String getDeliveryCity() {
        return deliveryCity;
    }

    public void setDeliveryCity(String deliveryCity) {
        this.deliveryCity = deliveryCity;
    }

    public String getDeliveryState() {
        return deliveryState;
    }

    public void setDeliveryState(String deliveryState) {
        this.deliveryState = deliveryState;
    }

    public String getDeliveryZipcode() {
        return deliveryZipcode;
    }

    public void setDeliveryZipcode(String deliveryZipcode) {
        this.deliveryZipcode = deliveryZipcode;
    }
}
