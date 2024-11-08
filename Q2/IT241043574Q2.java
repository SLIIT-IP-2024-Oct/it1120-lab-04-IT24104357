import java.util.Scanner;
public class IT241043574Q2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double exam_marks, lab_marks,percentage_taken_from_the_exam_mark,percentage_taken_from_the_lab_mark,Total_mark;
		System.out.println("Enter the exam marks:");
		
		exam_marks=input.nextDouble();
		if((0 <= exam_marks) && (exam_marks <= 100))
		{
			System.out.print("Enter the lab marks:");
			lab_marks=input.nextDouble();
			if((0 <= lab_marks) && (lab_marks <= 100))
			{
				System.out.println("the percentage taken from the exam mark:");
				percentage_taken_from_the_exam_mark=input.nextDouble();
				System.out.println("the percentage taken from the lab mark:");
				percentage_taken_from_the_lab_mark=input.nextDouble();
				if((percentage_taken_from_the_exam_mark+percentage_taken_from_the_lab_mark)==100)
				{
				Total_mark=((exam_marks*(percentage_taken_from_the_exam_mark/100.0))+(lab_marks*(percentage_taken_from_the_lab_mark/100.0)));
				System.out.print("Total marks:"+Total_mark);
				}
				else
				{
					System.out.print("Invalid percentage");
				}

					
			}
			else
			{
				System.out.print("Invalid marks");
			}
		}
		else  
		{
			System.out.print("Invalid marks");
		}
		
		
	}
}