package devops.numbers;

import java.util.Arrays;
import java.util.List;

public class NumberWords {
	
	private static List<String> listOfNumbers = Arrays.asList("", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", 
			"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen");
	
	private static List<String> listOfTensMultiple = Arrays.asList("ten", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety");
	
	private static List<String> listOfTensPower = Arrays.asList("hundred", "thousand");
	
	public String convertToWords(int numbers) {
		return convertToWords(numbers, "");
	}

	public String convertToWords(int num, String result) {
		String finalResult = result;

		if(num < 0 || num > 999) {
			finalResult = "Number out of range";
		} else {
			if(num == 0) {
				finalResult = listOfNumbers.get(num);
			} if(num > 0 && num < 20 ) {
				finalResult = listOfNumbers.get(num);
			} if(num >= 20  && num <= 99) {
				finalResult = listOfTensMultiple.get(num / 10);
				finalResult = finalResult + " " + convertToWords(num % 10, finalResult);
			} if(num >= 100 && num <= 999) {
				finalResult = listOfNumbers.get(num / 100) + " " + listOfTensPower.get(0);
				finalResult = finalResult + " " + convertToWords(num % 100, finalResult);
			} 
		}
		return finalResult.trim() ;
	}

}