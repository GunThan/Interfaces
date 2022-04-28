package advance.dev.models;

public class Circle extends Shape {
	public double bk;
	public Circle(double bk) {
		super();
		this.bk = bk;
	}
	
	public double chuVi() {
		return 2 * Math.PI * bk;
	}
	
	public double dienTich() {
		return Math.PI * bk * bk;
				
	}

}