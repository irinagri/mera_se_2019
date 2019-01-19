public class Task2 {
    public static void main(String[] args) {

        // Задание 1
        int num1 = 800;
        int num2 = 15;
        if ((num1 > 100) || (num2 > 100)) {
            System.out.println("Есть большое число.");
        }
        if (num2 != 0) {
            double div = (double) num1 / (double) num2;
            System.out.println("Результат деления: " + div);
        }
        if (num1 > num2) {
            System.out.println(num1 + " больше" + num2);
        }
        if ((num2 % 2) == 0) {
            System.out.println("Число " + num2 + " - четное.");
        }
   
        // Задание 2
        int[] mass = {10,20,30,40,100500,60,70,80,90,1099};
        int sum = 0;
        for (int i : mass) {
            sum += i;
        }
        System.out.println("Сумма всех элементов массива: " + sum);
        for (i = 0; i < mass.length; i++) {
            if (mass[i] > 1000) {
                System.out.println("Массив - массивный!");
                break;
            }
        }

        // Задание 3
        int max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            max = max > mass[i] ? max : mass[i]; 
            return max;
        }
        // Я ещё не придумала, как игнорировать число 100500 :-\
        //if (max = 100500) {
            System.out.println("Максимальный элемент массива: " + max); 
        //}
    }
}
