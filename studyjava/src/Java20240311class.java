    import java.util.Arrays;
public class Java20240311class {
 static int a = 1;
 static int b = 2;

    public static void main(String[] args) {
        System.out.println(plusNums());
        System.out.println(plusNums(4, 5));
        int[] intArray = {1,2,3,4,5};
        System.out.println(plusNums(intArray, intArray.length));
        System.out.println(plusNums(1,2,3,4,5,6));
    }

    public static int plusNums(){
        return a+b;
    }

    public static int plusNums(int x, int y){
        return x+y;
    }

    public static int plusNums(int[] intArray,int length){
        int sum = 0;
        for (int i = 0; i<intArray.length; i++){
            sum = sum+intArray[i];
        }
        return sum;
    }

//    public static int plusNums(int a, int b, int c, int d, int e, int f){
//        return a+b+c+d+e+f;
//    }
    public  static int plusNums(int...values){
        int sum = 0;
        for (int i=0; i<values.length; i++){
            sum = sum + values[i];
        }
        return sum;
    }
}
