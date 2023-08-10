package week4package;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentNamesMenuApp {

	static Scanner scanner = new Scanner(System.in);
	static List<String> students = new ArrayList<String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int choice = 0;
		
		while (choice != -1) {
			
			showMenu();
			
			choice = getUserChoice();
			
			if (choice == 1) {
				printStudentNames();
			} else if (choice == 2) {
				addStudentNames();
			} else if (choice == 3) {
				deleteStudentNames();
			} else if (choice == 4) {
				System.out.println("Goodbye!");
			} else {
				System.out.println("Please Select Valid Choice");
			}
				
		}
	}

	private static void deleteStudentNames() {
		// TODO Auto-generated method stub
		System.out.println("Enter Index of Student Name To Delete");
		int index = getUserChoice();
		
		if (index < students.size()) {
			students.remove(index);
		} else {
			System.out.println("Index not available");
		}
			
		
		
	}

	private static void addStudentNames() {
		// TODO Auto-generated method stub
		System.out.println("Enter Student Name\n");
		students.add(scanner.next());
	}

	private static void printStudentNames() {
		// TODO Auto-generated method stub
		for (String student : students) {
			System.out.println(student);
		}
	}

	private static int getUserChoice() {
		// TODO Auto-generated method stub
		
		return scanner.nextInt();
	}

	private static void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("1) Print Student Names");
		System.out.println("2) Add Student Names");
		System.out.println("3) Delete Student Names");
		System.out.println("--------------------------");
	}

}
