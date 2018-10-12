package case1322Lab;
/*	   J06_12.java    	*/
/*	Program to convert positive integer form one type number system to another type*/
import java.util.Scanner;

public class NumberSystemConversion {
	public static void main(String[] args) {

		char Base20[] ={'0','1','2','3','4','5','6','7','8','9','A','B', 'C','D','E','F', 'G', 'H', 'I', 'J'};

		int NumtoConvert=0;
		int ConvertedNum[] = new int[64];
		int Index, Base=0, NextDigit;
		Index =0; 
		Scanner S = new Scanner(System.in);
		try {
			System.out.print("Enter a Decimal Number to be Converted: ");
			NumtoConvert = S.nextInt(); 
			BB: 
				for(; ;){
					System.out.print("Enter Base for Conversion (2 or 8 or 10, 16 or 20): ");
					Base = S.nextInt(); 
					if ((Base!=2)&&(Base!=8)&&(Base!=10)&&(Base!=16) && (Base!=20))
						continue BB;
					else
						break BB;
				}
		}

		catch(Exception E){
			System.out.print("\nError in input! Program terminated.");
			System.exit(0);
		}

		changeNumberSystem(Base20, NumtoConvert, ConvertedNum, Index, Base);
		System.out.println();

		S.close();

	}	// End of main()

	private static void changeNumberSystem(char[] Base20, int NumtoConvert, int[] ConvertedNum, int Index, int Base) {
		int NextDigit;
		
		while(NumtoConvert !=0){
			ConvertedNum[Index]= NumtoConvert % Base;
			++Index;
			NumtoConvert = NumtoConvert/Base;
		}
		Index = Index-1;
		System.out.print("\nThe Equivalent Number in Base " +Base + " is: ");

		while(Index>=0){
			NextDigit=ConvertedNum[Index];
			System.out.print(Base20[NextDigit]);
			--Index;
		}
	}
} // End of class
