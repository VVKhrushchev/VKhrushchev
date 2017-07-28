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
	* x - coordinate X.
	*/
	private int x;
	/**
	* y - coordinate Y.
	*/
	private int y;
	/**
	* @param x - coordinate X.
	* @param y - coordinate Y.
	*/
	public Point(int x, int y) {
	this.x = x;
	this.y = y;
	}
	/**
	* Method getX.
	* @return X.
	*/
	public int getX() {
      return this.x;
  }
	/**
	* Method getY.
	* @return Y.
	*/
  public int getY() {
     return this.y;
  }
	/**
	* Сheck point on function y(x) = a * x + b.
	* @param a - value a.
	* @param b - value b.
	* @return true or false.
	*/
  public boolean is(int a, int b) {
    return this.y == a * this.x + b;
}
}