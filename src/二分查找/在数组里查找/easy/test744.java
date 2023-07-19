package 二分查找.在数组里查找.easy;

/**
 * 功能描述
 *
 * @author: 刘新宇
 * @date: 2023年04月22日 13:30
 */
public class test744 {

    public char nextGreatestLetter(char[] letters, char target) {
 
        int left = 0;
        int right = letters.length - 1;
        int ans = 0;

        while (left <= right) {

            int mid = (right - left) >> 1 + left;

            if (target <= letters[mid]) {

                ans = mid;

                right = mid - 1;

            } else {

                left = mid + 1;

            }
        }

        return letters[ans];
    }

}
