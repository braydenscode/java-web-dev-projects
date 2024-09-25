package org.example;

public class Laptop extends Computer {
    private boolean hasTouchScreen;
    protected boolean lidOpen = false;

    public Laptop(int storage, String brand, String model, boolean hasTouchScreen) {
        super(storage, brand, model);
        this.hasTouchScreen = hasTouchScreen;
    }

    public void lidOpen() {
        lidOpen = !lidOpen;
    }

    public boolean isHasTouchScreen() {
        return hasTouchScreen;
    }
}
