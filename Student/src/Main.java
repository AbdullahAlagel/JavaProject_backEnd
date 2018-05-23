import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		Student stu = new Student(); 
		try {
		System.out.print("Please , Enter your ID :");
		stu.setID(input.nextInt());
		System.out.print("Please , Enter your NAME :");
		stu.setName(input.next());
		System.out.print("Please , Enter your AGE :");
        stu.setAge(input.nextInt());
		System.out.print("Please , Enter your MAJOR :");
		stu.setMajor(input.next());
		System.out.print("Please , Enter your GPA :");
        stu.setGPA(input.nextInt());
		stu.printStudentInfo();
		}
		//catch(Exception e) {
		//	System.out.println("Please Enter a Valid Value");
		//}
		catch(InputMismatchException ie) {
			System.out.println("Please Enter a Valid Value");
		}
		
	}

}
