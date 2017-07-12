package ru.job4j.calculator;

/**
* Class Calculator for arithmetic operations.
* @author VladimirKhrushchev
* @since 12.07.2017
* @version 1
*/

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
	
	/**
	* Method to add two nubmers.
	* @param first - first argument
	* @param second - second argument
	*/
    @Test
	    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	/**
	* Method to substruct two nubmers.
	* @param first - first argument
	* @param second - second argument
	*/
	public void whenSubstructOneMinusOneThenZerro() {		
		calc.substruct(1D, 1D);
        double result = calc.getResult();
        double expected = 0D;
        assertThat(result, is(expected));
	}
	/**
	* Method to div two nubmers.
	* @param first - first argument
	* @param second - second argument
	*/
	public void whenDivOneOnOneThenZerro() {
		calc.div(1D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
	}	
	/**
	* Method to multiple two nubmers.
	* @param first - first argument
	* @param second - second argument
	*/
	public void whenMultipleOneOnOneThenOne() {
		calc.multiple(1D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
	}
}
