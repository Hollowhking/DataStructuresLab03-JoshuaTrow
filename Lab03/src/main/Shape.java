package main;

public abstract class Shape {
	String color;
	Shape(String color){
		this.color=color;
	}
	public abstract float getArea();
	public abstract float getPerimeter();
	public abstract String toString();
}
