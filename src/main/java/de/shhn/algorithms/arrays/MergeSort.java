package de.shhn.algorithms.arrays;

public class MergeSort {
    MergeToSortedArray mergeArrays ;
    public MergeSort()
    {
        mergeArrays = new MergeToSortedArray();
    }

    public int[] sort(int[] arr,int implementationCode){
        switch (implementationCode){
            case 1:
                return sort_implement_1(arr);
            default:
                return new int[]{};
        }
    }

    private int[] sort_implement_1(int[] arr) {
        if (arr.length <= 1)
            return arr;
        int breakPoint = arr.length / 2;
        int[] subArr_1 = new int[breakPoint];
        int[] subArr_2 = new int[arr.length - breakPoint];

        System.arraycopy(arr, 0, subArr_1, 0, subArr_1.length);
        System.arraycopy(arr, breakPoint, subArr_2, 0, subArr_2.length);

        return mergeArrays.merge(sort_implement_1(subArr_1), sort_implement_1(subArr_2), 1);
    }
}
