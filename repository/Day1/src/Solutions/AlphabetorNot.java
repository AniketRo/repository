package Solutions;
import java.util.Scanner;
public class AlphabetorNot {
	
	
	   public static void main(String args[]){
	      System.out.println("Enter a character :: ");
	      Scanner sc = new Scanner(System.in);
	      char ch = sc.next().charAt(0);

	      if(((ch >= 'A' && ch <= 'Z')||ch >= 'a' && ch <= 'z') ){
	         System.out.println("Given character is an alphabet");
	      }else{
	         System.out.println("Given character is not an alphabet");
	      }
	   }
	}


