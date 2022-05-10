package Solutions;
import java.util.*;
public class EvenorOdd {
	    public static void main(String[] args)
	    {
	        // Declaring and initializing integer variable
	        // to be checked
	        int n = 167;
	 
	        // Condition check
	        // if n|1 if greater than n then this number is even
	        if ((n | 1) > n) {
	 
	            // Print statement
	            System.out.println("Number is Even");
	        }
	        else {
	 
	            // Print statement
	            System.out.println("Number is Odd");
	        }
	    }
}