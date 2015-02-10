
public class LargestPalindromeProduct 
{
	public static int LOW_END = 100; //the lowest 3 digit number
	public static int HIGH_END = 1000; //the number above the highest 3 digit number
	public static boolean isPalindrome = false; //tells whether or not the currentProduct is a palindrome
	public static void main(String[] args) 
	{
		String largestPalindrome = "";
		String product = "";
		int currentProduct = 0;
		String reverseProduct = "";
		for (int i = HIGH_END - 1; i >= LOW_END; i--) //creates a double loop so that every product of any two three-digit numbers can be addressed
		{
			for (int j = HIGH_END - 1; j >= LOW_END; j--)
			{
				currentProduct = i * j;
				product = String.valueOf(currentProduct); //creates a string that can be tested for being a palindrome				
				int m = product.length();
				if (m == 6) //disregards any 5 digit palindromes
				{
					String s1 = product.substring(0, 1);
					String s2 = product.substring(product.length() - 1);
					if (s1.compareTo(s2) == 0) //Check to see if the first and last numbers are the same, and only test those to save time
					{
						reverseProduct = reverseNumber(product);
						if (reverseProduct.compareTo(product) == 0) // determines whether or not the value is a palindrome
							isPalindrome = true;
					}
					if (isPalindrome) //compares new values with the current highest and decides whether or not the new value is larger
					{
						if (product.compareTo(largestPalindrome) > 0)
							largestPalindrome = product;
						isPalindrome = false; //resets the boolean to false so that non-palindromes aren't accidently tested as palindromes
					}
				}
			}
		}
		System.out.println(largestPalindrome);
	}
	public static String reverseNumber(String n) //method to take any product and reverse it
	{
		String reverse = "";
		int k = n.length();
		for (int i = (k - 1); i >= 0; i--)
		{
			reverse = reverse + n.charAt(i);
		}
		return reverse;
	}
}
