package Homeworks.HW02;

import java.sql.Array;

public class Q1 {
    public static void main(String[] args) {
        // String 문자열의 소문자는 대문자로, 대문자는 소문자로 변경시킨
        // String 문자열을 리턴하는 메서드(changeCase)를 완성하시오
        String str = "cHanGe CasE";
        String result = changeCase(str);
        System.out.println(result); // ChANgE cASe
    }

    public static String changeCase(String str) {
        // 여기 코드 작성 !!

        //StringBuilder를 사용하여 문자열을 변경할 수 있도록 함
        StringBuilder result = new StringBuilder();

        // 문자열의 각 문자를 순회하면서 대소문자를 변환하여 result에 추가
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)){
                result.append(Character.toLowerCase(ch));
            }else if (Character.isLowerCase(ch)){
                result.append(Character.toUpperCase(ch));
            }
        }
        return result.toString();
    }
}
