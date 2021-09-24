package main;

public class Circle extends Shape{
	float radius,pi=3.141f;
	Circle(String color,float radius) {
		super(color);
		this.radius=radius;
	}

	public float getArea() {
		return (pi*(radius*radius));
	}

	public float getPerimeter() {
		return  (2*(pi*radius));
	}

	public String toString() {
		return this.color+" circle with radius "+this.radius;
	}

}
