package ru.job4j.max;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 *Class MaxTest.
 *@author Semenchenko.
 *@since 01.
 */
public class MaxTest {
	/**
 	*@Test
	*
 	*/
    public void testMax1Or2() {
        int result = Max.max(1, 2);
        int expected = 2;
        assertThat(result, is(expected));
    }
	/**
 	*@Test
	*
 	*/
    public void testMax3Or2() {
        int result = Max.max(3, 2);
        int expected = 3;
        assertThat(result, is(expected));
    }
}
