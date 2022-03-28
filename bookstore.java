/*Q 16 create a class bookstore havin  fields like bookname,qty and price.
define two methods input and display()
call both methods in main
 
Q 17 in same above question define another method chekprice that return integer value i.e dicounted amount if price>5000 dicount is 200 rs else 100* rs.
*/
package SelfEvaluation;
import java.util.Scanner;

public class bookstore {
	String bookname;
	int Quantity;
	int price;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the bookname,quantity and price");
		bookname = sc.next();
		Quantity = sc.nextInt();
		price = sc.nextInt();
		
	}
	void display()
	{
		System.out.println(bookname+" " +Quantity+ " " +price);
	}
	int checkprice()
	{
		if(price>5000)
			System.out.println("discount="+"200");
		else
			System.out.println("discount="+"100");
		return 0;
	}

	public static void main(String[] args) {
		bookstore b = new bookstore();
		b.input();
		b.display();
		b.checkprice();

	}

}
