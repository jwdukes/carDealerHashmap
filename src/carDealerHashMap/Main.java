package carDealerHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		HashMap<String, String> car = new HashMap<>();
		car.put( "Fit","Honda");
		car.put("Corvette", "Chevrolet");
		car.put("Escape", "Ford");
		car.put("X5", "BMW");
		
		System.out.println("What kind of car are you looking for?");
		String customerCar = userInput.nextLine();
		
		
			if (car.containsKey(customerCar) == true)
			{
				System.out.println("We have just what you're looking for.");
			}
			else {
				System.out.println("Check with us next week, maybe we can find that vehicle for you.");				
			}
		
		System.out.println("Please choose 5 numbers");
		
		ArrayList<Integer> numberList = new ArrayList<Integer>(5);
			int product = 1;
			for(int i=0; i<5; i++) {
				System.out.println("i is " + i);
				int number = userInput.nextInt();
				numberList.add(number);
			}
			for(int i=0; i<numberList.size(); i++) {
				System.out.println(numberList.get(i));
				product = product*numberList.get(i);
				System.out.println(product);
				
			}
			
			System.out.println(numberList);
			
			
		userInput.close();		
	}

}
