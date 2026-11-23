import java.util.Scanner;
import java.lang.StringBuilder;
void main()
{
    Scanner input=new Scanner(System.in);

/*1. Develop a program that takes the weight (in kilograms) and height (in meters)
as input and calculates the BMI, then prints it.*/
//• Input: Weight (kg) = 70, Height (m) = 1.75
//• Expected Output: BMI = 22.86

    int weight1=70;
    double Height1=1.75;
    double BMI=Height1 * Height1;
    System.out.println("BMI = "+weight1/BMI);
    System.out.println("..............................................");
//..................................................................................

/*2. Write a program that takes the obtained marks and total marks as input and
calculates the percentage, then prints it. */
//• Input: Obtained Marks = 85, Total Marks = 100
//• Expected Output: Percentage = 85.0%

    System.out.println("Enter obtained marks:85");
    int obtainedMarks=input.nextInt();
    System.out.println("Enter total marks:100");
    int totalMarks=input.nextInt();
    double percentage=obtainedMarks*100;
    System.out.println("Percentage = "+percentage/100+"%");
    System.out.println("..............................................");
//.................................................................................

/*3.Create a program that takes an amount in one currency and an exchange rate
as input, then converts and prints the amount in another currency.*/
//• Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
//• Expected Output: Amount in EUR = 85.0

    int amountUSD=100;
    double exchangeRate=0.85;
    System.out.println("Amount in EUR = "+exchangeRate*amountUSD);
    System.out.println("..............................................");
//.................................................................................

/*4.Create a program that takes a string as input, calculates its length, and then
reverses the string using the StringBuilder class, finally printing both the length and
reversed string.*/
//• Input: "Hello, World!"
//• Expected Output: Length of the string: 13 And Reversed string: "!dlroW,olleH"


    String sentence="Hello, World!";
    StringBuilder stringBuilder=new StringBuilder(sentence);// I got the method from this website "https://www.geeksforgeeks.org/java/reverse-a-string-in-java/"
    System.out.println(sentence.length());
    System.out.println(stringBuilder.reverse());
    System.out.println("..............................................");
//.................................................................................

/*5.Develop a program that takes a sentence as input and extracts a substring from
it, then prints the extracted substring.*/
//• Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index = 10, End Index = 20
//• Expected Output: "brown fox"

   String sentence2="The quick brown fox jumps over the lazy dog";
   System.out.println(sentence2+ " --The new sentence ( " +sentence2.substring(10,20)+")");
    System.out.println("..............................................");
//.................................................................................

/*6.Write a program that takes a sentence and a keyword as input, then check if
the keyword is present in the sentence and prints the result.*/
//• Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword ="jumps".
//• Expected Output: Keyword "jumps" is present in the sentence.

   System.out.println("Keyword \"jumps\" is present in the sentence"+" ("+sentence2.contains("jumps")+")");
    System.out.println("..............................................");
//.................................................................................
/*7.Develop a program that takes a sentence and a word to replace as input, then
replace all occurrences of the word with another word and prints the modified
sentence.*/
//• Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to
//   Replace = "fox", Replacement Word = "cat"
//• Expected Output: "The quick brown cat jumps over the lazy dog"

    System.out.println(sentence2.replace("fox","cat"));
    System.out.println("..............................................");

//................................................................................
/*8.Write a program that takes two strings as input and check if they are equal,
ignoring the case, then prints whether they are equal or not.*/
//• Input: String 1 = "Hello", String 2 = "hello"
//• Expected Output: Strings are equal (ignoring case).
    String string1="Hello";
    String string2="hello";
    System.out.println("Strings are equal (ignoring case) = "+string1.equalsIgnoreCase(string2));
    System.out.println("..............................................");
//...............................................................................
}
