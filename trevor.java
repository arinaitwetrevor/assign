package coursework;

	import java.util.Scanner;

	public class Assignment
	{
	    public static void main(String args[])
	    {
	    	/* This program assumes that the student has 9 course units,
	    	 * thats why I have created the array of size 9. You can
	    	 */
	        int marks[] = new int[9];
	        int n;
	        float total=0, avg;
	        Scanner scanner = new Scanner(System.in);
	
	        for(i=0; i<9; i++) { 
	           System.out.print("Enter Marks of course unit"+(i+1)+":");
	           marks[n] = scanner.nextInt();
	           total = total + marks[n];
	        }
	        scanner.close();
	        //Calculating average here
	        avg = total/9;
	        System.out.print("Your Grade is: ");
	        if(avg>=95)
	        {
	            System.out.print("A+");
	        }
	        else if(avg>=70 && avg<95)
	        {
	           System.out.print("A");
	        } 
	        else if(avg>=55 && avg<70)
	        {
	            System.out.print("B+");
	        }
	        else
	        {
	            System.out.print("B");
	        }
	    }
	}


