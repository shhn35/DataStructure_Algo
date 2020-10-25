package de.shhn.algorithms.arrays;

import java.util.List;

public class MergeSort {
    MergeToSortedArray mergeArrays ;
    public MergeSort()
    {
        mergeArrays = new MergeToSortedArray();
    }

    public int[] sort(int[] arr,int implementationCode){
        switch (implementationCode){
            case 1:
                return sortArray(arr);
            default:
                return new int[]{};
        }
    }

    private int[] sortArray(int[] arr) {
        if (arr.length <= 1)
            return arr;
        int breakPoint = arr.length / 2;
        int[] subArr_1 = new int[breakPoint];
        int[] subArr_2 = new int[arr.length - breakPoint];

        System.arraycopy(arr, 0, subArr_1, 0, subArr_1.length);
        System.arraycopy(arr, breakPoint, subArr_2, 0, subArr_2.length);

        return mergeArrays.mergeArray(sortArray(subArr_1), sortArray(subArr_2));
    }



}
