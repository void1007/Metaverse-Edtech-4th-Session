import java.util.Arrays;
import java.util.Scanner;

public class Java20240306String {
    public static void main(String[] args) {
        //문자열 수정
        //@toLowerCase(), toUpperCase()
//        String str1 = "Java Study";
//        System.out.println(str1.toLowerCase());
//        System.out.println(str1.toUpperCase());
//
//        //@replace()
//        System.out.println(str1.replace("Study" , "공부"));
//
//        //@substring()
//        System.out.println(str1.substring(0,5));
//
//        //@split()
//        //연산자를 이용하여 ':'와 '/'기준으로 분리시킴
//        // split 메소드의 리턴형은 String[] 문자열의 배열이다!!!
//        String[] strArray = "abc/edf-ghi jkl".split("/|-| ");
//        System.out.println(Arrays.toString(strArray));
//
//        //@trim() -->"앞뒤" 공백지우기 중간의 공백은 지워지지 않음
//        System.out.println("  abc def  ".trim());
//        System.out.println();
//
//        //@replaceAll모든공백지우기
//        System.out.println(str1.replaceAll(" ",""));
//
//        // 문자열의 내용 비교
//        String str2 = new String("Java");
//        String str3 = new String("Java");
//        String str4 = new String("java");
//
//        //@stack 메모리 비교(==): 위치(번지) 비교
//        System.out.println(str2==str3);
//        System.out.println(str3==str4);
//        System.out.println(str4==str2);
//
//        //@equals(), equalsIgnoreCase(): 내용 비교
//        System.out.println(str2.equals(str3));
//        System.out.println(str3.equals(str4));
//        System.out.println(str4.equalsIgnoreCase(str2));

//        int[] intList1 = new int[10];
//        for (int i =0; i < intList1.length; i++){
//            intList1[i] = i + 1;
//        }
//        for (int i = 0; i <intList1.length; i++){
//            System.out.println(intList1[i]);
//        }

//        int[] intList1 = new int[10];
//        for(int i=0; i<10; i++){
//            intList1[i] =1 + i;
//        }
//        System.out.println(Arrays.toString(intList1));
//
//        int[] intList2 = new int[10];
//        for( int i=10; i>0; i--){
//            intList2[10-i] = i;
//        }
//        System.out.println(Arrays.toString(intList2));

//        int[] intList2 = new int[10];
//        int len = intList2.length;
//        for (int i = 0; i<intList2.length; i++){
//            intList2[i] = len;
//            len = len-1;
//        }
//        System.out.println(Arrays.toString(intList2));

//        String[] fruitList = {"배","사과","바나나","딸기","사과","수박"};
//        int count = 0; //--> "사과"의 등장 횟수를 저장할 변수
//        //배열을 순회하면서 "사과"가 나오는 횟수를 센다
//        for (int i=0; i< fruitList.length; i++){
//            if (fruitList[i].equals("사과")){ //"사과"가 나오면 count를 증가시킨다.
//                count = count + 1;
//            }
//        }
//        System.out.println("사과의 갯수: " + count);

        //자바에서 입력값을 받는 방법
//        Scanner sc = new Scanner(System.in);
//        System.out.print("0~6까지 숫자를 입력해주세요 : ");
//        int inputNumber = sc.nextInt();
//        if (inputNumber >=0 && inputNumber <=6){
//            System.out.println(inputNumber);
//        }else {
//            System.out.println("잘못입력하셨습니다.");
//        }

        //자바에서 문자열을 입력 받는 방법
//        Scanner sc = new Scanner(System.in);
//        System.out.print("이름을 입력해주세요 : ");
//        String inputStr = sc.nextLine();
//        System.out.println(inputStr);

        //4.사용자로부터 0~6까지 숫자를 입력받아 아래 배열에 해당하는 요일을 출력
//        char[] week = {'월','화','수','목','금','토','일'};
//        Scanner scan = new Scanner(System.in);
//        System.out.print("0~6까지 숫자를 입력해주세요 : ");
//        int num = scan.nextInt();
//        for (int i=0; i<week.length; i++){
//
//        if (num >=0 && num<=6){
//            System.out.println(week[num]);
//            break;
//        }else {
//            System.out.println("잘못 입력하셨습니다.");
//        }
//        }

//
//        if (num>=0 && num <= 6){
//            char day = week[num];
//            System.out.println("해당하는 요일은 : "+day+"요일입니다.");
//        } else {
//            System.out.println("잘못된 입력입니다.");
//        }

        // 5. 사용자로부터 이름을 입력받아 아래 회원배열에 있는 이름이면
        //"입력된 이름"님 환영합니다 를 출력하고
        //없으면 "회원가입을 해주세요"를 출력 (단, 대소문자 구분하지 마시오)
        String[] members = {"Steve","Tom","Micheal","Laura","Jessica","Annie"};
                Scanner sc = new Scanner(System.in);
                System.out.print("이름을 입력하세요: ");
                String inputName = sc.nextLine().toLowerCase(); // 입력된 이름을 소문자로 변환

                boolean Members = false; // 회원인지 여부를 저장하는 변수

                // 입력된 이름과 배열의 각 이름을 비교하여 회원인지 확인
                for (String name : members) {
                    if (name.equalsIgnoreCase(inputName)) { // 대소문자를 구분하지 않고 비교
                        Members = true;
                        break; // 회원인 경우 반복문 종료
                    }
                }

                // 회원 여부에 따라 메시지 출력
                if (Members) {
                    System.out.println(inputName + "님 환영합니다.");
                } else {
                    System.out.println("회원가입을 해주세요.");
                }
    }
}
