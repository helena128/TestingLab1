package test.java;

import main.java.HeapSorter;
import main.java.Pair;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HeapSorterTest {

    private final static int ARRAY_BOUNDRY = 1000;
    private final static int NUM_OF_ELEMENTS = 31;

    private HeapSorter sorter;
    private List<Pair> actionPairs;

    @Before
    public void setUp() {
        sorter = new HeapSorter();
        actionPairs = new ArrayList<>();
    }

    @Test
    public void testSortingOneElement() {
        Random rand = new Random();
        int[] a = { rand.nextInt(1000) };
        assertTrue(tester(a));
    }

    // check null value
    @Test(expected = NullPointerException.class)
    public void shouldGiveException() {
        assertTrue(tester(null));
    }


    @Test
    public void testSort1() {
        int[] arr = {754, 510, 334, 432, 732, 88, 952, 880, 215, 812, 189,
            434, 80, 407, 439, 237, 731, 481, 630, 737, 976, 69, 397, 215,
            122, 145, 628, 748, 612, 150, 905};
        assertTrue(tester(arr)); // check the result

        actionPairs.add(new Pair(439, 905));
        actionPairs.add(new Pair(407, 748));
        actionPairs.add(new Pair(628, 80));


        actionPairs.add(new Pair(732, 976));
        actionPairs.add(new Pair(732, 812));

        actionPairs.add(new Pair(880, 432));
        actionPairs.add(new Pair(731, 432));

        actionPairs.add(new Pair(952, 334));
        actionPairs.add(new Pair(905, 334));
        actionPairs.add(new Pair(439, 334));

        actionPairs.add(new Pair(976, 510));
        actionPairs.add(new Pair(812, 510));
        actionPairs.add(new Pair(737, 510));

        actionPairs.add(new Pair(754, 880));

        actionPairs.add(new Pair(952, 334));
        actionPairs.add(new Pair(439, 334));
        actionPairs.add(new Pair(905, 334));
        actionPairs.add(new Pair(748, 334));
        actionPairs.add(new Pair(612, 334));

        actionPairs.add(new Pair(150, 905));
        actionPairs.add(new Pair(748, 150));

        actionPairs.add(new Pair(905, 334)); // align top to bottom check
        actionPairs.add(new Pair(88, 754));

        for (int i = 0; i < actionPairs.size(); i++) {
            assertTrue(sorter.getPairs().contains(actionPairs.get(i)));
            /*if (!sorter.getPairs().contains(actionPairs.get(i)))
                System.out.println(">> Doesn't contain: " + actionPairs.get(i).toString()); */
        }

        // check sequence
        int idx = sorter.getPairs().indexOf(new Pair(952, 334));
        assertTrue(sorter.getPairs().get(idx + 1).equals(new Pair(905, 334)));
        assertTrue(sorter.getPairs().get(idx + 2).equals(new Pair(439, 334)));

        // check not in sequence
        idx = sorter.getPairs().indexOf(new Pair(628, 88));
        assertFalse(sorter.getPairs().get(idx + 1).equals(new Pair(612, 407))); // another sub-branch, 434 <-> 88
        assertTrue(sorter.getPairs().get(idx + 1).equals(new Pair(145, 88)));

        // check not in sequence
        idx = sorter.getPairs().indexOf(new Pair(237, 80));
        assertFalse(sorter.getPairs().get(idx + 1).equals(new Pair(189, 80))); // choose greatest 215 <-> 189
        assertTrue(sorter.getPairs().get(idx + 1).equals(new Pair(215, 80)));

        assertFalse(sorter.getPairs().contains(new Pair(145, 150)));
    }

    private boolean tester(int[] arr) {
        int[] origArr = new int[arr.length];
        System.arraycopy(arr, 0, origArr, 0, arr.length);

        sorter.sort(arr);
        Arrays.sort(origArr);

        return (Arrays.equals(arr, origArr));
    }


    private int[] createRandomArray() {
        int[] arr = new int[NUM_OF_ELEMENTS];
        Random random = new Random();
        for (int i = 0; i < NUM_OF_ELEMENTS; i++) {
            arr[i] = random.nextInt(ARRAY_BOUNDRY);
        }
        return arr;
    }

}
