package oop.inheritance;

import java.math.BigDecimal;

public class Product {

    private Type type;
    private String model;
    private BigDecimal cost;
    private String vendor;
    private String color;
    private double displaySize;
    private double weight;
    private int chargeCapacitor;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getChargeCapacitor() {
        return chargeCapacitor;
    }

    public void setChargeCapacitor(int chargeCapacitor) {
        this.chargeCapacitor = chargeCapacitor;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type=" + type +
                ", model='" + model + '\'' +
                ", cost=" + cost +
                ", vendor='" + vendor + '\'' +
                ", color='" + color + '\'' +
                ", displaySize=" + displaySize +
                ", weight=" + weight +
                ", chargeCapacitor=" + chargeCapacitor +
                '}';
    }
}
