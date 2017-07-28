package ru.job4j.condition;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* ClassTest PointOnTheline.
* @author VladimirKhrushchev
* @since 21.07.2017
* @version 0.1
*/


	public class PointTest {
	/**
	* Test whenPointOnTheline.
	**/
	@Test
	public void whenPointOnTheline() {
	Point point = new Point(2, 6);
	boolean result = point.is(2, 2);
	boolean expected = true;
	assertThat(result, is(expected));
	}
	/**
	* Test whenPointNotOnTheline.
	**/
	@Test
		public void whenPointNotOnTheline() {
		Point point = new Point(3, 15);
		boolean result = point.is(4, 6);
		boolean expected = false;
		assertThat(result, is(expected));
}
}