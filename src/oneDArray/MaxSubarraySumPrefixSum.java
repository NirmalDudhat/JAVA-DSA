package oneDArray;

public class MaxSubarraySumPrefixSum {

    public static void maximumSubArraySum(int[] num){
        int maxSum = Integer.MIN_VALUE;
        int curSum;
        int[] prefix = new int[num.length];

        prefix[0] = num[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + num[i];
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {

                curSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                if (maxSum < curSum) {
                    maxSum = curSum;
                }
            }
        }
        System.out.println("Max Sum : " + maxSum);
    }

    public static void main(String[] args) {
        int[] arry = {1,-2,6,-1,3};

        maximumSubArraySum(arry);
    }
}
