package de.shhn.algorithms.linkedList.unit;

import de.shhn.algorithms.linkedList.NthToTheLastLinkedList;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class NthToTheLastLinkedListTest {
    @Test
    public void test() {
// 1 -> 2 -> 3 -> 4 -> 5 -> 6
// n -> 2 ==> 4
// n -> 0 ==> 6

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);

        NthToTheLastLinkedList.LinkedList head = new NthToTheLastLinkedList.LinkedList();
        NthToTheLastLinkedList.LinkedList current = head;
        current.val = list1.get(0);
        current.next = new NthToTheLastLinkedList.LinkedList();
        current = current.next;

        current.val = list1.get(1);
        current.next = new NthToTheLastLinkedList.LinkedList();
        current = current.next;

        current.val = list1.get(2);
        current.next = new NthToTheLastLinkedList.LinkedList();
        current = current.next;

        current.val = list1.get(3);
        current.next = new NthToTheLastLinkedList.LinkedList();
        current = current.next;

        current.val = list1.get(4);
        current.next = new NthToTheLastLinkedList.LinkedList();
        current = current.next;

        current.val = list1.get(5);


        NthToTheLastLinkedList nthTothelast = new NthToTheLastLinkedList();

        Assert.assertEquals(4, nthTothelast.findNthToTheLast(head, 2).val);
        Assert.assertEquals(6, nthTothelast.findNthToTheLast(head, 0).val);
        Assert.assertEquals(1, nthTothelast.findNthToTheLast(head, 5).val);
        Assert.assertEquals(5, nthTothelast.findNthToTheLast(head, 1).val);
        Assert.assertEquals(1, nthTothelast.findNthToTheLast(head, 6).val);
    }
}
