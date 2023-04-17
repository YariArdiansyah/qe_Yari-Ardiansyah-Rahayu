public class positifangka {
    public static int findMaxSumSubarray(int[] arr, int k) {
        int windowStart = 0;
        int windowSum = 0;
        int maxSum = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];
            if (windowEnd >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 5, 1, 3, 2};
        int k1 = 3;
        int maxSum1 = findMaxSumSubarray(arr1, k1);
        System.out.println(maxSum1);

        int[] arr2 = {2, 3, 4, 1, 5};
        int k2 = 2;
        int maxSum2 = findMaxSumSubarray(arr2, k2);
        System.out.println(maxSum2);
    }

}
