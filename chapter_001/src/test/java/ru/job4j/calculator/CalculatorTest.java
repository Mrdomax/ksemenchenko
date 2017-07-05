package ru.job4j.calculator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
*Class CalculatorTest.
*@author Semenchenko.
*@since 01.
*/
public class CalculatorTest {
	/**
	*@Test
	*/
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
	*@Test
	*/
	public void whenSubstructOneMinOneThenZer() {
        Calculator calc = new Calculator();
        calc.substruct(1D, 1D);
        double result = calc.getResult();
        double expected = 0;
        assertThat(result, is(expected));
    }
	/**
	*@Test
	*/
	public void whenDivTwoOnTwoThenOne() {
        Calculator calc = new Calculator();
        calc.div(2D, 2D);
        double result = calc.getResult();
        double expected = 1;
        assertThat(result, is(expected));
    }
	/**
	*@Test
	*/
	public void whenMultipleTwoOnTwoThenFor() {
        Calculator calc = new Calculator();
        calc.multiple(2D, 2D);
        double result = calc.getResult();
        double expected = 4;
        assertThat(result, is(expected));
    }
}