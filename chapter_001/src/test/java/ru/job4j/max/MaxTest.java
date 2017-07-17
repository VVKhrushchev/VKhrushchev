package ru.job4j.max;



import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* ClassTest Max ternarn. operator
* @author VladimirKhrushchev
* @since 17.07.2017
* @version 0.1
*/

public class Maxtest {
	/**
	* Test whenFirstLessSecond.
	**/
	@Test
	public void whenFirstLessSecond() {
    Max maxim = new Max();
    int result = maxim.max(1, 2);
    assertThat(result, is(2));
}
	/**
	* Test whenFirstlargeSecond.
	**/
	@Test
	public void whenFirstLessSecond() {
    Max maxim = new Max();
    int result = maxim.max(1, 2);
    assertThat(result, is(1));
}