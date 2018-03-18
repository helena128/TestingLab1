package main.java;

public class HeapSorter {

    private int[] arr;
    private int n;

    private ActionHolder actionHolder; // for testing

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

    public int[] sort() {
        System.out.println("Original array: ");
        printArray();

        //printTree();
        System.out.println("Sorting started!");
        buildHeap();

        System.out.println("Sorted array: ");
        printArray();
        return arr;
    }

    private void buildHeap() {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(i);
        }
    }

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
