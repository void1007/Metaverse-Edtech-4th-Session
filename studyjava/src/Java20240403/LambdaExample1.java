package Java20240403;
interface Intcalculator{
    int calculator(int a, int b);
}
public class LambdaExample1 {
    public static void main(String[] args) {
        // calculate 함수의 정의 =  두개의 매개변수의 덧셈
        Intcalculator adder = (a, b) -> a + b;
        int result = adder.calculator(5, 6);
        System.out.println(result);

        Intcalculator multiplication = (a , b) -> a * b;
        int result2 = multiplication.calculator(5,6);
        System.out.println(result2);

        printResult(5,6,(x,y) -> x * y);
        printResult(4,6,(x,y) -> x * y);
    }
    public static void printResult(int x,int y,Intcalculator calculator) {
        System.out.println("Result : " + calculator.calculator(x,y));
    }
}
