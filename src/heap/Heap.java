package heap;

public class Heap {

    public static void main(String[] args) {
        int a[] = {Integer.MAX_VALUE, 4, 10, 3, 5, 1, 300, 6, 8, 800, 7, 20, 100, 200};

        int lengthOverTwo = a.length/2;
        int index = lengthOverTwo == 0 ? lengthOverTwo - 1 : lengthOverTwo;

        for (int i = index; i >0 ; i--) {
            buildMaxHeap(a, i);
        }

        printArr(a);
    }

    public static void buildMaxHeap(int arr[], int index) {
        int length = arr.length;
        int leftIndex = 2 * index;
        int rightIndex = 2 * index + 1;

        if (length > leftIndex && length > rightIndex) {

            if(arr[index] < arr[rightIndex] && arr[rightIndex] == arr[leftIndex]) {
                int temp = arr[index];
                arr[index] = arr[rightIndex];
                arr[rightIndex] = temp;
                buildMaxHeap(arr, rightIndex);
            } else if (arr[leftIndex] > arr[rightIndex] && arr[index] < arr[leftIndex]) {
                int temp = arr[index];
                arr[index] = arr[leftIndex];
                arr[leftIndex] = temp;
                buildMaxHeap(arr, leftIndex);
            } else if (arr[leftIndex] < arr[rightIndex] && arr[index] < arr[rightIndex]) {
                int temp = arr[index];
                arr[index] = arr[rightIndex];
                arr[rightIndex] = temp;
                buildMaxHeap(arr, rightIndex);
            }
        } else if(length > leftIndex) {
            if (arr[index] < arr[leftIndex]) {
                int temp = arr[index];
                arr[index] = arr[leftIndex];
                arr[leftIndex] = temp;
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
