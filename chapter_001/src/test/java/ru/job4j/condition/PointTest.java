package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.
* @author Ksemenchenko.
* @version 1
* @since 0.1
*/
public class PointTest {
    /**
    * Это неведомая хрень из org.junit.Test; которая всегда выдает ошибку.
	* А если её убрать, то ошибку выдаст строка import org.junit.Test;
	* Я бы убрал и то и другое, если бы точно знал, что эта штука не обязательна.
    */
	@Test
	/**
    * Test на вывод значения true для метода is. Когда точка находится на функции.
    */
    public void whenAddOneAndOneThenTrue() {
		Point object = new Point(1, 1);
		boolean test = object.is(1, 0);
		boolean expected = true;
        assertThat(test, is(expected));
    }
    /**
    * Test на false. Когда точка находится не на функции.
    */
	    public void whenAddElseThenTrue() {
		Point object = new Point(1, 3);
		boolean test = object.is(1, 0);
		boolean expected = false;
        assertThat(test, is(expected));
    }
}