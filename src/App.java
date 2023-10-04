import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        // QuickSortArrayTest();
        QuickSortLinkedListTest();
    }

    public static void QuickSortArrayTest() {
        Random rnd = new Random();
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(array.length);
        }

        PrintArray(array);
        ArraySort(array, 0, 9);
        PrintArray(array);
    }

    public static void QuickSortLinkedListTest() {
        Random rnd = new Random();
        LinkedList list = new LinkedList();
        int maxValue = 10;
        int lengthOfList = 10;
        for (int i = 0; i < lengthOfList; i++) {
            list.addAtEnd(new Node(10 - i, null));
        }
        PrintLinkedList(list, "Original");
        list = LinkedListSort(list);
        PrintLinkedList(list, "Original");

    }

    // Linked list works by dividing the list in two, greater than and lesser than
    // the pivot element, We then use quick-sort recursivly on these lists in order
    // to sort them, and then appnends the lesser with the pivot, then the greater
    // one. Can also append sorted lesser with pivot, then this list with greater

    public static void PrintArray(int[] arrayToBePrinted) {
        System.out.println("Array:");
        for (int i = 0; i < arrayToBePrinted.length; i++) {
            System.out.println("Position " + (i + 1) + "| Value: " + arrayToBePrinted[i]);
        }

        System.out.println();
    }

    public static void PrintLinkedList(LinkedList list, String type) {
        System.out.println("List:" + type);
        Node current = list.getHead();
        int position = 1;
        while (current != null) {
            System.out.println(type + " Position " + (position) + "| Value: " + current.getItem());
            position++;
            current = current.getNext();
        }
        System.out.println();
    }

    public static LinkedList LinkedListSort(LinkedList list) {
        if ((list.head != list.last) && list.head != null && list.last != null) {// If list has 2 or more elements

            LinkedList lesser = new LinkedList();
            LinkedList greater = new LinkedList();

            Node pivot = list.removeCurrentFirst();

            Node current = list.removeCurrentFirst();

            while (current != null) {
                if (current.getItem() < pivot.getItem()) {
                    lesser.addAtEnd(current);
                } else {
                    greater.addAtEnd(current);
                }
                current = list.removeCurrentFirst();
            }

            PrintLinkedList(lesser, "lesser");
            lesser = LinkedListSort(lesser);
            PrintLinkedList(lesser, "lesser");

            PrintLinkedList(greater, "greater");
            lesser = LinkedListSort(greater);
            PrintLinkedList(greater, "greater");

            lesser.addAtEnd(pivot);
            lesser.appendList(greater);
            list = lesser;
        }
        return list;
    }

    public static void ArraySort(int[] arrayToBeSorted, int min, int max) {

        if (min + 1 < max) {
            int mid = ArrayPartition(arrayToBeSorted, min, max);
            if (min + 1 < mid) {

                ArraySort(arrayToBeSorted, min, mid);
            }
            if (mid + 1 < max) {

                ArraySort(arrayToBeSorted, mid, max);
            }
        }

    }

    public static int ArrayPartition(int[] arrayToBeSorted, int min, int max) {
        int pivot = min;
        int i = min + 1;
        int j = max;
        while (true) {

            if (j > i) {
                if (arrayToBeSorted[pivot] < arrayToBeSorted[j]) {
                    j--;
                }
                if (arrayToBeSorted[pivot] > arrayToBeSorted[i]) {
                    i++;
                }
            }

            else {
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

    }

}
