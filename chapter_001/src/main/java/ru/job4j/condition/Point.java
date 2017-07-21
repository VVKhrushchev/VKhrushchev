package ru.job4j.condition;

/**
* Class PointOnTheline.
* @author VladimirKhrushchev
* @since 21.07.2017
* @version 0.1
*/


	/**
	*Function PointOnTheline.
	*/
public class Point {
	/**
	* @param int x
	*/
	private int x;
	/**
	* @param int y
	*/
	private int y;
	/**
	* Method Point
	* @param 'x'
	* @param 'y'
	*/
   public Point(int x, int y) {
      this.x = x;
      this.y = y;
  }
	/**
	* Method getX
	* @return x
	*/
	public int getX() {
      return this.x;
  }
	/**
	* Method getY 
	* @return y
	*/
  public int getY() {
     return this.y;
  }
	/**
	* Method boolean is
	* @return y
	*/
  public boolean is(int a, int b) {
    return  a * x + b;
}
}