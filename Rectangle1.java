public class Rectangle1 implements Shape1{
	private double width;
	private double height;
	public Rectangle1(double w,double h) {
		this.width=w;
		this.height=h;
	}
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
	public double getArea() {
		return this.height*this.width;
	}

}

