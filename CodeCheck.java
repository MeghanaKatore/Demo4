/*Q 6  write a program  to ask name and code (String) of security staff .
if code =="COOLCOOL" then print "welcome user" else Ask him to reenter code .and maximum chance to enter code is 3.After third attempt print "GoBack". */
package SelfEvaluation;
import java.util.Scanner;

public class CodeCheck {
	private static final String COOLCOOL = null;
	String code;
	String name;
	
	void codecheck()
	{
		int i=1;
		Scanner sc = new Scanner(System.in);
		do
		{
		System.out.println("Enter the code and name");
		code = sc.next();
		name = sc.next();
		
		  
				if(code.equals("COOLCOOL"))
					     {
						  System.out.println("Welcome User");
					      break; 
					     }
					  i++; 
					  } while(i<=3);
					  if( i==4)
						  System.out.println("go back");
					  
					  }
	
	

	public static void main(String[] args) {
		CodeCheck  c = new CodeCheck();
		c.codecheck();
		

	}

}
