public class QuickArray {
    int array[];

    QuickArray(int array[]) {
        this.array = array;
    }

    public void ArraySort(int min, int max) {

        if (min < max) {

            int pivot = min;
            int i = min + 1;
            int j = max;
            while (j >= i) {

                if (this.array[pivot] < this.array[j]) {
                    j--;
                }
                if (this.array[pivot] > this.array[i]) {
                    i++;
                }

                if (this.array[j] <= this.array[i]) {

                    int temp = this.array[i];
                    this.array[i] = this.array[j];
                    this.array[j] = temp;
                }
            }
            if (i < j) {
                int temp = i;
                i = j;
                j = temp;
            }
            int temp = this.array[pivot];
            this.array[pivot] = this.array[j];
            this.array[j] = temp;

            int mid = j;

            ArraySort(min, mid - 1);

            ArraySort(mid, max);
        }

    }

    public int ArrayPartition(int[] arrayToBeSorted, int min, int max) {
        int pivot = min;
        int i = min + 1;
        int j = max;
        while (j > i) {

            if (arrayToBeSorted[pivot] < arrayToBeSorted[j]) {
                j--;
            } else {
                if (arrayToBeSorted[pivot] > arrayToBeSorted[i]) {
                    i++;
                } else {
                    break;
                }
            }

        }
        if (i < j) {
            int temp = i;
            i = j;
            j = temp;
        }
        int temp = arrayToBeSorted[pivot];
        arrayToBeSorted[pivot] = arrayToBeSorted[j];
        arrayToBeSorted[j] = temp;

        return j;

    }

}
