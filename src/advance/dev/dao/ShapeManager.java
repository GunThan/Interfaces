package advance.dev.dao;

import java.util.List;

import advance.dev.models.Shape;
import java.util.ArrayList;

public class ShapeManager implements IShape {
	private List<Shape> list = new ArrayList<Shape>();
	@Override
	public void add(Shape shape) {
		list.add(shape);
	}
	@Override
	public void print() {
		for (Shape shape : list) {
			System.out.println(shape);
		}
	}
	public Shape get(int index) {
		return list.get(index);
	}
}