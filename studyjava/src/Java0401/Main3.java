package Java0401;

class MyclassABC<A,B,C> {
    private A a;

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    private B b;

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    private C c;

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }
}
public class Main3 {
    public static void main(String[] args) {
        //3개의 제네릭 클래스를 사용하는 매체
        MyclassABC<String, Integer,Double> abc = new MyclassABC<>();
        abc.setA("3개의 제네릭");
        abc.setB(100);
        abc.setC(5.5);
        System.out.println(abc.getA() + " " +abc.getB() + " " + abc.getC());
    }
}
