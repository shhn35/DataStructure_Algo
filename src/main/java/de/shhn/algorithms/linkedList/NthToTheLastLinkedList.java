package de.shhn.algorithms.linkedList;


public class NthToTheLastLinkedList {

    public LinkedList findNthToTheLast(LinkedList head, int n) {
//        return primitiveImpl(head,n);
        return advancedImpl(head,n);
    }

    private  LinkedList advancedImpl(LinkedList head,int n){
        LinkedList current = head, result = null;

        for(int i = 0 ;i < n; i++){
            if(current == null)
                return result;
            current = current.next;
        }
        result = head;
        while (current !=null && current.next != null){
            current = current.next;
            result = result.next;
        }

        return result;

    }

    private LinkedList primitiveImpl(LinkedList head, int n){
        int nodeCount = 0;
        LinkedList current = head;
        // read all nodes in LinkedList
        while (current != null){
            nodeCount++;
            current = current.next;
        }

        if(nodeCount == 0)
            return null;

        current = head;
        for (int i=1;i<nodeCount-n;i++){
            current = current.next;
        }
        return current;
    }
    public static class LinkedList {
        public int val;
        public LinkedList next;

        public LinkedList() {
            this.val = val;
        }

        public LinkedList(int val) {
            this.val = val;
        }

        public LinkedList(int val, LinkedList next) {
            this.val = val;
            this.next = next;
        }
    }

}