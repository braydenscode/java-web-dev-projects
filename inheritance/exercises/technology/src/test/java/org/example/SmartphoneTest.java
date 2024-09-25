package org.example;

import org.junit.jupiter.api.Test;
import java.io.PrintStream;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class SmartphoneTest {
    @Test
    public void properInit() {
        Smartphone smartphone = new Smartphone(8, "Apple", "iPhone 3GS", false);
        assertEquals("Computer{uid=1, running=false, storage=8, brand='Apple', model='iPhone 3GS'}", smartphone.toString());
    }

    @Test
    public void testFindPhoneWhenOff() {
        Smartphone smartphone = new Smartphone(8, "Apple", "iPhone 3GS", false);
        smartphone.findPhone();
        assertFalse(smartphone.phoneLost);
    }

    @Test
    public void testFindPhoneWhenOn() {
        Smartphone smartphone = new Smartphone(8, "Apple", "iPhone 3GS", false);
        smartphone.powerOn();
        smartphone.findPhone();
        assertTrue(smartphone.phoneLost);
    }
}
