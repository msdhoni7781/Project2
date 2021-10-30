package prac;

import java.util.Arrays;

public class day2 {
    public static void main(String[] args) {
        int nums[] = {5, 7, 7,7, 8, 8, 10};
        int target=7;
        int arr2[] = new int[2];

        arr2[0] = findindex1(nums, target);
        arr2[1] = findindex2(nums, target);


        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
    }

    public static int findindex1(int[] nums, int target) {
        int index = -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                index = mid;
                end = mid - 1;
            }
            else if (nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }

        return index;
    }

    public static int findindex2(int[] nums, int target) {

        int index = -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target)
                index = mid;
            if (nums[mid] <= target)
                start = mid + 1;
            else
                end = mid - 1;


        }
        return index;


    }
}
