public class QuickArray {
    int array[];

    QuickArray(int array[]) {
        this.array = array;
    }

    public int[] ArraySort(int array[], int min, int max) {

        if (min < max) {

            int pivot = ArrayPartition(array, min, max);

            array = ArraySort(array, min, pivot-1);

            array = ArraySort(array, pivot+1, max);
        }
        return array;
    }

    public int ArrayPartition(int[] arrayToBeSorted, int min, int max) {
        int pivot = min;
        int i = min + 1;
        int j = max;
        while (j >= i) {

            if (this.array[pivot] < this.array[j]) {
                j--;
            } else {
                if (this.array[pivot] > this.array[i]) {
                    i++;
                } else {

                    int temp = this.array[i];
                    this.array[i] = this.array[j];
                    this.array[j] = temp;
                    i++;
                    j--;

                }
            }

        }
        int temp = this.array[pivot];
        this.array[pivot] = this.array[j];
        this.array[j] = temp;
        return j;

    }

}
