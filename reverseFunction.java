
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
