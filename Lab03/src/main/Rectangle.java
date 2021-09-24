package main;

public class Rectangle extends Shape{
	float length, width;
	Rectangle(String color, float length, float width){
		super(color);
		this.length=length;
		this.width=width;
	
	}
	public float getArea() {
		return (length*width);
	}
	public float getPerimeter() {
		return ((2*length)+(2*width));
	}
	public String toString() {
		return this.color+" rectangle with length "+this.length+" and width "+this.width;
	}

}
