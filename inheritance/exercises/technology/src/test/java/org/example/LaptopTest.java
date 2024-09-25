package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class LaptopTest {

    @Test
    public void properInit() {
        Laptop laptop = new Laptop(1024, "HP", "Spectre", true);
        assertEquals("Computer{uid=1, running=false, storage=1024, brand='HP', model='Spectre'}", laptop.toString());
    }

    @Test
    void testLidOpen() {
        Laptop laptop = new Laptop(1024, "HP", "Spectre", true);
        laptop.lidOpen();
        assertTrue(laptop.lidOpen);
    }

    @Test
    void testLidClose() {
        Laptop laptop = new Laptop(1024, "HP", "Spectre", true);
        laptop.lidOpen();
        laptop.lidOpen();
        assertFalse(laptop.lidOpen);
    }
}
