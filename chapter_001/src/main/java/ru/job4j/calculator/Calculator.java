package ru.job4j.calculator;
/**
*Class Calculator.
*@author Semenchenko.
*@since 01.
*/
public class Calculator {
	/**
	*@param result параметр.
    */
    private double result;
    /**
	*@param first параметр.
    *@param second параметр.
    */
    public void add(double first, double second) {
        this.result = first + second;
    }
	/**
	*@param first параметр.
    *@param second параметр.
    */
    public void substruct(double first, double second) {
        this.result = first - second;
    }
	/**
	*@param first параметр.
    *@param second параметр.
    */
    public void div(double first, double second) {
        this.result = first / second;
    }
	/**
	*@param first параметр.
    *@param second параметр.
    */
    public void multiple(double first, double second) {
        this.result = first * second;
    }
    /**
	*@return параметр result.
    */
	public double getResult() {
        return this.result;
    }
}