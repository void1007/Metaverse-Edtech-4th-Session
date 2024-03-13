class Human{
    String name;
    int age;
    void eat(){}
    void sleep(){}
}
class Students extends Human{ // -->Human 클래스 상속
    int studentsID;
    void goToSchool(){}
}

class Worker extends Human{ // -->Human 클래스 상속
    int workerID;
    void goToWork(){}
//    public class Java20240313 {
//        public static void main(String[] args){
//            //Human 객체 생성
//            Human h = new Human();
//            h.name = "김현지";
//            h.age = 11;
//            h.eat();
//            h.sleep();
//
//            //Students 객체 생성
//            Students s = new Students();
//            s.name = "김민성";
//            s.age = 16;
//            s.studentsID = 128;
//            s.eat();
//            s.sleep();
//            s.goToSchool();
//
//            //Worker 객체 생성
//            Worker w = new Worker();
//            w.name = "봉윤정";
//            w.age = 45;
//            w.workerID=128;
//            w.eat();
//            w.sleep();
//            w.goToWork();
//        }
//    }
//}

class A{}
class B extends A {}
class C extends B {}
class D extends B {}

public class Java20240313{
    //A 타입의 다형적 표현
    A a1 = new A(); //--> A는 A이다(ㅇ)
    A a2 = new B(); //--> B는 A이다(ㅇ)
    A a3 = new C(); //--> C는 A이다(ㅇ)
    A a4 = new D(); //--> D는 A이다(ㅇ)

    //B 타입의 다형적 표현
//    B b1 = new A(); //--> B는 A이다(x)
    B b2 = new B(); //--> B는 B이다(ㅇ)
    B b3 = new C(); //--> C는 B이다(ㅇ)
    B b4 = new D(); //--> D는 B이다(ㅇ)

    //C 타입의 다형적 표현
//    C c1 = new A(); //--> C는 A이다(x)
//    C c2 = new B(); //--> C는 B이다(x)
    C c3 = new C(); //--> C는 C이다(ㅇ)
//    C c4 = new D(); //--> D는 C이다(x)

    //D 타입의 다형적 표현
//    D d1 = new A(); //--> D는 A이다(x)
//    D d2 = new B(); //--> D는 B이다(x)
//    D d3 = new C(); //--> D는 C이다(x)
    D d4 = new D(); //--> D는 D이다(ㅇ)
    }
}