package ru.job4j.max;

/**
* Class Max ternarn. operator
* @author VladimirKhrushchev
* @since 17.07.2017
* @version 0.1
*/

	/**
	*Function ternarn. operator.
	*/
public class Max {
	/**
	* Method whenFirstLessSecond.
	* @param first - first argument
	* @param second - second argument
	* @return max
	*/
	public int max(int first, int second) {
		int max = first > second ? first : second;
		return max;
	}
}
