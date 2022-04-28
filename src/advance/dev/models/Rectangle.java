package advance.dev.models;

public class Rectangle extends Shape {
	public double a;
	public double b;
	
	public Rectangle(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	public double chuVi() {
		return 2 * (a+b);
	}
	public double dienTich() {
		return a * b;
	}

}