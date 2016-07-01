import java.util.Scanner;
import java.util.*;

public class caesar {
	

	public static void main(String[] args)
	{
		
		Scanner read = new Scanner(System.in);
		String text;
		System.out.println("Enter a string for encryption");
		text=read.next();
		String plainText=text;
		System.out.println("Plain Text : ");
		System.out.println(plainText);
		System.out.println("**************");
		System.out.println("Cipher Text : ");
	
		
		for(int i=0;i<plainText.length();i++)
		{	
			System.out.print(encrypt(plainText.charAt(i)));
			
		
		}
		
		
		
	}
		
	private static char encrypt(char en)
	{
		if(!Character.isLetter(en))
		{
			return en;
		}
		
		if(Character.isUpperCase(en))
			return (char) (((en-'A')+3)%26+'A');
		return (char) (((en - 'a')+3)%26+'a');
	}
}
