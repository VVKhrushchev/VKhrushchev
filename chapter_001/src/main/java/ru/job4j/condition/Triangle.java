package ru.job4j.condition;

public class Triangle {
  private Point a;
  private Point b;
  private Point c;
 
  public Triangle(Point a, Point b, Point c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }
	public Side ab;
	public Side ac;
	public Side bc;

	public formulaGerona {
	(p·(p - ab)·(p - ac)·(p - bc))
	}
	public P {
	{ab+bc+ac}/2
}

  public double area() {
    return formulaGerona;
  }
}