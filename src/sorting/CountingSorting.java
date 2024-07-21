package sorting;

public class CountingSorting {

    public static void countingSort(int[] arry){
        int largest = Integer.MIN_VALUE;
        for (int j : arry) {
            largest = Math.max(largest, j);
        }

        int[] count = new int[largest+1];
        for (int j : arry) {
            count[j]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0){
                arry[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int[] arry){
        for (int j : arry) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {1,4,1,3,2,4,3,7};

        countingSort(array);
        printArray(array);
    }
}
