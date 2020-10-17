package de.shhn.algorithms.arrays.unit;
import de.shhn.algorithms.arrays.MergeToSortedArray;
import org.junit.Test;
import org.junit.Assert;

public class MergeToSortedArrayTest {

    @Test
    public void equalSizedArrayTest()
    {
        MergeToSortedArray mergeToSortedArray = new MergeToSortedArray();
        int[] arr_1 = {1,3,5,7,9};
        int[] arr_2 = {0,2,4,6,8};
        int[] arr_out = {0,1,2,3,4,5,6,7,8,9};

        Assert.assertArrayEquals("IMPLEMENT_1",mergeToSortedArray.merge(arr_1,arr_2,1),arr_out);
        Assert.assertArrayEquals("IMPLEMENT_2",mergeToSortedArray.merge(arr_1,arr_2,2),arr_out);
        Assert.assertArrayEquals("IMPLEMENT_3",mergeToSortedArray.merge(arr_1,arr_2,3),arr_out);
    }

    @Test
    public void unbalancedSizedArrayTest()
    {
        MergeToSortedArray mergeToSortedArray = new MergeToSortedArray();
        int[] arr_1 = {1,3,5};
        int[] arr_2 = {0,2,4,6,8};
        int[] arr_out = {0,1,2,3,4,5,6,8};

        Assert.assertArrayEquals("IMPLEMENT_1",mergeToSortedArray.merge(arr_1,arr_2,1),arr_out);
        Assert.assertArrayEquals("IMPLEMENT_2",mergeToSortedArray.merge(arr_1,arr_2,2),arr_out);
        Assert.assertArrayEquals("IMPLEMENT_3",mergeToSortedArray.merge(arr_1,arr_2,3),arr_out);
    }

    @Test
    public void emptySizedArrayTest()
    {
        MergeToSortedArray mergeToSortedArray = new MergeToSortedArray();
        int[] arr_1 = {};
        int[] arr_2 = {0,2,4,6,8};
        int[] arr_out = {0,2,4,6,8};

        Assert.assertArrayEquals("IMPLEMENT_1",mergeToSortedArray.merge(arr_1,arr_2,1),arr_out);
        Assert.assertArrayEquals("IMPLEMENT_2",mergeToSortedArray.merge(arr_1,arr_2,2),arr_out);
        Assert.assertArrayEquals("IMPLEMENT_3",mergeToSortedArray.merge(arr_1,arr_2,3),arr_out);
    }

    @Test
    public void repeatedElementsArrayTest()
    {
        MergeToSortedArray mergeToSortedArray = new MergeToSortedArray();
        int[] arr_1 = {1,3,3,5,5};
        int[] arr_2 = {0,2,3,3,3,4,5,8};
        int[] arr_out = {0,1,2,3,3,3,3,3,4,5,5,5,8};

        Assert.assertArrayEquals("IMPLEMENT_1",mergeToSortedArray.merge(arr_1,arr_2,1),arr_out);
        Assert.assertArrayEquals("IMPLEMENT_2",mergeToSortedArray.merge(arr_1,arr_2,2),arr_out);
        Assert.assertArrayEquals("IMPLEMENT_3",mergeToSortedArray.merge(arr_1,arr_2,3),arr_out);

    }

    @Test
    public void equalsArrayTest()
    {
        MergeToSortedArray mergeToSortedArray = new MergeToSortedArray();
        int[] arr_1 = {1,3,5,7,9};
        int[] arr_2 = {1,3,5,7,9};
        int[] arr_out = {1,1,3,3,5,5,7,7,9,9};

        Assert.assertArrayEquals("IMPLEMENT_1",mergeToSortedArray.merge(arr_1,arr_2,1),arr_out);
        Assert.assertArrayEquals("IMPLEMENT_2",mergeToSortedArray.merge(arr_1,arr_2,2),arr_out);
        Assert.assertArrayEquals("IMPLEMENT_3",mergeToSortedArray.merge(arr_1,arr_2,3),arr_out);
    }

    @Test
    public void equalElementsArrayTest()
    {
        MergeToSortedArray mergeToSortedArray = new MergeToSortedArray();
        int[] arr_1 = {5,5,5,5,5};
        int[] arr_2 = {1,3,5,7,9,12};
        int[] arr_out = {1,3,5,5,5,5,5,5,7,9,12};

        Assert.assertArrayEquals("IMPLEMENT_1",mergeToSortedArray.merge(arr_1,arr_2,1),arr_out);
        Assert.assertArrayEquals("IMPLEMENT_2",mergeToSortedArray.merge(arr_1,arr_2,2),arr_out);
        Assert.assertArrayEquals("IMPLEMENT_3",mergeToSortedArray.merge(arr_1,arr_2,3),arr_out);
    }

}
