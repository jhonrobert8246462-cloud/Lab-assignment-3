// Sortable.java
interface Sortable {
    void sort(int[] arr);
}

// BubbleSort.java
class BubbleSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

// SelectionSort.java
class SelectionSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}

// Main.java
public class Main {
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] data1 = {64, 34, 25, 12, 22, 11, 90};
        int[] data2 = data1.clone(); // clone the array for second sort

        Sortable bubbleSort = new BubbleSort();
        bubbleSort.sort(data1);
        System.out.print("Bubble Sorted: ");
        printArray(data1);

        Sortable selectionSort = new SelectionSort();
        selectionSort.sort(data2);
        System.out.print("Selection Sorted: ");
        printArray(data2);
    }
}

