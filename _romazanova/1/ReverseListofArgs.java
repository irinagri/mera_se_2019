package _romazanova.1;

public class ReverseListofArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Аргументы командной строки ");
		for (int i = args.length-1; i >=0; i--) {
			System.out.print( args [i] + " ");
		}
	}

}
