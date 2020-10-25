package de.shhn.algorithms.arrays;

import java.util.List;

public class KthElement<T extends Comparable<T>> {
    private boolean isAscendingCompare;

    public KthElement()
    {

    }

    public KthElement(boolean isAscending)
    {
        // this constructor is just for testing usage
        this.isAscendingCompare = isAscending;
    }

    public T BiggestByQuickSearch(List<T> list, int k){
        isAscendingCompare = false;
        // Do partition in Descending Manner
        return quickSearch(list,k);
    }

    public T SmallestByQuickSearch(List<T> list, int k){
        isAscendingCompare = true;
        // Do partition in Ascending manner
        return quickSearch(list,k);
    }

    private T quickSearch(List<T> list, int k){
        if(list.size()==0)
            return null;
        int left = 0 , right = list.size()-1;
        if(left>=right)
            return list.get(left);

        int pivotIndex;

        while (left<right){
            pivotIndex = partition(list,left,right);
            if(pivotIndex == k)
                break;
            if(pivotIndex < k)
                 // look the right
                left = pivotIndex+1;
             else
                 // look the left
                right = pivotIndex-1;
        }

        return list.get(k);
    }

    public int partition(List<T> list,int left,int right){
        T pivot = list.get(right);
        int partitionInd = left;

        for(int i = left; i< right;i++){
            if(isConditionTrue(list.get(i),pivot)){
                // In case of Ascending  --> list[i] < pivot
                // In case of Descending --> list[i] > pivot
                swap(list,i,partitionInd++);
            }
        }
        swap(list,right,partitionInd);

        return partitionInd;
    }

    private void swap(List<T> list,int srcInd,int desInd){
        T temp =list.get(srcInd);
        list.set(srcInd,list.get(desInd));
        list.set(desInd,temp);
    }

    public boolean isConditionTrue (T element1, T element2){
        if(isAscendingCompare){
            if(element1.compareTo(element2)== -1)
                // element1 < element2
                return true;
        }
        else{
            if(element1.compareTo(element2) == 1)
                // element1 > element2
                return true;
        }
        return false;
    }

}
