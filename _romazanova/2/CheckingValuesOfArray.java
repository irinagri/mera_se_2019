package _romazanova.2;

public class CheckingValuesOfArray {

	public static void main(String[] args) {
		int [] massiveArray = new int[args.length];
		for (int i =0; i < args.length; i++){
			massiveArray[i] = Integer.parseInt(args[i]);
		}
		int sumOfValuesInArray =0;
		for (int i:massiveArray){
			sumOfValuesInArray +=i;
		}
		System.out.println("Cуммa всех элементов массива: " + sumOfValuesInArray);
		for (int i =0; i < massiveArray.length; i++){
			if (massiveArray[i] > 1000){
				System.out.println( "Массив - массивный!");
				break;
			}
			
		}
	}

}
