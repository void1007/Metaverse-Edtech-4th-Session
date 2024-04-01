package Java0401;
class E {}

class F extends E {}
class G extends F {}
class H extends G {}
class Goods2<T>{
    private T t;
    public T get() {return t;}
    public void get(T t) {this.t = t;}
}
class Test{
    void method1(Goods2<E> g) {};// T를 사용할 수 없음, 구체적인 클래스 명시
    void method2(Goods2<?> g) {}; // 어떤 클래스던 가능
    void method3(Goods2<? extends F> g) {}; // B와 B의 자식클래스 가능
    void method4(Goods2<? super F> g) {}; // B와 B의 부모클래스 가능
}
public class GenericExtends2 {
    public static void main(String[] args) {
        Test test = new Test();
        //case 1 : Goods2<E>
        test.method1(new Goods2<E>()); //가능
        //test.method1(new Goods2<B>()); //불가능

        //case 2 : Goods2<?>
        test.method2(new Goods2<E>());
        test.method2(new Goods2<F>());
        test.method2(new Goods2<G>());
        test.method2(new Goods2<H>());

        //case 3 : Goods2<? extends F>
        //test.method3(new Goods2<E>()); // F와 F의 자식클래스만 가능
        test.method3(new Goods2<F>());
        test.method3(new Goods2<G>());
        test.method3(new Goods2<H>());

        //case 4 : Goods2<? super F>
        test.method4(new Goods2<E>());
        test.method4(new Goods2<F>());
//        test.method4(new Goods2<G>()); // F와 F의 부모클래스만 가능
//        test.method4(new Goods2<H>());
    }
}
