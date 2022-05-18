import java.util.Scanner;
class Main
{
  public static void main (String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println ("Enter a string");
    String string = sc.nextLine ();
	
    System.out.println (" ");
	
    System.out.println ("Enter a word to check the occurence");
    String word = sc.nextLine ();
    
    String temp[] = string.split (" ");
    int count = 0;
    for (int i = 0; i < temp.length; i++)
      {
	    if (word.equals (temp[i]))
	     count++;
      }
    System.out.println (" ");
    System.out.println ("The string is: " + string);
    System.out.println ("The word " + word + " occurs " + count +
			" times in the above string");
  }
}
