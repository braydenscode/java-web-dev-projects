package org.example;

public class Computer extends AbstractEntity{
    private String brand;
    private String model;
    private int storage;
    protected boolean running;

    public Computer(int storage, String brand, String model) {
        super();
        this.storage = storage;
        this.brand = brand;
        this.model = model;
    }


    protected void powerOn() {
        if (!running) {
            System.out.println(brand + " " + model + " is powering on.");
        }
            running = true;
    }

    protected void powerOff() {
        if (running) {
            System.out.println(brand + " " + model + " is powering off.");
        }
        running = false;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "uid=" + uid +
                ", running=" + running +
                ", storage=" + storage +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
