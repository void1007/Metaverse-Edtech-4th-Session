import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Java20240307 {
    public static void main(String[] args) {
//        String[] members = {"Steve","Tom","Micheal","Laura","Jessica","Annie"};
//        Scanner sc = new Scanner(System.in);
//        System.out.print("이름을 입력하세요: ");
//        String inputStr = sc.nextLine().toLowerCase();
//        boolean found = false;
//        int k = 0;
//        for (; k < members.length; k++){
//            if (members[k].equalsIgnoreCase(inputStr.toLowerCase())){
//                System.out.println(members[k]+"님 환영합니다.");
//                break;
//            }
//        }
//        if (k == members.length){
//            System.out.println("회원가입해주세요");
//        }

        //6. 아래 배열에서 입력받은 값보다 큰 수만 출력하시오
//        int [] intList = {1,2,3,4,5,6,7,8,9,10};
//        Scanner scan = new Scanner(System.in);
//        System.out.print("0~10까지 숫자를 입력해주세요 : ");
//        int num = scan.nextInt();
//        for (int k=0; k<intList.length; k++){
//                if (intList[k] > num){
//                    System.out.print(intList[k]+  " ");
//                }
//        }

        //7. 새로운 배열에 담기
//        int [] intList2 = new int[intList.length];
//        int count = 0;
//        for (int k=0; k<intList.length; k++){
//            if (intList[k] > num){
//                intList2[count] = intList[k];
//                count = count + 1;
//            }
//        }
//        System.out.println(Arrays.toString(intList2));

        //새로운 배열에 담기 : ArrayList 사용하기
//        ArrayList<Integer> intList3 = new ArrayList<Integer>();
//        for (int k=0; k<intList.length; k++){
//            if (intList[k] >num){
//                intList3.add(intList[k]);
//            }
//        }
//        System.out.print(intList3.toString());

        //8. 아래 배열의 총합과 평균을 구하시오
//        int[] numberList = {12 , 34 ,56, 32 , 84 , 99 , 73, 69};
//        //방법1
//        int sum = 0;
//        for (int i =0; i<numberList.length; i++){
//            sum = sum + numberList[i];
//        }
//        int average= sum/numberList.length;
//        System.out.println(sum + " " + average);

        //방법2
//        //총합 구하기
//        int sum = 0;
//        for (int num : numberList ){
//            sum += num;
//        }
//        //평균 구하기
//        double average = (double) sum/numberList.length;
//        System.out.println("총합: " +sum);
//        System.out.println("평균: " +average);

        //9. 사용자로부터 문자열을 입력받아서 입력받은 문자열을 거꾸로 출력

        //방법1

        // ex) hello 를 입력하면 olleh 로 입력

//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//
//        // 입력된 문자열을 거꾸로 출력
//        for (int i= input.length()-1; i>=0; i--){
//            System.out.print(input.charAt(i));
//        }
//        Scanner sc1 = new Scanner(System.in);
//        System.out.print("문자열을 입력해주세요 : ");
//        String inputStr = sc1.nextLine();
//
//        char[] charList1 = inputStr.toCharArray(); // 입력받은 문자열을 char 배열에 담음
//        char[] charList2 = new char[charList1.length]; //거꾸로 저장할 새로운 배열을 만듬
//        int index = charList2.length -1; // 새로운 배열의 위치를 나타내는 변수
//        for( int i=0; i<charList1.length; i++){
//            charList2[index] = charList1[i];
//            index = index-1;
//        }
//        // 배열형태로 출력
//        System.out.println(Arrays.toString(charList2));
//        // 문자열을 출력하기 위해 반복문 사용
//        for (int i= 0; i<charList2.length; i++){
//            System.out.print(charList2[i]);
//        }
//        System.out.println();
    }
}
