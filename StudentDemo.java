import java.util.Scanner;

class StudentDemo{
		int stu_Id;
		String stu_Name;
		float stu_marks;
		Scanner s;
		
		void input()
		{
			s=new Scanner(System.in);
			System.out.println("Enter student Id");
			stu_Id=s.nextInt();
			System.out.println("Enter student Name");
			stu_Name=s.next();
			System.out.println("Enter student marks");
			stu_marks=s.nextFloat();
		}
		void display()
		{
			System.out.println("The student Details:");
			System.out.println("Student Id:"+stu_Id);
			System.out.println("Student Name:"+stu_Name);
			System.out.println("student marks:"+stu_marks);
		}
		void CalculateGrade(float marks)
		{
			if(marks>=85) {
				System.out.println("distinction");
			}else if(marks>=70 && marks>85) {
				System.out.println("FirstClass");
			}else if(marks<70) {
				System.out.println("SecondClass");
			}
		}
			
		

}
