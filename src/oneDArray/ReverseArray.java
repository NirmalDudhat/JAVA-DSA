package oneDArray;

public class ReverseArray {

    public static void reverseArray(int[] num){
        int first = 0, last = num.length-1;
        while (first < last){
            int tmp = num[last];
            num[last] = num[first];
            num[first] = tmp;

            first++;
            last--;
        }
    }

    public static void printArray(int[] num){
        for (int j : num){
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        int[] num = {2,4,6,8,10,12,14,16};

        reverseArray(num);
        printArray(num);
    }
}
