package additionalTask;

public class Calculator {

    public static int sum (int a, int b){
        return a + b;
    }

    public static int sub (int a, int b){
        return a - b;
    }

    public static int mul (int a, int b){
        return a * b;
    }

    public static int div (int a, int b){

        try {
            return a / b;
        } catch (Exception e) {
            System.out.println("Заборонено ділити на 0");
        }

        return -1;
    }

}
