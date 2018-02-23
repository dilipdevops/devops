package devops.numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public final class NumberWordsApplication {
	 public  NumberWords numberToWords;
	 public  BufferedReader reader;
	 int num;
	
	public NumberWordsApplication() {
		numberToWords = new NumberWords() ;
		reader = new BufferedReader( new InputStreamReader( System.in ) ) ;
	}
	
	public void execute() {
		while( true ) {
			try {
				System.out.print( "Enter number (0 to exit): " ) ;
				String value = reader.readLine() ;
				num = Integer.parseInt( value ) ;
				
				if (num == 0){
					System.out.println("Exiting the Application");
					System.exit(0);	
				}
				else 
				{
					System.out.println(numberToWords.convertToWords(num));
				}
			} catch ( NumberFormatException | IOException e ) {
				System.out.println( "Invalid number" ) ;
			}
		}
		
	}

	public static void main(String[] args) {
		new NumberWordsApplication().execute() ;
	}

}
