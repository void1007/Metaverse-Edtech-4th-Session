package Java20240326;

public class ChildA extends Object implements A,B{

    @Override
    public void abc() {
        System.out.println("Class of A");
    }

    @Override
    public void bcd() {
        System.out.println("Class of B");
    }
}
