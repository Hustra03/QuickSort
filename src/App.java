public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static void ArraySort(int[] arrayToBeSorted, int min, int max) {

        if (min != max) {
            ArraySort(arrayToBeSorted, min, ArrayPartition(arrayToBeSorted, min, max));
        }

    }

    public static int ArrayPartition(int[] arrayToBeSorted, int min, int max) {
        int mid = 0;
        int pivot = min;
        int i = min + 1;
        int j = max;
        while (true) {
            if (arrayToBeSorted[j] > arrayToBeSorted[pivot] && j != i) {
                j--;
            } else {
                if (arrayToBeSorted[i] < arrayToBeSorted[pivot] && j != i) {
                    i++;
                }

            }
            if (i <= j) {
                if (j > i) {
                    int temp = arrayToBeSorted[i];
                    arrayToBeSorted[i]=arrayToBeSorted[j];
                    arrayToBeSorted[j]=temp;
                }
                int temp = arrayToBeSorted[pivot];
                arrayToBeSorted[pivot]=arrayToBeSorted[j];
                arrayToBeSorted[j]=temp;
                break;
            }

        }

        return mid;

    }
}
