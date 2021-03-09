package de.shhn.algorithms.ds;

public class LinkedList<T> {
    private class ListNode<T>{
        private T value;
        private ListNode next;

        public ListNode(T value){
            this.value = value;
        }
    }

    private ListNode head,tail;

    public void addItem(T value){
        ListNode newNode = new ListNode(value);

        if(head == null) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = tail.next;
        }
    }

    public T removeItem(){
        if(head != null){
            T val = (T)head.value;
            head = head.next;
            return val;
        }else
            return null;
    }
}
