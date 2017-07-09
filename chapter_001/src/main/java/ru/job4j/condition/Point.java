package ru.job4j.condition;
/**
* @author Ksemenchenko.
* @version 1
* @since 0.1
*/
public class Point {
	/**
	*@param x параметр.
    */
   private int x;
   	/**
	*@param x параметр.
    */
   private int y;
    /**
	*@param x параметр.
    *@param y параметр.
    */
   public Point(int x, int y) {
      this.x = x;
      this.y = y;
  }
   	/**
	*@return x параметр.
    */
  public int getX() {
      return this.x;
  }
   	/**
	*@return y параметр.
    */
  public int getY() {
      return this.y;
  }
   	/**
	*@param a параметр.
	*@param b параметр.
	*@return y параметр.
    */
  public boolean is(int a, int b) {
	    return this.y == a * this.x + b;
  }
}