
  
class Car{
   public Car()
   {
	System.out.println("Class Car");
   }
   public void vehicleType()
   {
	System.out.println("Vehicle Type: Car");
   }
}
class Maruthi extends Car{
   public Maruthi()
   {
	System.out.println("Class Maruthi");
   }
   public void brand()
   {
	System.out.println("Brand: Maruthi");
   }
   public void speed()
   {
	System.out.println("Max: 90Kmph");
   }
}
public class Maruthi800 extends Maruthi{

   public Maruthi800()
   {
	System.out.println("Maruthi Model: 800");
   }
   public void speed()
   {
	System.out.println("Max: 80Kmph");
   }
   public static void main(String args[])
   {
	 Maruthi800 obj=new Maruthi800();
	 obj.vehicleType();
	 obj.brand();
	 obj.speed();
   }
}
