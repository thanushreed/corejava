
public class Time {
	double hours;
	double minutes;
	double seconds;
	final int MAXVALUE=60;

	public 	Time(double h,double m, double s) {
		hours=h;
		minutes=m;
		seconds=s;
	}
	void add(Time obj2) {
		
		if((this.seconds+obj2.seconds)>MAXVALUE) {
			this.minutes++;
			this.seconds=(this.seconds+obj2.seconds)-MAXVALUE;
		}
		else {
		this.seconds+=obj2.seconds;
		}
		if((this.minutes+obj2.minutes)>MAXVALUE) {
			this.hours++;
			this.minutes=(this.minutes+obj2.minutes)-MAXVALUE;
		}else{
			this.minutes+=obj2.minutes;
	}
		this.hours+=obj2.hours;
	}
	void display() {
		System.out.println(this.hours+" "+this.minutes+" "+this.seconds);
	}
	public static void main(String[] args) {
		Time obj1=new Time(10,30,59);
		Time obj2=new Time(12,30,40);
		obj1.add(obj2);
		System.out.println("The addition of the two time is:");
		obj1.display();
	}

	

}
