package de.shhn.algorithms.arrays.unit;

import de.shhn.algorithms.arrays.QuickSort;
import de.shhn.algorithms.arrays.Sort;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class QuichSortTest {
    @Test
    public void arraySortTest(){
        Sort sortImpl = new QuickSort();
        List<Integer> list = Arrays.asList(4,2,3,1,0);
        List<Integer> listSorted = Arrays.asList(0,1,2,3,4);

        sortImpl.sort(list);

        assertArrayEquals(list.toArray(),listSorted.toArray());


        list = Arrays.asList(5, 3, 2, 1, 4, 0, 6);
        listSorted = Arrays.asList(0, 1, 2, 3, 4, 5, 6);
        sortImpl.sort(list);
        assertArrayEquals(list.toArray(), listSorted.toArray());

        list = Arrays.asList(0, 0, 0, 0, 0);
        listSorted = Arrays.asList(0, 0, 0, 0, 0);
        sortImpl.sort(list);
        assertArrayEquals(list.toArray(), listSorted.toArray());

        list = Arrays.asList(1, 2, 3, 4, 5, 6);
        listSorted = Arrays.asList(1, 2, 3, 4, 5, 6);
        sortImpl.sort(list);
        assertArrayEquals(list.toArray(), listSorted.toArray());

        list = Arrays.asList(6, 5, 4, 3, 2, 1);
        listSorted = Arrays.asList(1, 2, 3, 4, 5, 6);
        sortImpl.sort(list);
        assertArrayEquals(list.toArray(), listSorted.toArray());

    }

    @Test
    public void linkedListSortTest(){
        Sort sort = new QuickSort();

        List<Integer> list = new LinkedList<Integer>();
        list.addAll(Arrays.asList(4,3,2,1,0,5));

        List<Integer> listSorted = new LinkedList<Integer>();
        listSorted.addAll(Arrays.asList(0,1,2,3,4,5));

        sort.sort(list);

        assertArrayEquals(list.toArray(),listSorted .toArray());

    }
}
