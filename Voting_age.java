package pakage1;

public class Voting_age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=15;
		char gender='F';
		
		if ( (age>=18 && gender=='M') ||( age>=18 && gender=='F'))
		{
			System.out.println("He/She can vote");
		}
		
		else
		{
			System.out.println("He/She can not vote");
		}
		
	
	}

}
