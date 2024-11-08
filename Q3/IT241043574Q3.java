import java.util.Scanner;
public class IT241043574Q3
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number");
		double number;
		number=input.nextDouble();
		String message;
		message=(number>0) ? "Positive": (number<0) ? "Negative": "zero";
		System.out.println(message);
	}
}