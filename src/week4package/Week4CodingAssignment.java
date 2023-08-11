package week4package;

public class Week4CodingAssignment {

	
	
	
	public static void main(String[] args) {
		// QUESTION 1
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93};
		
		//a - subtract first element from last and print to console.
		System.out.println("First element of ages " + ages[0] + " subtracted from last element " +ages[ages.length-1] 
		+ " is " + (ages[0] - ages[ages.length-1]));
		
		//b 
		int arrayLength = ages.length;
		int[] ages2 = new int[arrayLength+1];
		
		//c - calculate average age
		int sum = 0;
		for(int i = 0; i < arrayLength; i++) {
			sum += ages[i];
		}
		
		int averageAge = sum/arrayLength;
		System.out.println("The average age is " + averageAge);

		//QUESTION 2
		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//a - calculate average number of letters per name
		sum = 0;
		for (String name : names) {
			sum += name.length();
		}
		int averageLetters = sum/names.length;
		
		System.out.println("Average number of letters per name is " + averageLetters);
		
		String concat = "";
		
		for(String name : names) {
			concat += name + " ";
		}
		System.out.println(concat);
		
		//QUESTION 3 & 4 - How to access last and first element of an array
		System.out.println(names[names.length-1]);
		System.out.println(names[0]);
		
		//QUESTION 5
		int[] nameLengths = new int [names.length];
		
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		sum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sum += nameLengths[i];
		}
		
		System.out.println("The sum of nameLengths is " + sum);
		System.out.println();
		
		//Question 7 
		System.out.println(concatThisNTimes("Hello",3));
		System.out.println();
		
		//Question 8
		String first = "Walter";
		String last = "White";
		
		System.out.println("The full name is " + fullName(first,last));
		System.out.println();
		
		//Question 9
		int[] sumArray1 = {25, 25, 25, 26};
		int[] sumArray2 = {25, 25, 25, 25};
		
		System.out.println("sumArray1 is " + checkSum(sumArray1));
		System.out.println("sumArray2 is " + checkSum(sumArray2));
		System.out.println();
		

		//Question 10
		double[] doubleArray = {1.5, 2.6, 3.7,4.8};
		System.out.println("Average of the double array is " + doubleAvg(doubleArray));
		System.out.println();
		
		//Question 11
		double[] doubleArray2 = {1.1, 2.2, 3.3,4.4};
		//Question 12
		System.out.println("Average of array 1 is bigger than array2: " + compareArrays(doubleArray,doubleArray2));
		System.out.println();
		
		//Question 13
		boolean isPantryFull = false;
		double myMoney = 23.3;
		System.out.println("You Should Order Takeout: " + orderTakeOut(isPantryFull,myMoney));
	}
	
	//Question 7
	public static String concatThisNTimes (String word, int n) {
		String newWord = "";
		
		for (int i = 0; i < n; i++) {
			newWord += word;
		}
		return newWord;
	}

	//Question 8
	public static String fullName (String first, String last) {
		return first + " " + last;
	}
	
	//Question 9
	public static boolean checkSum (int [] array) {
		int arraySum = 0;
		
		for (int i = 0; i < array.length; i++) {
			arraySum += array[i];
		}
		if (arraySum > 100)
			return true;
		
		return false;
	}
	
	//Question 10
	public static double doubleAvg (double[] array) {
		
		double sum = 0.0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum/array.length;
	}
	
	//Question 11
	public static boolean compareArrays (double[] array1, double[] array2) {
		if (doubleAvg(array1) > doubleAvg(array2))
			return true;
		
		return false;
	}
	
	//Question 12
	public static boolean willBuyDrink (boolean isHot, double money) {
		if (isHot && money > 10.50)
			return true;
		
		return false;
	}
	
	//Question 13
	/*
	 * This method checks if I can order takeout or not
	 */
	public static boolean orderTakeOut (boolean pantryStocked, double money) {
		
		//If the pantry is stocked but I have more than 45 bucks to spend
		if (pantryStocked && money > 45.00) {
			return true;
		}
		//Pantry not stocked and money is tight so get something cheap
		if (!pantryStocked && money > 20.00) {
			return true;
		}
		
		//stay hungry
		return false;
	}
	
}
