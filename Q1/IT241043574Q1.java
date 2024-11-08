import java.util.Scanner;

public class IT241043574Q1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		float number;
		System.out.println("Enter a number:");
		number = input.nextFloat();
		if (number>0)
		{
			System.out.println("positive");
		}
		else if(number<0)
		{
			System.out.println("negative");
		}
		else if(number==0)
		{
			System.out.println("zero");
		}
	}
}