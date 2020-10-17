package de.shhn.algorithms.ds;

import java.util.LinkedList;
import java.util.List;

public class Queue {
    List<Integer> storage ;
    public Queue(){
        storage = new LinkedList<Integer>();
    }

    public boolean isEmpty(){
        return storage.isEmpty();
    }

    public void push(int value){

    }

    public int pull(){
        return 0;
    }
}
