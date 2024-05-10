package codsoft_internship;
import java.util.Scanner;

public class Student_Grade {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int arr[]=new int[6];
		int total = 0;
		System.out.println("enter the marks of a student in 6 subjects:");
		for(int i=0;i<arr.length;i++) {
			System.out.print("Marks in subject "+(i+1)+"= ");
			arr[i] = scr.nextInt();
		}
		System.out.println();
		System.out.println("==>Results obtaineed by a student:");
		for(int i=0;i<arr.length;i++) {
			total +=arr[i];
		}
		System.out.println("total Marks: "+total);
		int avg = total/6;
		System.out.println("Average: "+avg);
		System.out.print("Grade of student=");
		if(avg>=90) {
			System.out.println("A");
		}
		else if(avg>=80) {
			System.out.println("B");
		}
		else if(avg>=70) {
			System.out.println("C");
		}
		else if(avg>=60) {
			System.out.println("D");
		}
		else if(avg>=50) {
			System.out.println("E");
		}
		else {
			System.out.println("Fail");
		}
		
	}

}
