
public class SmallestMultiple
{
	public static void main(String args[])
	{

	  int[] answers = new int[20];
	    for(int i = 0; i < 20; i++)
	    {
	        answers[i] = i + 1;
	    }
	    int answer = 1;
	    for(int i = 0; i<answers.length;i++)
	    {
	            if(answers[i] != 1)
	            {
	                answer *= answers[i];
	                for(int j=answers.length-1; j>=i ;j--)
	                {
	                    if(answers[j]%answers[i]==0)
	                    {
	                        answers[j]=answers[j]/answers[i];
	                    }
	                }
	            }
	    }
	    System.out.println(answer); 
	}
}