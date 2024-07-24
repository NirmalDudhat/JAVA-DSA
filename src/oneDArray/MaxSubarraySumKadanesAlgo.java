package oneDArray;

public class MaxSubarraySumKadanesAlgo {

    public static void maximumSubArraySum(int[] num){
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;

        for (int j : num) {
            curSum += j;
            if (curSum < 0) {
                curSum = 0;
            }
            maxSum = Math.max(curSum, maxSum);
        }
        System.out.println("Maximum Sum Is : " + maxSum);
    }

    public static void main(String[] args) {
        int[] arry = {-2,-3,4,-1,-2,1,5,-3};

        maximumSubArraySum(arry);
    }
}
