package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class FactorialContainerTest {

    @Test
    public void testInitiatingList() {
        FactorialContainer factorialContainer = new FactorialContainer(3);
        ArrayList<Integer> list = factorialContainer.addElements();

        assertEquals(4, list.size());

        assertEquals(1, list.get(0));
        assertEquals(1, list.get(1));
        assertEquals(2, list.get(2));
        assertEquals(6, list.get(3));
    }

    @Test
    public void testFactorialZero() {
        FactorialContainer factorialContainer = new FactorialContainer(1);
        assertEquals(1, factorialContainer.count(0));
    }

    @Test
    public void testFactorialOne() {
        FactorialContainer factorialContainer = new FactorialContainer(1);
        assertEquals(1, factorialContainer.count(1));
    }

}