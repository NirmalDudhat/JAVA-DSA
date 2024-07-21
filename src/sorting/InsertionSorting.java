package sorting;

public class InsertionSorting {
    public static void insertionSort(int[] arry){
        for (int i = 1; i < arry.length; i++) {
            int cur;
            cur = arry[i];
            int prev = i - 1;
            while (prev >= 0 && arry[prev]>cur){
                arry[prev+1] = arry[prev];
                prev--;
            }
            arry[prev+1] = cur;
        }
    }

    public static void printArray(int[] arry){
        for (int j : arry) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {5,4,1,3,2};

        insertionSort(array);
        printArray(array);
    }
}
