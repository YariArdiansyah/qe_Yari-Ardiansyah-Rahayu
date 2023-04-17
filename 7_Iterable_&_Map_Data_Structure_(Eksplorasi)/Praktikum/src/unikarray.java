import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class unikarray {
    public static int[] getUnique(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr2) {
            set.add(num);
        }
        List<Integer> uniqueList = new ArrayList<>();
        for (int num : arr1) {
            if (!set.contains(num)) {
                uniqueList.add(num);
            }
        }
        int[] uniqueArr = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            uniqueArr[i] = uniqueList.get(i);
        }
        return uniqueArr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 3, 5, 10, 16};
        int[] uniqueArr = getUnique(arr1, arr2);
        System.out.println(Arrays.toString(uniqueArr));

        int[] arr3 = {3, 8};
        int[] arr4 = {2, 8};
        int[] uniqueArr2 = getUnique(arr3, arr4);
        System.out.println(Arrays.toString(uniqueArr2));
    }
}
