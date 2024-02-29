public class java20240229 {

    public static void main(String[] args) {
        // if 단독사용
        boolean x = true;
        if (x) {
            System.out.println("테스트중!!!");
        }
        if (!x) {
            System.out.println("이건 안보일껄??");
        }
        // if ~ else
        if (x) {
            System.out.println("x는 ture");
        }else {
            System.out.println("x는 false");
        }
        // if else의 중복 사용
        boolean a =  true;
        boolean b =  true;
        boolean c =  true;
        if (a) {
            System.out.println("a가 true");
        }else if (b) {
            System.out.println("a는 false, b가 true");
        }else if (c) {
            System.out.println("a,b는 false, c가 true");
        }else {
            System.out.println("a,b,c는 false");
        }

        // 학점 코드 (번위를 나타내는 조건식)
        // 조건식에 사용된 범위가 전체를 100% 커버해야한다.
        // 중복 해당되도록 조건을 만들면 안됨
        int score = 55;
        if (score >= 90) {
            System.out.println("A 학점");
        }else if (score >= 80 && score < 90){
            System.out.println("B학점");
        }else if (score >= 70 && score < 80){
            System.out.println("C학점");
        }else if (score >= 60 && score < 70){
            System.out.println("D학점");
        }else if (score >= 50 && score < 60){
            System.out.println("E학점");
        }else {
            System.out.println("F학점 낙제");
        }
        // 관계가 없는 조건을 if else로 설정하면 안됨
        int num = 4;
        if (num > 0) {
            System.out.println("num은 양수");
        }else if (num % 2 == 0) {
            System.out.println("num은 짝수");
        }
        // 독립적인 if문으로 만드는 것이 좋다.
        if (num > 0){
            System.out.println("num은 양수");
        }
        if (num % 2 == 0){
            System.out.println("num은 짝수");
        }
        // if문 속에 if문
        if (true){
            if (true){
                if (true){
                System.out.println("if문 속에 if문");
                }
            }
        }
        int number = 4;
        switch(number) {
            case 1:
            System.out.println("A");
            break; // 항상 break 키워드와 함께 쓰자!!!
            case 2:
            System.out.println("B");
            break;
            case 3:
            System.out.println("C");
            break;
            default:
            System.out.println("D");
            break;
        }

        int y = 6;
        switch (y) {
            case 10:
            case 9:
            case 8:
            case 7:
                System.out.println("pass"); break;

            default:
                System.out.println("Fail");
        }
    }
    //switch case
}

//객체 = 참조자료형 ->class
//class = 구성 구조
//메소드
//상속
