import java.util.Scanner;

public class TableOfPowers {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scnr = new Scanner(System.in);
       String yourChoice = "";
       do
       {
    	   
       System.out.println("Enter a Number :");
       int userResponse = scnr.nextInt() ;
       
       System.out.println("Table Of Powers:");
       
       System.out.printf("%10s | %12s | %14s\n", "Number", "Squared","Cubed");
       System.out.printf("%10s | %12s | %14s\n", "------", "-------","-----");
       
       for(int i=1;i<=userResponse;i++)
       {   
    	   System.out.printf("%10s | %12s | %14s\n", i , i*i , i*i*i);
    	   //System.out.println();
       }
       
       System.out.println("\n" + "Multiplication Tables:");
       System.out.printf("%5s", "");
       for(int i=1;i<=userResponse;i++)
       {   
    	   
    	   System.out.printf("%5s", i);
    	          }
       System.out.println();
       System.out.printf("%5s", "");
       for(int i=1;i<=userResponse;i++)
       {   
    	   
    	   System.out.printf("%5s", "--");
    	          }
       
       
       System.out.println();

    
       for(int i=1;i<=userResponse;i++)
       {   
    	   System.out.printf("%5s",i);
    	   for(int j=1;j<=userResponse;j++) {
    		   System.out.printf("%5s",i*j);
    	   }
    	   System.out.println();
    	   //System.out.println();
       }
       
       System.out.println("Would you like to continue(y/n) :");
       yourChoice = scnr.next();
       }while(yourChoice.equals("y"));
	  System.out.println("GoodBye!");
	}
}
