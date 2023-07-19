package 二分查找.在数组里查找.easy;

/**
 * 功能描述
 *
 * @author: 刘新宇
 * @date: 2023年04月22日 11:10
 */
public class test35 {

    public int search(int target, int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int ans = nums.length;

        while (left <= right) {

            int mid = (right - left) / 2 + left;

            if (target <= nums[mid]) {

                ans = mid;

                right = mid - 1;

            } else {

                left = mid + 1;

            }

        }

        return ans;

    }

}
