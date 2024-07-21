package sorting;
import java.util.Arrays;
import java.util.Collections;

public class InbuiltSorting {

    public static void printArray(Integer[] arry){
        for (int j = 0; j < arry.length; j++) {
            System.out.print(arry[j] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] array = {5,4,1,3,2};

        Arrays.sort(array);
        printArray(array);

        Arrays.sort(array, Collections.reverseOrder());
        printArray(array);
    }
}
