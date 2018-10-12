package case1322Lab;

import java.util.Scanner;

public class PalindromeTest {
	public static void main (String[] args){   

		String str, another = "y";
		int left, right;
		Scanner scan = new Scanner (System.in);
		while (another.equalsIgnoreCase("y")) // allows y or Y
		{
			System.out.println ("Enter a potential palindrome string:");
			str = scan.nextLine();   // madam
			left = 0;
			right = str.length() - 1;  // 4

			while (str.charAt(left) == str.charAt(right) && left < right)
			{     
				left = left + 1;   // 1  // 2
				right = right - 1;     // 3  // 2
			}
			
			System.out.println();
			if (left < right)  // 2 == 2
				System.out.println ("That string is NOT a palindrome.");
			else
				System.out.println ("That string IS a palindrome.");
			System.out.println();
			System.out.print ("Test another palindrome (y/n)? ");
			another = scan.nextLine(); }
	}

}

