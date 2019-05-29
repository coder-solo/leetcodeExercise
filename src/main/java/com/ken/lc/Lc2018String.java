package com.ken.lc;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/explore/featured/card/top-interview-quesitons-in-2018/261/before-you-start/
 */
@SuppressWarnings("ALL")
public class Lc2018String {

	/**
	 * 验证回文串<br/>
	 * https://leetcode-cn.com/explore/interview/card/top-interview-quesitons-in-2018/275/string/1136/
	 *
	 * @param s
	 * @return
	 */
	public static boolean isPalindrome(String s) {

		boolean result = true;
		char[] cs = s.toLowerCase().toCharArray();
		char[] as = new char[cs.length];
		int len = 0;
		for(int i = 0; i < cs.length; i++) {
			if((cs[i] >= 'a' && cs[i] <= 'z') || (cs[i] >= '0' && cs[i] <= '9')) {
				as[len++] = cs[i];
			}
		}
		for(int i = 0; i * 2 < len; i++) {
			if(as[i] != as[len - i - 1]) {
				result = false;
				break;
			}
		}

		return result;
	}

	/**
	 * 分割回文串<br/> TODO
	 * https://leetcode-cn.com/explore/interview/card/top-interview-quesitons-in-2018/275/string/1137/
	 *
	 * @param s
	 * @return
	 */
	public List<List<String>> partition(String s) {

		List<List<String>> resultList = new ArrayList<List<String>>();

		char[] cs = s.toCharArray();
		

		return null;
	}

}
