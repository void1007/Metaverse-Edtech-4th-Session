import java.util.Arrays;
import java.util.Random;

public class Java20240307test {
    public static void main(String[] args) {
    //난수생성법,Random 숫자 만드는 법
//        Random rd = new Random();
//        int randNum = rd.nextInt(45); //0 부터 입력한 정수값-1 범위에서 랜덤
//        System.out.println(randNum);

        //9. 1~45까지의 랜덤한 정수를 length가 6인 배열에 넣으시오
        //단, 중복 숫자는 허용하지 않음!!

        Random randClass = new Random();
        int[] rottoList = new int[6];
        for(int k=0; k<rottoList.length; k++){
            int temp = randClass.nextInt(45)+1;
            for (int i=0; i<k;i++){
                if (rottoList[k] == temp){
                    temp = randClass.nextInt(45)+1;
                    i = -1;
                }
            }
            rottoList[k] = temp;
        }
        System.out.println(Arrays.toString(rottoList));
    }
}
