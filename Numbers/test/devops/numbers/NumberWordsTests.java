package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
private NumberWords numberToWords ;
	
	@Before
	public void setup() {
		numberToWords = new NumberWords() ;
	}

	
	//Negative Scenarios
	@Test
	public void numberOutOfRangeReturnsErrorLessThan1() {
		Assert.assertEquals( "Error", "Number out of range", numberToWords.convertToWords( -1 ) ) ;
	}
	@Test
	public void numberOutOfRangeReturnsErrorGreaterThan1000() {
		Assert.assertEquals( "Error", "Number out of range", numberToWords.convertToWords( 1000 ) ) ;
	}


	//Positive Scenarios:	
	@Test
	public void numberWith_1() {
		Assert.assertEquals( "Success", "one", numberToWords.convertToWords( 1 ) ) ;
	}
	@Test
	public void numberWith_15() {
		Assert.assertEquals( "Success", "fifteen", numberToWords.convertToWords( 15 ) ) ;
	}
	@Test
	public void numberWith_19() {
		Assert.assertEquals( "Success", "nineteen", numberToWords.convertToWords( 19 ) ) ;
	}
	
	
	@Test
	public void numberWith_20() {
		Assert.assertEquals( "Success", "twenty", numberToWords.convertToWords( 20 ) ) ;
	}
	@Test
	public void numberWith_77() {
		Assert.assertEquals( "Success", "seventy seven", numberToWords.convertToWords( 77 ) ) ;
	}
	@Test
	public void numberWith_99() {
		Assert.assertEquals( "Success", "ninety nine", numberToWords.convertToWords( 99 ) ) ;
	}
	
	
	
	@Test
	public void numberWith_100() {
		Assert.assertEquals( "Success", "one hundred", numberToWords.convertToWords( 100 ) ) ;
	}
	
	@Test
	public void numberWith_777() {
		Assert.assertEquals( "Success", "seven hundred seventy seven", numberToWords.convertToWords( 777 ) ) ;
	}
	
	@Test
	public void numberWith_999() {
		Assert.assertEquals( "Success", "nine hundred ninety nine", numberToWords.convertToWords( 999 ) ) ;
	}
	
}
