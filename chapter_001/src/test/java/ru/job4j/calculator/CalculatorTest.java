package ru.job4j.calculator;



import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test for Class Calculator for arithmetic operations.
* @author VladimirKhrushchev
* @since 12.07.2017
* @version 0.1
**/

public class CalculatorTest {
	/**
	* Test add.
	**/
	@Test
	public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
		calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	/**
	* Test substruct.
	**/
	@Test
	public void whenSubstructOneMinusOneThenZerro() {
		Calculator calc = new Calculator();
		calc.substruct(1D, 1D);
        double result = calc.getResult();
        double expected = 0D;
        assertThat(result, is(expected));
	}
	/**
	* Test div.
	**/
	@Test
	public void whenDivOneOnOneThenZerro() {
		Calculator calc = new Calculator();
		calc.div(1D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
		}
	/**
	*Test multiple.
	**/
	@Test
	public void whenMultipleOneOnOneThenOne() {
		Calculator calc = new Calculator();
		calc.multiple(1D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
	}
}
