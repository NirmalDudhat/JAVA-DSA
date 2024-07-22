package oneDArray;

public class MaxSubarraySumBruteForce {

    public static void maximumSubArraySum(int[] num){
        int maxSum = Integer.MIN_VALUE;
        int curSum;

        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                curSum = 0;
                for (int k = i; k <= j; k++) {
                    curSum += num[k];
                }
                System.out.println(curSum);
                if (maxSum < curSum) {
                    maxSum = curSum;
                }
            }
        }
        System.out.println("Max Sum : " + maxSum);
    }

    public static void main(String[] args) {
        int[] arry = {1,-2,6,-1,3};
//        int[] arry = {2,4,6,8,10};

        maximumSubArraySum(arry);
    }
}
