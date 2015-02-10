
public class EvenFibbo 
{
	public static void main(String[] args) 
	{
		int totalSum = 0; //prepares variables to be able to find
		int x1 = 1;        // each number in the fibbo sequence
		int x2 = 2;
		int temp;
		while(x2 < 4000000) //checks to make sure values stay below margin
		{
			if (x2 % 2 == 0) //checks to see if value is even
			{
				totalSum += x2; //adds value to sum if even
			}
			temp = x2;
			x2 = x1 + x2;    //finds next value in sequence
			x1 = temp;

		}
		System.out.println(totalSum); //prints final sum

	}

}
