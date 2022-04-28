package advance1.dev;

import java.util.Scanner;

import advance.dev.dao.IShape;
import advance.dev.dao.ShapeManager;
import advance.dev.models.Circle;
import advance.dev.models.Rectangle;
import advance.dev.models.Triangle;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		IShape shapeManger = new ShapeManager();
		System.out.println("Nhap vao 2 hinh tron");
		for (int i = 0; i < 2; i++) {
			System.out.println("Nhap ban kinh");
			double bk = sc.nextDouble();
			sc.nextLine();
			
			shapeManger.add(new Circle(bk));
			}
		
		System.out.println("Nhap vao 2 hinh chu nhat");
		for (int i = 0; i < 2; i++) {
			System.out.println("Nhap vao canh a");
			double a = sc.nextDouble();
			sc.nextLine();
			
			System.out.println("Nhap vao canh b");
			double b = sc.nextDouble();
			sc.nextLine();
			shapeManger.add(new Rectangle(a, b));
		}
		
		System.out.println("Nhap vao 1 hinh tam giac");
		System.out.println("Nhap vao canh a");
		double a = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Nhap vao canh b");
		double b = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Nhap vao canh c");
		double c = sc.nextDouble();
		sc.nextLine();
		
		shapeManger.add(new Triangle(a, b, c));
		
	}

}
