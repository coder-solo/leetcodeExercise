package com.ken.lc;

/**
 * 2018 数组
 */
public class Lc2018Array {

	/**
	 * 乘积最大子序列<br/>
	 * https://leetcode-cn.com/explore/interview/card/top-interview-quesitons-in-2018/264/array/1126/
	 *
	 * @param nums
	 * @return
	 */
	public static int maxProduct(int[] nums) {

		int result = Integer.MIN_VALUE;
		int maxLt = 1;
		int maxRt = 1;
		for (int i = 0; i < nums.length; i++) {

			maxLt = Math.max(maxLt * nums[i], nums[i]);
			maxRt = Math.max(maxRt * nums[i], nums[i]);

		}

		return result;
	}

	public static int maxProductEx(int[] nums) {
		// {1,5,0,4,7,0,2,8};

		int max = Integer.MIN_VALUE, imax = 1, imin = 1; //一个保存最大的，一个保存最小的。
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0) {
				int tmp = imax;
				imax = imin;
				imin = tmp;
			} //如果数组的数是负数，那么会导致最大的变最小的，最小的变最大的。因此交换两个的值。
			imax = Math.max(imax * nums[i], nums[i]);
			imin = Math.min(imin * nums[i], nums[i]);

			max = Math.max(max, imax);
		}
		return max;
	}

}
