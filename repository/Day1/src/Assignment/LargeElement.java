package Assignment;

public class LargeElement {



		public static void main(String[] args) {
			double[] numArray = {22.5, 24.5, 22.3, 26.2, 22.4};
			double largest = numArray[0];
			
			for(double num: numArray) {
				if(largest<num)
					largest =num;
			}
			System.out.format("largest element=%2f", largest);

		}

	}


