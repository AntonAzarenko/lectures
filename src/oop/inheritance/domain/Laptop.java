package oop.inheritance.domain;

public class Laptop extends Product<String> {

    private boolean keyboardLight;

    public boolean isKeyboardLight() {
        return keyboardLight;
    }

    public void setKeyboardLight(boolean keyboardLight) {
        this.keyboardLight = keyboardLight;
    }

    @Override
    public String toString() {
        return super.toString() + " Laptop{" +
                "keyboardLight=" + keyboardLight +
                '}';
    }
}
