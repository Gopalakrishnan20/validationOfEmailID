import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmailValidation {
	
	public static void checkDatabase(String em,String[] earr)
	{
		int flag=0;
		for(int i=0;i<earr.length;i++)
		{
			if(em.equals(earr[i]))
			{
				System.out.println("Hurray!");
				System.out.println("And Your Email ID Present in Database.");
				flag=1;
			}
		}
		while(flag==0)
		{
			System.out.println("Oops But Not Present in the Database.");
			break;
		}
	}
	public static void checkValidation(String email,String[] arr)
	{
		System.out.println(email);
		String regex="[a-zA-Z]{1,14}\\@[a-zA-Z]{1,10}\\.[a-z]{1,3}";
		//^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(email);
		if(m.find())
		{
			System.out.println("Your Mail ID: "+email+" is Valid.");
			checkDatabase(email,arr);
		}
		else
		{
			System.out.println("Enter the Valid Mail ID.");
		}
	}

	public static void main(String[] args) {
		final String[] empEmails= {"abc@gmail.com","xyz@company.com","wxyz@company.com","mno@company.com","uvw@company.com"};
		String ui;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Email ID:");
		ui=in.next();
		checkValidation(ui,empEmails);
		in.close();

	}

}
