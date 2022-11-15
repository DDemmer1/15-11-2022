package de.demmer.dennis;

public class Application {
	
	
	public static void main(String[] args) {
		//Alt + Shift + R
//		checkEvenWhile(5);
//		checkEvenFor(1000);
		
		//   0   1   2   3   4
		// | 5 | 4 | 7 | 1 | 9 |
		
		int[] intArray = {5 , 4 , 7 , 1 , 9};
		System.out.println(intArray[2]);
		
		
		int[] intArray2 = new int[5];
		System.out.println(intArray2[2]);
		
		
		
		for(int i = 0; i < intArray.length ; i++) {
			System.out.print(intArray[i]);
		}
		
		
		
		
		
	}

	
	
	static void checkEvenWhile(int length) {
		
		int counter = 0;
		while(counter <= length) {
				
			if(counter % 2 == 0) {
				System.out.println(counter);
			}
			
			counter = counter + 1;
		}
	}
	
	
	
	
	static void checkEvenFor(int length) {

		// | Zählervariable       |   Laufzeitbedingung    |      Veränderung des Counters |
		for(int counter = 0       ;   counter <= length    ;      counter = counter + 1    ) {
			
			if(counter % 2 == 0) {
				System.out.println(counter);
			}
			
		}
	}
	

}
