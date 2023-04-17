public class duplicate {
    public static int removeDuplicates(int[] arr) {
        int nextNonDuplicate = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[nextNonDuplicate - 1] != arr[i]) {
                arr[nextNonDuplicate] = arr[i];
                nextNonDuplicate++;
            }
        }
        return nextNonDuplicate;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 3, 3, 6, 9, 9};
        int len1 = removeDuplicates(arr1);
        System.out.println(len1);

        int[] arr2 = {2, 2, 2, 11};
        int len2 = removeDuplicates(arr2);
        System.out.println(len2);
    }
}
