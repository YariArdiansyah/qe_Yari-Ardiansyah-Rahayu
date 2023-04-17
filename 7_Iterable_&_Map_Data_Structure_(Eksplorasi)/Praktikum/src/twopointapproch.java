import java.util.Arrays;

public class twopointapproch {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 6};
        int target1 = 6;
        int[] pair1 = findPair(arr1, target1);
        System.out.println(Arrays.toString(pair1));

        int[] arr2 = {2, 5, 9, 11};
        int target2 = 11;
        int[] pair2 = findPair(arr2, target2);
        System.out.println(Arrays.toString(pair2));
    }

    public static int[] findPair(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}
