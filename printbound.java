package printsquare;
import java.util.Scanner;
//this program creates a symbol pattern of boundary of a square of the length that user decides;
//an example can be as a square pattern of length 5 and symbol as #
/*
   #####
   #   #
   #   #
   #   #
   #####
*/

//creating the main class
public class printbound {
	
	public static void main(String[] arg) {
		
		Scanner scan = new Scanner(System.in);
		
		//taking length size input by user
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		
		//taking symbol type input by user
		System.out.println("Enter a symbol: ");
		char symb = scan.next().charAt(0);
		
		//printing the pattern
		for(int i = num; i>0; i-- )
		{
			for(int j = num; j>0; j--)
			{
				if(i==num|i==1) 
					System.out.print(symb+" ");
				else
				{
					if(j==num|j==1)
						System.out.print(symb+" ");
					else
					System.out.print("  ");
					
				}
				
			}
			System.out.println();
		}
		scan.close();
	}
}