package de.shhn.algorithms.arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MergeToSortedArray {
    public int[] mergeArray(int[] arr1, int[] arr2){
        return mergeImplement1(arr1,arr2);
    }
    public List<Integer> mergeList(List<Integer> list1, List<Integer> list2)
    {
        return mergeListImpl1(list1,list2);
    }

    private int[] mergeImplement1(int[] arr1,int[] arr2){
        int[] arrOut = new int[arr1.length + arr2.length];

        int ind1 = 0, ind2 = 0;

        for (int i = 0; i< arrOut.length; i++){
            if(ind1 == arr1.length){
                arrOut[i] = arr2[ind2++];
            }
            else if(ind2 == arr2.length){
                arrOut[i] = arr1[ind1++];
            }
            else if(arr1[ind1] < arr2[ind2]){
                arrOut[i] = arr1[ind1++];
            }
            else{
                arrOut[i] = arr2[ind2++];
            }
        }
        return arrOut;
    }

    private int[] mergeImplement2(int[] arr1, int[] arr2){
        int[] arrOut = new int[arr1.length + arr2.length];

        int ind1 = 0, ind2 = 0;

        for (int i = 0; i< arrOut.length; i++){
            if(ind1 == arr1.length ||
                    (ind2 < arr2.length &&
                            arr1[ind1] >= arr2[ind2])){
                arrOut[i] = arr2[ind2++];
            }
            else if(ind2 == arr2.length ||
                    arr1[ind1] < arr2[ind2]){
                arrOut[i] = arr1[ind1++];
            }
        }
        return arrOut;
    }

    private int[] mergeImplement3(int[] arr1, int[] arr2){
        int[] arrOut = new int[arr1.length + arr2.length];

        int ind1 = 0, ind2 = 0, indOut = 0;

        // Two arrays still have at least one elements
        while (ind1 < arr1.length && ind2 < arr2.length){
            if(arr1[ind1] < arr2[ind2])
                arrOut[indOut++] = arr1[ind1++];
            else
                arrOut[indOut++] = arr2[ind2++];
        }

        // Only arr_1 has still some elements
        while(ind1 < arr1.length){
            arrOut[indOut++] = arr1[ind1++];
        }
        // Only arr2 has still some elements
        while (ind2 < arr2.length){
            arrOut[indOut++] = arr2[ind2++];
        }

        return arrOut;
    }

    // Merge two sorted Lists
    private List<Integer> mergeListImpl1(List<Integer> list1, List<Integer> list2){
        List<Integer> listOut = new ArrayList<Integer>();

        while(list1.size() > 0 && list2.size()>0){
            if(list1.get(0) <list2.get(0)){
                listOut.add(list1.get(0));
                list1.remove(0);
            }
            else{
                listOut.add(list2.get(0));
                list2.remove(0);
            }
        }

        while (list1.size()>0){
            listOut.add(list1.get(0));
            list1.remove(0);
        }

        while (list2.size()>0){
            listOut.add(list2.get(0));
            list2.remove(0);
        }
        return listOut;
    }
}
