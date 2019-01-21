import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  if (args.length == 0 ) {
		  System.out.println("Specify value in array. Repeat execution again");
	  } else {

		  int[] elements = new int[args.length];
	
	      System.out.println("Array: " + Arrays.toString(args));
	
	      for ( int i = 0; i<args.length; i++) {
	        elements[i] =Integer.valueOf(args[i]);
	      }

	
	    //Lesson2 Task 2.2
	    System.out.println("Sum of elements in Array: " + CountSumOfElementsInArray(elements));
	
	    //Lesson2 Task2.3 
	    if (SearchForBigValuesinArray(elements) > 0) {
		  System.out.println("There are big values in Array");
	    } else {
		  System.out.println("There are only small values in Array");
	    }

	    //Lesson2 Task3.1 and Task3.2
	    System.out.println("The greatest value in Array: " + SearchForTheGreatestValuesinArray(elements));
	  }
	}
	
	public static int CountSumOfElementsInArray(int elements[]) {
		int sum = 0;
		for ( int i = 0; i<elements.length; i++) {
			sum += elements[i];
		}
		return sum;	
	}
	
	public static int SearchForBigValuesinArray(int elements[]) {
		int k = 0;
		for (int element : elements) {
			if ( (element >= 1000) && (element != 100500)) {
				k +=1;
			} 
		}
		return k;
	}
	
	public static int SearchForTheGreatestValuesinArray(int elements[]) {
		int maxValue = Integer.MIN_VALUE;
		for ( int i = 0; i<elements.length; i++) {
			if (elements[i] != 100500) {
				   if (maxValue < elements[i]) {
						maxValue = elements[i];			   
				   }
				} else {
					continue;
				}
		}
			
		return maxValue;
	}

}
