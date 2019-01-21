public class Task2 {
    private static void workWithIntValues(int x, int y){
        if(x>100 || y>100) System.out.println("Есть большое число");
        if(y!=0) System.out.println("Результат деления: "+((double)(x))/((double)(y)));
        if(x>y) System.out.println(x+" больше "+y);
        if(y%2==0) System.out.println("число "+y+" четное");
    }
    public static void main (String[] args)
    {
        workWithIntValues(2,101);
        workWithIntValues(200,10);

        int[] massive1={1,2,1001,100500,5000,6,100500,8,9,10};
        int sum=0;
        int max_value=massive1[0];
        for(int i : massive1)
        {
            sum=sum+i;
        }
        System.out.println("Сумма: "+sum);

        for(int i : massive1)
        {
            if(massive1[i]>1000)
            {
                System.out.println("Массив массивный!");
                break;
            }
        }

        for(int i=0; i<massive1.length-1; i++)
        {
            if(massive1[i]!=100500) {

                if (massive1[i] > max_value) {
                    max_value = massive1[i];
                }
            }
        }
        System.out.println("Максимальное значение в массиве: "+ max_value);

    }
}
