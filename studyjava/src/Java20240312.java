import java.util.Arrays;

public class Java20240312 {
    public static void main(String[] args) {
        //아래 배열의 모든 값들을 다른 배열에 복사하기
        int[] intarray1 = {1,2,3,4,5};
        int[] intarray2 = new int[intarray1.length];
        for(int i=0;i<intarray1.length;i++){
            intarray2[i] = intarray1[i];
        }
        System.out.println(Arrays.toString(intarray1));
        System.out.println(Arrays.toString(intarray2));
    }
}
