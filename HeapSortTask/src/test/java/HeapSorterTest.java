package test.java;

import main.java.HeapSorter;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertTrue;

public class HeapSorterTest {

    private final static int ARRAY_BOUNDRY = 1000;
    private final static int NUM_TESTS = 50;
    private final static int NUM_OF_ELEMENTS_BOUNDRY = 50;

    @Test
    @DisplayName("Testing one element")
    public void testSort1() {
        int[] a = createRandomArray(1);
        assertTrue(tester(a));
    }

    // check null value
    @Test(expected = IllegalArgumentException.class)
    public void testSort2() {
        int[] a = null;
        assertTrue(tester(a));
    }

    @Test
    public void testSort3() {
        for (int i = 0; i < NUM_TESTS; i++) {
            int numOfElem = getNumOfElements();
            int[] arr = createRandomArray(numOfElem);
            tester(arr);
        }
    }

    private boolean tester(int[] arr) {
        HeapSorter sorter = new HeapSorter();
        int[] mySort = sorter.sort(arr);
        Arrays.sort(arr);
        return (mySort == arr);
    }


    private int[] createRandomArray(int n) {
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(ARRAY_BOUNDRY);
        }
        return arr;
    }

    private int getNumOfElements() {
        return new Random().nextInt(NUM_OF_ELEMENTS_BOUNDRY);
    }

}
