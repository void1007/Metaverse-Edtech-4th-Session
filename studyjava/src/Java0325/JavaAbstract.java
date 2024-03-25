package Java0325;

abstract public class JavaAbstract {
    //필드
    int a;
    String b;
    public JavaAbstract(){
        this.a = 10;
        this.b = "default";
    }
    public JavaAbstract(int a,String b){
        this.a = a;
        this.b = b;
    }
    public int getValue(){
    return a;
    }
    abstract public String getString();

    public void setValue(int a){ //세터(Setter) 메서드
        this.a = a;
    }
    public void setString(String b){ //세터(Setter) 메서드
        this.b = b;
    }
}
