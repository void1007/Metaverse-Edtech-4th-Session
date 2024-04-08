package Homeworks.HW02;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q3 {
    public static void main(String[] args) {
        //사용자로부터 입력을 받기 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        //중복을 제외한 문자열을 저장할 HashSet생성
        Set<String> stringSet = new HashSet<>();

        System.out.println("문자열 5개를 입력하세요 : ");

        //5번의 반복을 통해 사용자로부터 문자열을 입력 받음
        for (int i =0; i < 5; i++){
            String  input = scanner.nextLine();

            if (!stringSet.contains(input)) {
                stringSet.add(input);
            }else {
                System.out.println("이미 입력한 문자열입니다. 다른 문자열을 입력하세요");
                i--; //중복 입력이므로 다시 입력할 수 있도록 반복 횟수를 줄임
            }
        }

        System.out.println("저장된 문자열들 : ");

        for (String str : stringSet){
            System.out.println(str);
        }
        // 사용자로부터 문자열 5개를 입력받아 컬렉션 구현체에 저장하고
        // 저장된 문자열들을 화면에 출력하시오.
        // 단, 중복 문자열은 저장하지 말아야 함
        // 여기 코드 작성 !!
        scanner.close();
    }
}
