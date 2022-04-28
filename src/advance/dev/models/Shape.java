package advance.dev.models;

public abstract class Shape {
	public abstract double chuVi();
	public abstract double dienTich();
	
	public String toString() {
		return String.format("Circle chuVi:%2f - dienTich:%.2f", chuVi(), dienTich());
	}

}
