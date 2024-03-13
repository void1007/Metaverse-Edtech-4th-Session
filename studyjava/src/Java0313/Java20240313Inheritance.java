package Java0313;
//
//        // 클래스의 상속 관계
//        class A {}
//        class B extends A{}
//        class C extends B{}
//        class D extends B{}
//public class Java20240313Inheritance {
//    public static void main(String[] args) {
//        // 업캐스팅 (자동 변환): 캐스팅 구문을 생략했을 때 컴파일러가 자동으로 추가
//        A ac = (A) new C(); //--> 업캐스팅 (자동 변환)
//        B bc = (B) new B(); //--> C -> B 업캐스팅(자동 변환)
//
//        B bb = new B();
//        A a = (A) bb; //--> B -> A 업캐스팅 (자동 변환)
//
//        //다운 캐스팅(수동변환): 캐스팅할 수 없을 때(실행할 때 예외 발생)
//        A aa = new A();
////        B b = (B) aa; // A -> B 다운캐스팅(수동변환) : 불가능
////        C c = (C) aa; // A -> C 다운캐스팅(수동변환) : 불가능
//
//        //다운 캐스팅(수동변환): 캐스팅이 가능할 때
//        A ab = new B();
//        // 10000라인의 코드가 있음
//        // 아래에서 ab 변수를 B 또는 C 타입으로 캐스팅이 필요할 경우!!!
//        if (ab instanceof B){
//            B b = (B)ab;
//        } else if (ab instanceof C) {
//            C c = (C)ab; // A -> C 다운캐스팅 (수동 변환) : 불가능
//        } else {
//            System.out.println("둘 다 아님 ...ㅈ망!!");
//        }
//
//        B b = (B) ab; // A -> B 다운캐스팅(수동변환)
////        C c = (C) ab; // A -> C 다운캐스팅(수동변환) : 불가능
//
//        B bd = new D();
//        D d = (D) bd; // B -> D 다운캐스팅(수동 변환)
//
//        A ad = new D();
//        B b1 = (B) ad; // A -> B 다운캐스팅(수동 변환)
//        D d1 = (D) ad; // A -> D 다운캐스팅(수동 변환)
//    }
//}

//class  A{}
//class  B extends A{}
//
//public class Java20240313Inheritance {
//    public static void main(String[] args) {
//        //instanceOf
//        A aa = new A();
//        B ab = new B();
//
//        System.out.println(aa instanceof A);
//        System.out.println(ab instanceof A);
//
//        System.out.println(aa instanceof B);
//        System.out.println(ab instanceof B);
//
//        if (aa instanceof B) {
//            B b = (B) aa;
//            System.out.println("aa를 B로 캐스팅했습니다.");
//        } else {
//            System.out.println("aa는 B 타입으로 캐스팅이 불가능!!!!");
//        }
//
//        if (ab instanceof B){
//            B b = (B) ab;
//            System.out.println("ab를 B로 캐스팅했습니다.");
//        }else {
//            System.out.println("ab는 B타입으로 캐스팅이 불가능!!!!");
//        }
//
//        if ("안녕" instanceof String){
//            System.out.println("\"안녕\"은 String 클래스입니다.");
//        }
//    }
//}

//class A{
//    int m = 3;
//    void abc() {
//        System.out.println("A 클래스");
//    }
//}
//class B extends A{
//    int n = 4;
//    void bcd() {
//        System.out.println("B 클래스");
//    }
//}
//
//public class Java20240313Inheritance {
//    public static void main(String[] args) {
//        //A타입 / A 생성자
//        A aa = new A();
//        System.out.println(aa.m);
//        aa.abc();
//
//        //B타입 / B 생성자
//        B bb = new B();
//        System.out.println(bb.m);
//        System.out.println(bb.n);
//        bb.abc();
//        bb.bcd();
//
//        //A타입 / B 생성자 : 다형적 표현
//        A ab = new B();
//        System.out.println(ab.m);
//        ab.abc();
//    }
//}

