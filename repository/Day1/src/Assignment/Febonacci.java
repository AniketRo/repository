package Assignment;

public class Febonacci {

	public static void main(String[] args) {
		int n=10, firstNumber=0, secondNumber=1;
		System.out.println("Fibonacci Series till " +n + "numbers :");
		
		for(int i=1; i<=n; ++i) {
			System.out.println(firstNumber + ", ");
			
			int nextNumber =firstNumber + secondNumber;
			firstNumber=secondNumber;
			secondNumber=nextNumber;
		}

	}

}

