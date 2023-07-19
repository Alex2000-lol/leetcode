package 二分查找.在数组里查找.easy;

/**
 * 功能描述
 *
 * @author: 刘新宇
 * @date: 2023年04月20日 21:46
 */
public class test704 {

    public int search(int[] a, int num) {

        int left = 0;
        int right = a.length - 1;

        while (left <= right) {

            int mid = (right - left) / 2 + left;

            if (a[mid] == num) {

                return mid;
            } else if (num > a[mid]) {

                left = mid + 1;
            } else {

                right = mid - 1;
            }

        }
        return -1;

    }

}
