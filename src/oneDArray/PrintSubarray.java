package oneDArray;

public class PrintSubarray {

    public static void printSubArray(int[] num){
        int sb = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += num[k];
                    System.out.print(num[k] + " ");
                }
                System.out.print("- Sum is : " + sum);
                sb++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArray : " + sb);
    }

    public static void main(String[] args) {
        int[] num = {2,4,6,8,10};

        printSubArray(num);
    }
}
