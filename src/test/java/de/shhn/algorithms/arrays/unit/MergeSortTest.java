package de.shhn.algorithms.arrays.unit;

import de.shhn.algorithms.arrays.MergeSort;
import de.shhn.algorithms.arrays.Sort;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {
    @Test
    public void shuffledListSortTest(){
        MergeSort mergeSort = new MergeSort();
        int[] arr = {4,6,1,8,10,8,5,2,7,1,3,9};
        int[] arr_actual = {1,1,2,3,4,5,6,7,8,8,9,10};

        Assert.assertArrayEquals("IMPLEMENT 1",mergeSort.sort(arr,1), arr_actual);
    }

    @Test
    public void descendingSortedArraySortTest(){
        MergeSort mergeSort = new MergeSort();
        int[] arr = {10,9,8,7,6,5,4,3,2,1,0};
        int[] arr_actual = {0,1,2,3,4,5,6,7,8,9,10};

        Assert.assertArrayEquals("IMPLEMENT 1",mergeSort.sort(arr,1), arr_actual);
    }

//    @Test
//    public void mergeTestInplace(){
//        Sort sortImpl = new MergSortInplace();
//
//        List<Integer> list = Arrays.asList(4,2,3,1,0);
//        List<Integer> listSorted = Arrays.asList(0,1,2,3,4);
//
//        sortImpl.sort(list);
//
//        assertArrayEquals(list.toArray(),listSorted.toArray());
//
//
//        list = Arrays.asList(5, 3, 2, 1, 4, 0, 6);
//        listSorted = Arrays.asList(0, 1, 2, 3, 4, 5, 6);
//        sortImpl.sort(list);
//        assertArrayEquals(list.toArray(), listSorted.toArray());
//
//        list = Arrays.asList(0, 0, 0, 0, 0);
//        listSorted = Arrays.asList(0, 0, 0, 0, 0);
//        sortImpl.sort(list);
//        assertArrayEquals(list.toArray(), listSorted.toArray());
//
//        list = Arrays.asList(1, 2, 3, 4, 5, 6);
//        listSorted = Arrays.asList(1, 2, 3, 4, 5, 6);
//        sortImpl.sort(list);
//        assertArrayEquals(list.toArray(), listSorted.toArray());
//
//        list = Arrays.asList(6, 5, 4, 3, 2, 1);
//        listSorted = Arrays.asList(1, 2, 3, 4, 5, 6);
//        sortImpl.sort(list);
//        assertArrayEquals(list.toArray(), listSorted.toArray());
//
//    }
}
