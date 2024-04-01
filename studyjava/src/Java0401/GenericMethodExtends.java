package Java0401;

class AA{
    public <T extends Number> void method(T t){
        System.out.println(t.intValue());
    }
}

interface MyIterface{
    public abstract void print();
}
class BB{
    public <T extends MyIterface> void method1(T t){
        //사용자가 정의한 MyInterface의 자식만 제네릭T 위치에 올 수 있음
        //이렇게 함으로써 사용자 증의 메서드인 print()를 사용할 수 있게 됨
        t.print();//사용자정의 메서드를 사용할 수 있게된다.
    }
}
class CC implements MyIterface{
    @Override
    public void print(){
        System.out.println("print() 구현2");
    }
}


class Goods1<T>{
    private T t;
    public T get() {return t;}
    public void get(T t) {this.t = t;}
}
public class GenericMethodExtends {
    public static void main(String[] args) {
        AA a = new AA();
        a.method(5.8); // <Double>

        BB b = new BB();

        b.method1(new MyIterface() { // 1) 익명 이너 클래스 사용한 경우
            @Override
            public void print() {
                System.out.println("print() 구현");
            }
        });
        b.method1(new CC()); // 2) MyInterface 구현체를 사용한 경우
    }
}

