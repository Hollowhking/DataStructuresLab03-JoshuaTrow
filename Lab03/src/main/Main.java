package main;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
	    ArrayList<Shape> shapes = new ArrayList<>();
	    shapes.add(new Circle("Red", 2.0f));
	    shapes.add(new Rectangle("Blue", 1.5f, 3.0f));
	    //cycle through arraylist
	    for (Shape shape: shapes) {
	        System.out.println("");
	        System.out.println(shape.toString());
	        System.out.printf("Area: "+ shape.getArea());
	        System.out.printf(" Perimeter: "+ shape.getPerimeter());
	    }
	}
}
