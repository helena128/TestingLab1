package main.java;

/**
 * Class handling the main logic
 */
public class HeapSorter {

    private int[] arr;
    private int n;

    private ActionHolder actionHolder; // holds actions with numbers

    public HeapSorter(int[] arr) {
        this.arr = arr;
        if (arr != null) {
            n = arr.length;
            actionHolder = new ActionHolder();
        } else throw new IllegalArgumentException("Array is null or its size is less than 1");
    }

    public ActionHolder getActionHolder() {
        return actionHolder;
    }

    /**
     * Sorts array - main method
     * @return sorted array
     */
    public int[] sort() {
        System.out.println("Original array: ");
        printArray(arr);

        //printTree();
        System.out.println("Sorting started!");
        buildHeap();

        //System.out.println("Sorted array: ");
        //printArray(arr);
        return arr;
    }

    /**
     * Builds heap
     */
    private void buildHeap() {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(i);
        }
    }

    /**
     * Recursively build maxHeap
     * @param idx - starting index
     */
    private void heapify(int idx) {
        int largest = idx;
        int leftIndex = 2 * idx + 1;
        int rightIndex = 2 * idx + 2;

        if (leftIndex < n && arr[idx] < arr[leftIndex]) {
            largest = leftIndex;
        }
        if (rightIndex < n && arr[largest] < arr[rightIndex]) {
            largest = rightIndex;
        }

        if (largest != idx) {
            swap(idx, largest);
            System.out.println("Swapped: " + arr[idx] + " and " + arr[largest]);
            actionHolder.update(new Action(arr[idx], arr[largest], ActionType.SWAP));
            heapify(largest);
        } else {
            actionHolder.update(new Action(arr[idx], arr[largest], ActionType.NO_ACTION));
        }
    }

    /**
     * Swaps 2 elements of the array
     * @param idx1 - index of the 1st element
     * @param idx2 - index of the 2nd element
     */
    private void swap(int idx1, int idx2) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

    /**
     * Prints array separating with delimiter
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "\t");
        System.out.println();
    }
}
