import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        QuickSortArrayTest();
    }

    public static void QuickSortArrayTest() {
        Random rnd = new Random();
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(array.length);
        }
        ArraySort(array, 0, 9);

    }

    // Linked list works by dividing the list in two, greater than and lesser than
    // the pivot element, We then use quick-sort recursivly on these lists in order
    // to sort them, and then appnends the lesser with the pivot, then the greater
    // one. Can also append sorted lesser with pivot, then this list with greater

    public static void PrintArray(int[] arrayToBePrinted) {
        for (int i = 0; i < arrayToBePrinted.length; i++) {
            System.out.println("Position " + (i + 1) + "| Value: " + arrayToBePrinted[i]);
        }
    }

    public static void ArraySort(int[] arrayToBeSorted, int min, int max) {

        if (min + 1 < max) {
            ArraySort(arrayToBeSorted, min, ArrayPartition(arrayToBeSorted, min, max));
        }

    }

    public static int ArrayPartition(int[] arrayToBeSorted, int min, int max) {
        int pivot = min;
        int i = min + 1;
        int j = max;
        while (true) {
            if (i <= j) {
                if (j > i) {
                    int temp = arrayToBeSorted[i];
                    arrayToBeSorted[i] = arrayToBeSorted[j];
                    arrayToBeSorted[j] = temp;
                }
                int temp = arrayToBeSorted[pivot];
                arrayToBeSorted[pivot] = arrayToBeSorted[j];
                arrayToBeSorted[j] = temp;
                return i;
            }
            if (arrayToBeSorted[j] > arrayToBeSorted[pivot] && j != i) {
                j--;
            }
            if (arrayToBeSorted[i] < arrayToBeSorted[pivot] && j != i) {
                i++;
            }

        }

    }

}
