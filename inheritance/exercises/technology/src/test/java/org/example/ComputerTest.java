package org.example;

import org.example.Computer;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class ComputerTest {
    @Test
    public void properInit() {
        Computer computer = new Computer(512, "Dell", "XPS");
        assertEquals("Computer{uid=1, running=false, storage=512, brand='Dell', model='XPS'}", computer.toString());
    }

    @Test
    void testPowerOn() {
        Computer computer = new Computer(512, "Dell", "XPS");
        computer.powerOn();
        assertTrue(computer.running);
    }

    @Test
    void testPowerOff() {
        Computer computer = new Computer(512, "Dell", "XPS");
        computer.powerOn();
        computer.powerOff();
        assertFalse(computer.running);
    }
}
