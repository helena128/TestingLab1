package main.java;


import java.util.ArrayList;
import java.util.List;

/**
 * Class handling the main logic
 */
public class HeapSorter {
    private int heapSize;
    private List<Pair> pairs = new ArrayList<>();

    public int getHeapSize() {
        return heapSize;
    }

    public List<Pair> getPairs() {
        return pairs;
    }

    /**
     * Sorting using heap sort
     * @param a - array to sort
     */
    public void sort(int[] a) {
        System.out.println(">> Original array");
        printArray(a);

        buildHeap(a);
        while (heapSize > 1) {
            swap(a, 0, heapSize - 1);

            displayChanges(a, 0, heapSize - 1);
            pairs.add(new Pair(a[0], a[heapSize - 1]));

            heapSize--;
            heapify(a, 0);
        }

        System.out.println(">> Sorted array");
        printArray(a);
    }


    /**
     * Builds heap (heh)
     * @param a - array to build heap from
     */
    private void buildHeap(int[] a) {
        heapSize = a.length;
        for (int i = a.length / 2; i >= 0; i--) {
            heapify(a, i);
        }
    }

    /**
     * Sorts heap following the rule that a[parent] >= a[child]
     * @param a - array to sort
     * @param i - index of the root (where start sorting)
     */
    private void heapify(int[] a, int i) {
        int l = left(i);
        int r = right(i);
        int largest = i;

        if (l < heapSize && a[i] < a[l]) {
            largest = l;
        }

        if (r < heapSize && a[largest] < a[r]) {
            largest = r;
        }

        if (i != largest) {
            swap(a, i, largest);

            displayChanges(a, i, largest);
            pairs.add(new Pair(a[i], a[largest]));

            printArray(a);
            heapify(a, largest);
        }
    }

    /**
     * calculate right child idx
     * @param i - parent idx
     * @return child idx
     */
    private int right(int i) {
        return 2 * i + 1;
    }

    /**
     * calculate left child idx
     * @param i - parent idx
     * @return child idx
     */
    private int left(int i) {
        return 2 * i + 2;
    }

    /**
     * Swaps 2 elements
     * @param a - array with elements
     * @param i - 1st element idx
     * @param j - 2nd element idx
     */
    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /**
     *
     * @param a - array to get elements from
     * @param i - first element to swap
     * @param largest - 2nd element to swap
     */
    private void displayChanges(int[] a, int i, int largest) {
        System.out.println(">> Swapped: " + a[i] + " and " + a[largest]);
    }

    /**
     * Prints array separating with delimiter
     */
    private void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "\t");
        System.out.println();
    }
}