//class A{
//    void print() {
//        System.out.println("A클래스");
//    }
//}
//class B extends A{
//    @Override
//    void print() {
//        System.out.println("B클래스");
//    }
//}
//public class Java20240313Inheritance {
//    public static void main(String[] args) {
//        //A타입 / A 생성자
//        A aa = new A();
//        aa.print();
//
//        //B타입 / B 생성자
//        B bb = new B();
//        bb.print();
//
//        //A타입 / B 생성자
//        A ab = new B();
//        ab.print();
//    }
//}



//class Animal{
//    void cry(){
//
//    }
//}
//
//class bird extends Animal {
//    @Override
//        // @--> 어노테이션 Anotation
//    void cry() {
//        System.out.println("짹짹");
//    }
//}
//    class Cat extends Animal {
//        @Override
//            // @--> 어노테이션 Anotation
//        void cry() {
//            System.out.println("야옹");
//        }
//    }
//        class dog extends Animal {
//            @Override
//                // @--> 어노테이션 Anotation
//            void cry() {
//                System.out.println("멍멍");
//            }
//        }
//         public class Java20240313Inheritance {
//             public static void main(String[] args) {
//                 // 각각의 타입으로 선언 + 각각의 타입으로 생성
//                 Animal aa = new Animal();
//                 bird bb = new bird();
//                 Cat cc = new Cat();
//                 dog dd = new dog();
//                 aa.cry();
//                 bb.cry();
//                 cc.cry();
//                 dd.cry();
//                 System.out.println();
//
//                 //각각의 타입으로 선언 + 각각의 타입으로 생성
//                 Animal ab = new bird();
//                 Animal ac = new Cat();
//                 Animal ad = new dog();
//                 ab.cry();
//                 ac.cry();
//                 ad.cry();
//                 System.out.println();
//
//                 //배열로 관리
//                 Animal[] animals = {ab,ac,ad};
//                 for(Animal animal: animals) {
//                     animal.cry();
//                 }
//             }
//}

//class A {
//    void print1() {
//        System.out.println("A클래스 print1");
//    }
//    void print2() {
//        System.out.println("A클래스 print2");
//    }
//}
//
//class B extends A{
//    @Override
//    void print1(){
//        System.out.println("B 클래스 print1");
//    }
//    void print2(){
//        System.out.println("B 클래스 print1");
//    }
//}
//
//public class Java20240313Inheritance {
//    public static void main(String[] args) {
//        // A타입 선언 / A 생성자 사용
//        A aa = new A();
//        aa.print1();
//        aa.print2();
//        System.out.println();
//
//        //B타입 선언 / B 생성자 사용
//        B bb = new B();
//        bb.print1();
//        bb.print2();
//        System.out.println();
//    }
//}


import java.util.Arrays;

public class Java20240313Inheritance {
    public static void main(String[] args) {
        // 아래 배열중에 짝수만 출력
//        int [] arr = new int [] {1, 2, 3, 4, 5};
//        int i=0;
//        for (i = 0;i< arr.length;i++){
//            if (arr[i]%2==0){
//                System.out.println(" " + arr[i]);
//            }
//        }

        // 아래 문자열의 글자수를 카운트
        // 스페이스는 카운트하지 마시오
        String string = "The best of both worlds";
        int count = 0;
        for (int k=0;k<string.length(); k++){
            if (string.charAt(k) !=' ' ){
                count++;
            }
        }
        System.out.println("글자 수 : "+count);


        //3
        int [] arr = new int [] {1, 2, 3, 4, 5}; // --> 배열 arr 선언 및 입력

        int n = 3; //변수 n의 입력

        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for(int i = 0; i < n; i++){
            int j, last;

            last = arr.length;  // 포인트 1
            for(j = 0; j < arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[j] = last;  // 포인트 2
        }
        System.out.println();

        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    }
