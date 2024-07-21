package sorting;

public class BasicSorting {
    public static void bubbleSort(int[] arry){
        for (int turns = 0; turns<arry.length-1; turns++){
            for (int j = 0; j < arry.length-1-turns; j++) {
                if (arry[j] > arry[j+1]) {
                    int temp = arry[j];
                    arry[j] = arry[j+1];
                    arry[j+1]=temp;
                }
            }
        }
    }

    public static void printArr(int[] arry){
        for (int j : arry) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arry = {5,4,1,3,2};

        bubbleSort(arry);
        printArr(arry);
    }
}
