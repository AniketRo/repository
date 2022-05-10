package Assignment;
import java.util.ArrayList;
public class ListtoArray {


	

	

		public static void main(String[] args) {
			ArrayList languages = new ArrayList<>();
			
			languages.add("Java");
			languages.add("Python");
			languages.add("selenium");
			System.out.println("ArrayList: " +languages);
			
			String[] arr =new String[languages.size()];
			
			languages.toArray(arr);
			System.out.println("Array: ");
			for(String item:arr) {
				System.out.println(item+", ");
			}

		}

	}

