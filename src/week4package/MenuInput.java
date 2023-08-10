package week4package;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class MenuInput {
	static List<String> iceCreamList = new ArrayList<String>();
	static Scanner input = new Scanner(System.in);
	private static final int maxScoops = 3;
	private static List<String> options = Arrays.asList("Vanilla", "Chocolate", "Mint Chocolate Chip", "Strawberry", "Black Raspberry", "Chocolate Peanut Butter Cup", "Bubble Gum", "Banana Fudge", "End of Ice Cream Selection");
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   // **********************************************************
	   //   Future enhancement -- Create a List of IceCreamOrders, 
	   //	and then add the order to the list, and
	   //	prompt the User and 
	   //   ask whether their order is complete or not.
	   // **********************************************************

		IceCreamOrder userOrder = new IceCreamOrder();
		boolean finished = false;
		System.out.println("------------------------------\nWelcome to The Ice Cream Stand\n------------------------------\n");
		
		while (!finished) {
			System.out.print("Enter a name for your order: ");
			
			int counter = 0;
			boolean willOrderIceCream = true;
			int userInput = 0;
			
		}
	}

}
