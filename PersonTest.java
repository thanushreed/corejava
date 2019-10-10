import java.util.Scanner;
class Person {
	private String name;
    private int age;
    private String constituency;
    Scanner s;

   Person()  // Default constructor
	{
	 System.out.println("Voter Eligiblity App");
	 age=0;
	 name="";
         constituency="Bengaluru";
         s= new Scanner(System.in);
	}

  Person(String n,int a) // parameterized constructor
  {
   name=n;
   age=a;
  }

  Person(String n,int a,String c) // parameterized constructor
  {
   name=n;
   age=a;
   constituency="Mumbai";
   
}
   public void input() {
     System.out.println("Enter Your Name:");
    name=s.next();
    System.out.println("Enter Your age:");
     age=s.nextInt();
    }
    
    public void print() 
{
    System.out.println("Name is: " + name);
    System.out.println("Age is: " + age);
	System.out.println("Constituency is: " + constituency);
    }
}

public class PersonTest {

    public static void main(String [] args) {
    Person objPerson = new Person();
    Person objPerson1 = new Person("Raj",30);
    Person objPerson2 = new Person("Mike",50,"Delhi");

    objPerson.input();
    //objPerson.eligible();
    objPerson.print();

    
    //objPerson1.eligible();
    objPerson1.print();
    
    //objPerson2.eligible();
    objPerson2.print();
    }

}

