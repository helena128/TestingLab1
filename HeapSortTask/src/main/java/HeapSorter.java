package main.java;


public class HeapSorter {
    private static final int MAX_CHARS = 80;

    private int[] arr;
    private int n;
    private int step;

    public HeapSorter(int[] arr) {
        this.arr = arr;
        if (arr != null) {
            n = arr.length;
            step = 0;
        } else throw new IllegalArgumentException("Array is null or its size is less than 1");
    }

    public int[] sort() {
        System.out.println("Original array: ");
        printArray();

        //printTree();
        System.out.println("Sorting started!");
        buildHeap();

        return arr;
    }

    private void buildHeap() {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(i);
        }
    }

    private void heapify(int idx) {
        /*int childIdx = 2 * parentIdx;
        while (childIdx <= last) {
            if (childIdx + 1 <= last && arr[childIdx + 1] > arr[childIdx])
                childIdx++;
            if (arr[childIdx] > arr[parentIdx])
                swap(childIdx, parentIdx);
            parentIdx = childIdx;
            childIdx = 2 * parentIdx;
        }*/
        step++;
        System.out.println("Step: " + step);
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
            System.out.println("\tSwapped: " + arr[idx] + " and " + arr[largest]);
            heapify(largest);
        } else System.out.println("\tNo swap");
    }

    private void swap(int idx1, int idx2) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

    private void printArray() {
        for (int a : arr)
            System.out.print(a + "\t");
        System.out.println();
    }
}
