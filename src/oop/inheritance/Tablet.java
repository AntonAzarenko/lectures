package oop.inheritance;

public class Tablet extends Product{

    private double stilesLength;

    public double getStilesLength() {
        return stilesLength;
    }

    public void setStilesLength(double stilesLength) {
        this.stilesLength = stilesLength;
    }

    @Override
    public String toString() {
        return super.toString() + " Tablet{" +
                "stilesLength=" + stilesLength +
                '}';
    }
}
