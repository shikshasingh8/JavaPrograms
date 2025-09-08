package pakage1;

public class Nested_if_else_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int physics=90;
		int maths=90;
		int chemistry=75;
		int total_marks=300;
		int passing_marks=250;
		int student_marks=physics+maths+chemistry;
		
		if(physics>=75 && maths>=75 && physics>=75)
		{ 
					
		        if(student_marks>=passing_marks)
		        {
		        	System.out.println("Student passed");
		        }
		        else 
		        {
		        	System.out.println("student failed");
		        }
	    }
		else
		{
        	System.out.println("student failed");

		}
}
}
