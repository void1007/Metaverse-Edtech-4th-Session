import java.util.Arrays;

public class Java20240305Doit {
    public static void main(String[] args) {
        //문자열 길이
//        String str1 = "Hello Java!";
//        String str2 = "안녕하세요! 반갑습니다.";
//        System.out.println(str1.length());
//        System.out.println(str2.length());
//        System.out.println();

//        //문자열 검색
//        // @charAt()
//        System.out.println(str1.charAt(1));
//        System.out.println(str2.charAt(1));
//        System.out.println();

        //@indexOf(), lastIndex()
//        System.out.println(str1.indexOf('a'));
//        System.out.println(str1.lastIndexOf('a'));
//        System.out.println(str1.indexOf('a',8));
//        System.out.println(str1.lastIndexOf('a',8));
//        System.out.println(str1.indexOf("Java"));
//        System.out.println(str1.lastIndexOf("Java"));
//        System.out.println(str2.indexOf("하세요"));
//        System.out.println(str1.lastIndexOf("하세요"));
//        System.out.println(str1.indexOf("Bye"));
//        System.out.println(str2.lastIndexOf("고맙습니다."));
//        System.out.println();

        //문자열 변환 및 연결
//        @String.valueOf(기본 자료형): 기본 자료형 --> 문자열 변환
//        String str3 = String.valueOf(2.3);
//        String str4 = String.valueOf(false);
//        System.out.println(str3);
//        System.out.println(str4);
//
//        //@contact(): 문자열 연결
//        String str5 = str3.concat(str4);
//        System.out.println(str5);

        //문자열을 byte[] 또는 char[]로 변환
//        String str6 = "안녕" + 3;
//        String str7 = "안녕".concat(String.valueOf(3));
//
//        //문자열을 byte[] 또는 char[]로 변환
//        String str8 = "Hello Java!";
//        String str9 = "안녕하세요";
//
//        //@getBytes(): 문자열 --> byte[] 변환
//        byte[] array1 = str8.getBytes();
//        byte[] array2 = str9.getBytes();
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//
//        //toCharArray(): 문자열 --> char[] 변환
//        char[] array3 = str8.toCharArray();
//        char[] array4 = str9.toCharArray();
//        System.out.println(Arrays.toString(array3));
//        System.out.println(Arrays.toString(array4));

        //문자열 수정
        //@toLowerCase(), toUpperCase()
        String str1 = "Java Study";
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());

        //@replace()
        System.out.println(str1.replace("Study","공부"));

        //@substring()
        System.out.println(str1.substring(0,5));

        //@split()
        String[] strArray = "abc/def-ghi jkl".split("/|-|");
        System.out.println(Arrays.toString(strArray));

        //@trim()
        System.out.println("abc".trim());

        //문자열의 내용 비교
        String str2 = new String("Java");
        String str3 = new String("Java");
        String str4 = new String("java");

        //@stack 메모리 비교(==): 위치(번지) 비교
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);
        System.out.println(str4 == str2);

        //@equals(), equalsIgnoreCase(): 내용 비교
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str4));
    }
}
