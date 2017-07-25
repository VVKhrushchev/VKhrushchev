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
    Point point = new Point();
    boolean result = point.is();
    assertThat(result, is(a * x + b));
	}
}