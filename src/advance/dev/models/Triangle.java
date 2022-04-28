package advance.dev.models;

public class Triangle extends Shape {
	public double a;
	public double b;
	public double c;
	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double chuVi() {
		return a + b + c;
	}
	public double dienTich() {
		double p = chuVi();
		return Math.sqrt(p * (p-a) * (p-b) * (p-c));
	}

}
