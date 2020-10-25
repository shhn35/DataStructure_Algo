package de.shhn.algorithms.arrays.unit;

import de.shhn.algorithms.arrays.kthLargestElementSimpleImpl;
import org.junit.Test;

import java.util.Arrays;
import java.util.StringJoiner;

import static org.junit.Assert.assertEquals;

public class kthLargestElementSimpleImplTest {

    @Test
    public void findKthLargestTest() {
        kthLargestElementSimpleImpl kthLargest = new kthLargestElementSimpleImpl();
        int[] testArray = new int[] { 6, 5, 0, 1, 4, 8, 9, -2 };
        int k = 3;
        int result = kthLargest.kthBiggestFinding(testArray, k);
        printResult(testArray, k);
        assertEquals(result, testArray[testArray.length - k - 1]);

        testArray = new int[] { 6, 5, 0, 1, 4, 8, 9, -2 };
        k = 0;
        result = kthLargest.kthBiggestFinding(testArray, k);
        printResult(testArray, k);
        assertEquals(result, testArray[testArray.length - k - 1]);

        testArray = new int[] { 6, 5, 0, 1, 4, 8, 9, -2 };
        k = 7;
        result = kthLargest.kthBiggestFinding(testArray, k);
        printResult(testArray, k);
        assertEquals(result, testArray[testArray.length - k - 1]);

        testArray = new int[] {1, 1, 1, 1, 1};
        k = 3;
        result = kthLargest.kthBiggestFinding(testArray, k);
        printResult(testArray, k);
        assertEquals(result, testArray[testArray.length - k - 1]);

        testArray = new int[] {1, 1, 1, 1, 1};
        k = 0;
        result = kthLargest.kthBiggestFinding(testArray, k);
        printResult(testArray, k);
        assertEquals(result, testArray[testArray.length - k - 1]);
    }

    private void printResult(int[] testArray, int k) {
        Arrays.sort(testArray);
        int actual = testArray[testArray.length - k - 1];
        printArray(testArray);
        System.out.println(" k = " + k + ", actual = " + actual);
    }

    private void printArray(int[] array) {
        StringJoiner sj = new StringJoiner(", ", "{", "}");
        for (int i = 0 ; i < array.length; i++) {
            sj.add(String.valueOf(array[i]));
        }
        System.out.print(sj.toString());
    }
}
