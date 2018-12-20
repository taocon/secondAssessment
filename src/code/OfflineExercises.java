package code;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {

		String newString = "";

		for (int i = 0; i < input.length(); i++) {
			newString = newString + input.charAt(i) + input.charAt(i) + input.charAt(i);

		}
		return newString;
	}
	//
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {

		String newString = input.toLowerCase();
		
		for (int i=0 ; i < newString.length() ; i++)
		{
			
			
			
			
		}
		

		// if (input.)

		return "";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {

		int small = 0;
		int medium = 0;
		int big = 0;

		if (a < b && a < c) {
			small = a;
		}
		if (b < a && b < c) {
			small = b;
		}
		if (c < a && c < b) {
			small = c;
		}

		if ((a < b && a > c) || (a > b && a < c)) {
			medium = a;
		}
		if ((b < a && b > c) || (b > a && b < c)) {
			medium = b;
		}
		if ((c < a && c > b) || (c > a && c < b)) {
			medium = c;
		}

		if (a > b && a > c) {
			big = a;
		}
		if (b > a && b > c) {
			big = b;
		}
		if (c > a && c > b) {
			big = c;
		}

		if (Math.abs(big-medium) == Math.abs(medium-small))
		{
			return true;
		}
		
		return false;
	}

	// Given a string and an int n, return a string that removes n letters from the
	// 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input
	// is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a) {

		String newInput = input;
		String firstHalf = "";
		String secondHalf = "";
		int size = newInput.length();
		size = input.length();
		// System.out.println(size);

		for (int i = 0; i < a; i++) {

			// System.out.println("one");
			firstHalf = newInput.substring(0, (size / 2));
			secondHalf = newInput.substring((size / 2) + 1, size);
			newInput = firstHalf + secondHalf;
			size = size - 1;
			// System.out.println(size);
		}
		// System.out.println(firstHalf + secondHalf);
		return firstHalf + secondHalf;

	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public boolean endsDev(String input) {

		String devCheck = "";

		if (input.length() > 2) {
			devCheck = input.substring(input.length() - 3, input.length());
			devCheck = (devCheck.toLowerCase());
			// System.out.println(devCheck);
			if (devCheck.equals("dev")) {
				return true;
			} else

				return false;
		} else
			// System.out.println("fail");
			return false;
	}

	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		String[] stringArray = input.split("");
		
		
		int numOfDuplicate = 0;
		int topDuplicate = 1;
		for (int i = 0 ; i <= input.length() ;i++)
		{
			

			
			
			
			System.out.println(stringArray[i]);
			
			if (stringArray[i].equals(stringArray[i+1]))
			{
				
				System.out.println(numOfDuplicate);
				numOfDuplicate++;
			}
			
			
			
		}
		
		return numOfDuplicate;

	}

	// given a string - return the number of times "am" appears in the String
	// ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by
	// other letters
	//
	// amISearch("Am I in Amsterdam") → 1
	// amISearch("I am in Amsterdam am I?") → 2
	// amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) {

		int counter = 0;
		String arg2 = arg1.toLowerCase();

		String[] arrayOfStrings = arg2.split(" ");

		for (int i = 0; i < arrayOfStrings.length; i++) {
			if (arrayOfStrings[i].equals("am")) {

				counter++;
			}
		}

		return counter;

	}

	// given a number
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3 and 5return "fizzbuzz"
	//
	// fizzBuzz(3) → "fizz"
	// fizzBuzz(10) → "buzz"
	// fizzBuzz(15) → "fizzbuzz"

	public String fizzBuzz(int arg1) {

		if (arg1 % 3 == 0 && (arg1 % 5 != 0))

		{
			return "fizz";
		}

		if ((arg1 % 3 != 0) && (arg1 % 5 == 0)) {
			return "buzz";
		}

		else
			return "fizzbuzz";

	}

	// Given a string split the string into the individual numbers present
	// then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	// largest("55 72 86") → 14
	// largest("15 72 80 164") → 11
	// largest("555 72 86 45 10") → 15

	public int largest(String arg1) {
		
		String[] firstSplit = arg1.split(" ");
		
		for (int i = 0 ; i < 3 ; i++ )
		{
				firstSplit[i].split("");
				
			
			
		}
		
		
		return 0;

	}

}
