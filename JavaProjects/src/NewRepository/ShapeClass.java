package NewRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import javaProject.ArrayObject;

public class ShapeClass {

	public static void main(String[] args) {

		Shape circle = new Shape("CIRCLE", 4); // 3.14 * 16 = 50.24
		Shape square = new Shape("SQUARE", 10); // 100
		Shape rec = new Shape("REC", 40, 10); // 40

		Shape shapes[] = { circle, square, rec };
		Object shapes12[]={ circle, square, rec };
		for (Object e:shapes) {
			System.out.println(e);
		}
		
		
		
		//Collections.sort(circle.getArea(), square.getArea(),rec.getArea());
		
		
		
		

		TreeSet<Shape> al = new TreeSet<Shape>();
		al.add(square);
		al.add(rec);
		al.add(circle);
		
		Iterator<Shape> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println("Trying to sort an element"+itr.next());  
		  }  
		Shape temp1 = null;
		System.out.println(" Array Sort -----two techniques");
		for (int i = 0; i < shapes.length; i++) {
			Shape s1 = shapes[i];
			for (int j = i + 1; j < shapes.length; j++) {
				Shape s2 = shapes[j];
				if (s1.getArea() > s2.getArea()) {
					temp1 = s1;
					shapes[i] = s2;
					shapes[j] = temp1;
				}
			}
		}

		System.out.print("Array after Sorting is..\n");
		for (Shape y : shapes) {
			System.out.print(y.getArea() + "    ");
		}

		double largestArea = 0;
		Shape temp = null;

		for (int i = 0; i < shapes.length; i++) {
			Shape s = shapes[i];
			if (largestArea < s.getArea()) {
				largestArea = s.getArea();
				temp = s;

			}

			// System.out.println("-------------");
			System.out.println("Shape Name:" + s.getName());
			System.out.println("Shape Area:" + s.getArea());
			System.out.println("-------------");
		}

		System.out.println("Largest area Name:" + temp.getName());
		System.out.println("-------------");
		System.out.println("-------------");
		System.out.println("Before sorting:" + Arrays.toString(shapes));
		Arrays.sort(shapes);
		System.out.println("Ascending order After sorting:" + Arrays.toString(shapes));
		Arrays.sort(shapes, Comparator.reverseOrder());
		System.out.println("Descending order After sorting:" + Arrays.toString(shapes));

	}

}

class Shape implements Comparable<Shape> {

	private String name;
	private int length;
	private int width;
	private double area;
	private final double PI = 3.14;

	public Shape() {
	}

	public static Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public Shape(String name, int length) {
		this.name = name;
		this.length = length;
		setArea();
	}

	public Shape(String name, int length, int width) {
		this.name = name;
		this.length = length;
		this.width = width;
		setArea();
	}

	private void setArea() {
		if (name.equals("CIRCLE")) {
			this.area = PI * length * length;
		} else if (name.equals("SQUARE")) {
			this.area = length * length;
		} else if (name.equals("REC")) {
			this.area = length * width;
		} else {
			this.area = 0;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public double getArea() {
		return area;
	}

	@Override
	public String toString() {
		return "Shape [name=" + name + ", length=" + length + ", width=" + width + ", area=" + area + "]";
	}

	@Override
	public int compareTo(Shape o) {

		return (int) (this.area - o.area);
	}

}