package case1322Lab;

public class RecursiveNSConversion {
	public static void main(String[] args) {
		int number = 31;  // base 10
		int base = 16; 
		System.out.println("The numner " + number + " in base " + base + " is: " +recursiveNSConvert(number, base) );
	}

	public static String recursiveNSConvert(int number, int base) {
		if(number>0) {  // 31 // 1 // 0 
			int temp = (number%base); // 31 % 16 = 15  // 1 % 16 = 1
			if(temp>9) {  // 15 > 9  // 1 > 9 (false)
				char ans = (char)(64+(temp-9)); // (64 + (15 - 9)) = 70 = 'F'
				return (recursiveNSConvert(number/base, base)+ ans);
				// 1, 16 ans = F
			}
			else 
				return (recursiveNSConvert(number/base, base)+ temp);
					// 0, 16 temp = 1
		}
		return "";  // "" + 1 + F = "1F"
		
	}


}
