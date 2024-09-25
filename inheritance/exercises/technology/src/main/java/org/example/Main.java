package org.example;

public class Main {
    public static void main(String[] args) {

        Computer myPC = new Computer(1024, "Dell", "X595");
        Laptop myLaptop = new Laptop(256, "Google", "Chromebook", true);
        Smartphone myPhone = new Smartphone(64, "Apple", "iPhone 16", true);

        myPhone.powerOn();
        myPhone.findPhone();
        myPhone.powerOff();
        myPhone.findPhone();

        System.out.println(myPC);
        System.out.println(myLaptop);
        System.out.println(myPhone);
    }
}