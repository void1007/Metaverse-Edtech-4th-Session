package Java0327;

public class CreatUserException {
    static class MyException extends Exception{
        public MyException(){
            super();
        }
        public MyException(String message) {
            super(message);
        }
    }

    static class MyRtException extends RuntimeException {
        public MyRtException() {
            super();
        }
        public MyRtException(String message){
            super(message);
        }
    }

    static class A {
        MyException me1 = new MyException();
        MyException me2 = new MyException("예외 메세지: MyException");
        MyRtException mre1 = new MyRtException();
        MyRtException mre2 = new MyRtException("예외 메세지 :MyRTException");

        //4. 예외 던지기(throw): 연산 시점에서 예외 발생
        //방법 ① 예외를 직접 처리
        void abc_1(int num){
            try {
                if (num > 70)
                    System.out.println("정상 작동");
                else
                    throw new MyException("나이가 70 이하임 : " + num); //예외를 던진 시점에 예외 발생
            } catch (MyException e){
                System.out.println("예외 처리1");
                System.out.println(e.getMessage());
            }
        }

        void bcd_1() {
            abc_1(65);
        }
        // 방법② 예외 전가
        void abc_2(int num) throws MyException{
            if (num > 70)
                System.out.println("정상작동");
            else
                throw new MyException("예외전가 ==> 나이가 70 이하임 : " + num); //예외를 던진 시점에 예외 발생
        }
        void bcd_2(){
            try {
                abc_2(65);
            } catch (MyException e){
                System.out.println("예외 처리2");
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
       A a = new A();
        a.bcd_1();
        a.bcd_2();
    }
}
