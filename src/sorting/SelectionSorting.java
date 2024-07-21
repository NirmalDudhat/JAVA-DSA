package sorting;

public class SelectionSorting {
    public static void selectionSort(int[] arry){
        for (int i = 0; i < arry.length; i++) {
            int minPos = i;
            for (int j = i+1; j < arry.length; j++) {
                if (arry[minPos] > arry[j]) {
                    minPos = j;
                }
            }
            int tmp = arry[minPos];
            arry[minPos] = arry[i];
            arry[i] = tmp;
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

        selectionSort(array);
        printArray(array);
    }
}
