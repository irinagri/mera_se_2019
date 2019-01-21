public class Operatore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstValue = Integer.valueOf(args[0]);
		int secondValue = Integer.valueOf(args[1]);
		
		System.out.println("First value = " + firstValue + " Second value = " + secondValue);
		
		//Lesson2 Task 2.2a
		if ( firstValue > 100 || secondValue > 100) {
			System.out.println("There is big value");
		} else {
			System.out.println("There are only small values");
		}
		
		//Lesson2 Task 2b and 2d
		if (secondValue != 0) {
			float c = ((float)firstValue)/secondValue;
			System.out.println("Devision firstValue / secondValue =" + c);
			
			int k =  secondValue % 2; 
			if ( k != 0) {
				System.out.println("Second value = " + secondValue + " and it's odd number");
			} else {
				System.out.println("Second value = " + secondValue + " and it's even number");
			}
		} else {
			System.out.println("You can't devide to 0");
		}
		
		//Lesson2 Task 2c
		if ( firstValue > secondValue) {
			System.out.println("firstValue " + firstValue +  " more then secondValue " + secondValue);
		} else {
			System.out.println("secondValue " + secondValue +  " more then firstValue " + firstValue);
		}
		
	}

}
