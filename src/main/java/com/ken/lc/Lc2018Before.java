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
	 * <p>
	 * 减治法：
	 * 右上角数值为一行中最大值，为一列中最小值。通过右上角和目标值比较，右上角值大，则列数减一；右上角值小，则行数加一。
	 * </p>
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

	/**
	 * 搜索二维矩阵 II<br/>
	 * https://leetcode-cn.com/explore/featured/card/top-interview-quesitons-in-2018/261/before-you-start/1108/
	 * <p>
	 * 二分法：
	 * 根据二分法不断缩小矩阵，缩小至2*2（2*1 or 1*2）矩阵后直接比较
	 * </p>
	 *
	 * @param matrix
	 * @param target
	 * @return
	 */
	public static boolean searchMatrixEx(int[][] matrix, int target) {

		if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return false;
		}

		int m = matrix.length - 1;
		int n = matrix[0].length - 1;
		int m0 = 0, n0 = 0;
		int m1 = m, n1 = n;
		boolean result = false;
		int mt,nt;

		while (m1 - m0 > 1 || n1 - n0 > 1) {
			mt = m1 - m0 > 1 ? (m0 + m1) / 2 : m0;
			nt = n1 - n0 > 1 ? (n0 + n1) / 2 : n0;
			if (matrix[mt][nt] == target) {
				result = true;
				break;
			} else if (matrix[mt][nt] > target) {
				m1 = mt;
				n1 = nt;
			} else {
				m0 = mt;
				n0 = nt;
			}
		}
		if (matrix[m0][n0] == target || matrix[m0][n1] == target || matrix[m1][n0] == target || matrix[m1][n1] == target) {
			result = true;
		}
		return result;
	}
}
