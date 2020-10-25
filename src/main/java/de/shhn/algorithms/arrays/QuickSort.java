package de.shhn.algorithms.arrays;

import java.util.List;

public class QuickSort implements Sort {
    public void sort(List<Integer> list) {
        sort(list,0,list.size()-1);
    }

    private void sort(List<Integer> list, int left, int right){
        if(left>=right)
            return;

        int partitionIndex = partition(list,left,right);

        // call recursively the right part and the left part of the list
        sort(list,left,partitionIndex-1);
        sort(list,partitionIndex+1,right);
    }

    private int partition(List<Integer> list, int left, int right){
        int pivot = list.get(right);
        int partition = left;

        for(int i = left; i<right;i++){
            if(list.get(i) <= pivot)
                swap(list,i,partition++);
        }

        swap(list,partition,right);

        return partition;
    }

    private void swap(List<Integer> list,int srcIndex, int destIndex){
        int temp = list.get(srcIndex);
        list.set(srcIndex, list.get(destIndex));
        list.set(destIndex,temp);
    }
}
