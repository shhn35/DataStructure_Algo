package de.shhn.algorithms.ds.unit;

import de.shhn.algorithms.ds.LinkedList;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {
    @Test
    public void emptyList(){
        LinkedList<Integer> list = new LinkedList<Integer>();
        assertEquals(null,list.removeItem());
    }

    @Test
    public void chainAddNodes(){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addItem(1);
        list.addItem(2);
        list.addItem(3);
        list.addItem(4);
        list.addItem(5);

        Integer expected = 1;
        assertEquals(expected,list.removeItem());

        expected = 2;
        assertEquals(expected,list.removeItem());

        expected = 3;
        assertEquals(expected,list.removeItem());

        list.addItem(6);

        expected = 4;
        assertEquals(expected,list.removeItem());

        list.addItem(7);

        expected = 5;
        assertEquals(expected,list.removeItem());

        expected = 6;
        assertEquals(expected,list.removeItem());

        expected = 7;
        assertEquals(expected,list.removeItem());


        assertEquals(null,list.removeItem());
        assertEquals(null,list.removeItem());
        assertEquals(null,list.removeItem());
        assertEquals(null,list.removeItem());


        list.addItem(10);
        expected = 10;
        assertEquals(expected,list.removeItem());
        assertEquals(null,list.removeItem());


    }
}
