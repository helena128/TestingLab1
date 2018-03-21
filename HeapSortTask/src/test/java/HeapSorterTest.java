package test.java;

import main.java.ActionType;
import main.java.Action;
import main.java.HeapSorter;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertTrue;

public class HeapSorterTest {

    private final static int ARRAY_BOUNDRY = 1000;
    private final static int NUM_OF_ELEMENTS = 31;

    @Test
    public void testSortingOneElement() {
        Random rand = new Random();
        int[] a = { rand.nextInt(1000) };
        assertTrue(tester(a));
    }

    // check null value
    @Test(expected = IllegalArgumentException.class)
    public void shouldGiveException() {
        assertTrue(tester(null));
    }


    @Test
    public void testSort1() {
        int[] arr = {754, 510, 334, 432, 732, 88, 952, 880, 215, 812, 189,
            434, 80, 407, 439, 237, 731, 481, 630, 737, 976, 69, 397, 215,
            122, 145, 628, 748, 612, 150, 905};
        assertTrue(tester(arr)); // check the result


        HeapSorter test = new HeapSorter(arr);
        assertTrue(test.getActionHolder().contains(new Action(628, 80, ActionType.SWAP))); // TODO: fails here
        // TODO: add more assertions and more tests
    }

    private boolean tester(int[] arr) {
        HeapSorter sorter = new HeapSorter(arr);
        int[] mySort = sorter.sort();
        Arrays.sort(arr);
        System.out.println("Sorted array:");
        sorter.printArray(mySort);
        return (mySort == arr);
    }


    private int[] createRandomArray() {
        int[] arr = new int[NUM_OF_ELEMENTS];
        Random random = new Random();
        for (int i = 0; i < NUM_OF_ELEMENTS; i++) {
            arr[i] = random.nextInt(ARRAY_BOUNDRY);
        }
        return arr;
    }

    // for debugging
    /*private void dummyTester(int[] arr) {
        HeapSorter heapSorter = new HeapSorter(arr);
        heapSorter.sort();
    }*/

}
