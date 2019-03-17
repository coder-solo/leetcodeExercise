package com.ken.lc;

/**
 * https://leetcode-cn.com/explore/featured/card/top-interview-quesitons-in-2018/261/before-you-start/
 */
public class Lc2018Before {

	/**
	 * 只出现一次的数字<br/>
	 * https://leetcode-cn.com/explore/featured/card/top-interview-quesitons-in-2018/261/before-you-start/1106/
	 *
	 * @param nums
	 * @return
	 */
	public static int singleNumber(int[] nums) {

		int tc = 0;
		int result = -1;
		for (int i = 0; i < nums.length; i++) {
			tc = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					tc++;
				}
			}
			if (tc == 1) {
				result = nums[i];
				break;
			}
		}
		return result;
	}

	/**
	 * 求众数<br/>
	 * https://leetcode-cn.com/explore/featured/card/top-interview-quesitons-in-2018/261/before-you-start/1107/
	 *
	 * @param nums
	 * @return
	 */
	public static int majorityElement(int[] nums) {

		int result = 0;
		int tc = 0;
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			tc = 0;
			for (int j = 0; j < len; j++) {
				if (nums[i] == nums[j]) {
					tc++;
				}
			}
			if (tc * 2 > len) {
				result = nums[i];
				break;
			}
		}

		return result;
	}

	/**
	 * 搜索二维矩阵 II<br/>
	 * https://leetcode-cn.com/explore/featured/card/top-interview-quesitons-in-2018/261/before-you-start/1108/
	 *
	 * @param matrix
	 * @param target
	 * @return
	 */
	public static boolean searchMatrix(int[][] matrix, int target) {

		int m = 0;
		int n = matrix[0].length - 1;
		boolean result = false;

		while (m < matrix.length && n >= 0) {
			if (matrix[m][n] == target) {
				result = true;
				break;
			} else if (matrix[m][n] > target) {
				n--;
			} else {
				m++;
			}
		}
		return result;
	}
}
