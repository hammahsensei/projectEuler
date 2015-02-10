
public class LargestPrimeFactor 
{
	public static void main(String[] args) 
	{
		long bigNum = 600851475143L;
		for (int count = 2; count <= bigNum; count++) //traverses through all values between
		{                                              // 2 and the given large number
			if (bigNum % count == 0) //checks to see if current value of count
			{                         // is a factor
				while (bigNum % count == 0) //excecutes only when the value of count is a factor
				{
					bigNum /= count; //redefines bigNum so that it can be further factored
					
				}
				System.out.println(count); //prints all of the prime factors of bigNum
			}
		}
	}
}
