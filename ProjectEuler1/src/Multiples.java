
public class Multiples 
{
	public static void main(String args[])
	{
		int sum = 0; //initializes a variable to hold final sum
		for(int x = 1; x < 1000; x++) //creates a loop to traverse through 
		{                              // all values between 3 and 1000
			if ((x % 3 == 0)||( x % 5 == 0)) //checks to see if value is a
			{                                 // multiple of 3 or 5
				sum += x; //sums the discovered multiples
			}
		}
		System.out.println(sum); //prints the final sum
	}
}


