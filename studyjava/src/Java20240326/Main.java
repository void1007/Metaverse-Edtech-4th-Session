package Java20240326;

public class Main {
    public static void main(String[] args){
        ChildA a = new ChildA();
        a.abc();
        a.bcd();
        // A.a = 10; // 오류 A.a는 상수임(static이자 final임)
        System.out.println(A.a);
        System.out.println(B.a);

        A a2 = new A(){  // 중괄호의 의미 : 컴파일러가 안에 있는 내용을 새로운 이름없는
                        // 객체를 만들어두고 해당 위치에 복사?
             @Override public void abc(){
                 System.out.println("나는 익명 이너클래스");
                 // 익명은 재사용할 수 없음
                 // 클래스 선언이 다른 클래스 안에 있으면 이너클래스
                 // → 그렇기에 익명 이너클래스(시험문제에는 안내신다고 함)
             }
        };
        a2.abc();

        // <인터페이스 생성 방법 1>
        // 자식클래스(Child)를 선언하고 해당 인터페이스를 상속하게 하면
        // 아래와 같이 동일한 코드 내용(메서드 오버라이딩 내용)을 계속해서 사용할 수 있음
        ChildA c2 = new ChildA();
        ChildA c3 = new ChildA();
        ChildA c4 = new ChildA();

        // <인터페이스 생성 방법 2>
        // 어래와 같이 익명 이너 클래스 방식으로 생성하면,
        // 방법 1에서와 같이 재사용할 수 있는 클래스 이름이 없으므로
        // 동일한 코드 내용(=메서드 오버라이딩 내용)을 매번 복사 붙여넣기 해줘야 함
        A a3 = new A(){
            public void abc(){
                System.out.println("나는 익명 이너클래스");}
        };
        A a4 = new A(){
            public void abc(){
                System.out.println("나는 익명 이너클래스");}
        };
        // 디폴트 메서드 : 디폴트와는 관계없이 인터페이스에 새로운 메서드를 넣기위해 만드는
        // 완성형 메서드(추상형이 아니기에 오버라이딩 할 필요 없음)
        
        // 이미 완성이 된 코드에서 부모 인터페이스 코드를 수정하기 위한 메서드
        // → 스태틱 메서드


    }
}