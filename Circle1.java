
public class Circle1 implements Shape1 {
	private double radius;
	
	public Circle1(double r) {
		this.radius=r;
	}
	public void draw() {
		System.out.println("Drawing circle");
	}
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}
	public double getRadius() {
		return this.radius;
	}

}
