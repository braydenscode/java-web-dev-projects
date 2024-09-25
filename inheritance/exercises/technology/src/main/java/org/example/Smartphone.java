package org.example;

public class Smartphone extends Computer{
    private boolean has5G;
    protected boolean phoneLost = false;

    public Smartphone(int storage, String brand, String model, boolean has5G) {
        super(storage, brand, model);
        this.has5G = has5G;
    }

    public void findPhone() {
        if (running) {
            System.out.println("Phone is lost, please turn it in to the proper authorities.");
            phoneLost = true;
        }
    }

    public boolean has5G() {
        return has5G;
    }
}
