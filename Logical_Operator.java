package pakage1;

public class Logical_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age=60;
		char gender='F';
		
		if(age>=50 && gender=='F')
		{
			System.out.println(" Rail tickets are free for women");
		}
		
		if(age>=55 || gender=='M')
		{
			System.out.println(" Rail tickets are free for men");	
		}
		
		if(!(age<25 && gender=='F'))
		{
			System.out.println(" Rail tickets are free for men1");	
		}
		
		if(!(age<2))
		{
			System.out.println(" Travelling not allowed");	
		}
	}

}
