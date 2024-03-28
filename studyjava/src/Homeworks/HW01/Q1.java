package Homeworks.HW01;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // 변수 num을 유저로부터 입력받아서 양수, 음수, 0 을 구별하는 코드를
        // 작성하시오. 단, if조건문이 아닌 삼항연산자를 사용해야함.
        /* 결과 예시
            입력값이 10이면 "양수" 출력
            입력값이 0이면 "0" 출력
            입력값이 -10이면 "음수" 출력 * */
        Scanner sc = new Scanner(System.in); //Scanner 객체 생성
        int num = sc.nextInt(); //사용자로부터 정수 입력 받음
        String result = (num > 0) ? "양수" : (num < 0) ? "음수" : "0"; // 삼항 연산자를 사용하여 양수, 음수, 0을 구별하여 result 변수에 저장
        System.out.println(result); //결과 출력
    }
}
