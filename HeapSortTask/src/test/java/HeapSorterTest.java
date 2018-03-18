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
        int[] arr = {906, 213, 327, 219, 804, 527, 226, 508, 298, 28, 130,
            150, 237, 985, 427, 89, 306, 403, 534, 981, 343, 856, 253, 997, 778,
            596, 886, 951, 121, 988, 541};
        assertTrue(tester(arr));
    }

    @Test
    public void testSort4() {
        int[] arr = {754, 510, 334, 432, 732, 88, 952, 880, 215, 812, 189,
            434, 80, 407, 439, 237, 731, 481, 630, 737, 976, 69, 397, 215,
            122, 145, 628, 748, 612, 150, 905};
        assertTrue(tester(arr));
    }

    private boolean tester(int[] arr) {
        HeapSorter sorter = new HeapSorter(arr);
        int[] mySort = sorter.sort();
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

    // for debugging
    /*private void dummyTester(int[] arr) {
        HeapSorter heapSorter = new HeapSorter(arr);
        heapSorter.sort();
    }*/

    private int getNumOfElements() {
        return new Random().nextInt(NUM_OF_ELEMENTS_BOUNDRY);
    }

}
