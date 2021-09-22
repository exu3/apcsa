public class StateSong
{
  public static void main(String[] args)
  {
	// string literal assignment
	String line1 = "When the snow crowned Golden Sierras";
	System.out.println(line1);

	// string class constructor
	String line2 = new String("Keep their watch o'er the valleys bloom,");
	System.out.println(line2);

	// immutable String
	String line3 = "It is there I would be";
	line3 = line3.concat(" in our land by the sea");
	System.out.println(line3);

	// implicit type conversion via concatenation
	String line4 = " Every breeze bearing rich perfume.";
	int lineNo = 4;
	System.out.println(lineNo + line4);

	// += operator
	String line5 = "It is here nature gives of her rarest. ";
	line5 += "It is Home Sweet Home to me,";
	System.out.println(line5);

	// + operator
	String line6 = "And I know when I die ";
	line6 = line6 + "I shall breathe my last sigh";
	System.out.println(line6);

	// three escape sequences
	String line7 = "\n\"For my sunny California.\"";
	System.out.print(line7);

  }
}

/**
 * to-do
 * A String created using a literal
 * A String created using the String class constructor
 * An immutable String
 * An implicit type conversion via concatenation
 * The += operator for concatenation
 * The + operator for concatenation
 * Three escape sequences
 */

 /** 
  * lyrics:
  	When the snow crowned Golden Sierras
	Keep their watch o'er the valleys bloom,
	It is there I would be in our land by the sea,
	Every breeze bearing rich perfume.
	It is here nature gives of her rarest. It is Home Sweet Home to me,
	And I know when I die I shall breathe my last sigh
	For my sunny California.
  */