public class java20240229final {
    public static void main(String[] args) {
//        if (5>3) {
//            System.out.println("출력1"); //실행됨
//        }
//        if (5<3) {
//            System.out.println("출력2"); //실행 안 됨
//        }
//        int a = 3;
//        if (a ==3){
//            System.out.println("출력3"); //실행됨
//        }
//        boolean b = false;
//        if (b) {
//            System.out.println("출력4"); //실행 안 됨
//        }
//
//        if (3>5) {
//            System.out.println("안녕"); //출력 안 됨
//            System.out.println("방가"); //출력 안 됨
//        }


//        if (3>5){
//            System.out.println("안녕"); //출력 안 됨
//        } System.out.println("방가"); //출력됨
//
//        if(5>3) {
//            System.out.println("실행1");//실행됨
//        }else {
//            System.out.println("실행2");//실행 안 됨
//        }
        // if 문 유형 ② if-else 구분
//        int x, y;
//        x=5; y=0;
//        if (x>5) { //실행안됨
//            y = 10;
//        }else { //실행됨
//            y = 20;
//        }
//        System.out.println(y); //20

//        int x =95;
//        if (x >= 90){
//            System.out.println("A학점");
//        } else if (x >= 80){
//            System.out.println("B학점");
//        } else if (x >= 70){
//            System.out.println("C학점");
//        } else {
//            System.out.println("F학점");
//        }

//        int x = 85;
//        if (x >= 70){
//            System.out.println("C학점");
//        }
//        else if (x >= 80) {
//            System.out.println("B학점");
//        }
//        else if (x >= 90) {
//            System.out.println("A학점");
//        }
//        else {
//            System.out.println("F학점");
//        }

//        int x = 85;
//        if(x >= 70 && x<80){
//            System.out.println("C학점");
//        } else if (x >= 80 && x<90) {
//            System.out.println("B학점");
//        } else if (x >= 90) {
//            System.out.println("A학점");
//        } else {
//            System.out.println("F학점 낙제");
//        }
        // 유형 ①: if
//        int value1 = 5;
//        if (value1 > 3){
//            System.out.println("실행1");
//        }
//        if (value1 < 5) {
//            System.out.println("실행2");
//        }
//
//        boolean bool1 = true;
//        boolean bool2 = false;
//        if (bool1) {
//            System.out.println("실행3");
//        }
//        if (bool2) {
//            System.out.println("실행4");
//        }

//        유형 ②: if-else
//        int value2 = 5;
//        if (value2 > 3){
//            System.out.println("실행5");
//        }else {
//            System.out.println("실행6");
//        }
//
//        // cf. 삼황 연산자와 변환 가능
//        System.out.println((value2 < 3) ? "실행5" : "실행6");
//        System.out.println();

        //유형 ③: if-else if-else ief-...else
//        int value3 = 85;
//        if (value3 >= 90) {
//            System.out.println("A학점");
//        } else if (value3 >= 80) {
//            System.out.println("B학점"); //실행한 후 탈출
//        } else if (value3 >= 70) {
//            System.out.println("C학점");
//        } else {
//            System.out.println("F학점");
//        }
//
//        if (value3 >= 70) {
//            System.out.println("C학점"); //실행한 후 탈출
//        } else if (value3 >= 80) {
//            System.out.println("B학점");
//        }

//        int x = 2;
//        switch(x) {
//            case 1:
//                System.out.println("A");
//                break;
//            case 2:
//                System.out.println("B");
//                break;
//            case 3:
//                System.out.println("C");
//                break;
//            default:
//                System.out.println("D");
//                break;
//        }

//        int x =8;
//        switch (x){
//            case 10:
//                System.out.println("pass");break;
//            case 9:
//                System.out.println("pass");break;
//            case 8:
//                System.out.println("pass");break;
//            case 7:
//                System.out.println("pass");break;
//            default:
//                System.out.println("Fail");break;
//        }

//        int x = 4;
//        switch (x){
//            case 10:
//            case 9:
//            case 8:
//            case 7:
//                System.out.println("pass"); break;
//            default:
//                System.out.println("Fail");
//        }

//        int x= 8;
//        switch (x){
//            case 10:
//            case 9:
//                System.out.println("A");
//                break;
//            case 8:
//                System.out.println("B"); // 실행한 후 탈출
//                break;
//            case 7:
//                System.out.println("C");
//                break;
//            default:
//                System.out.println("D");
//        }
        //if문
//        if (x >=9){
//            System.out.println("A");
//        } else if (x == 8) {
//            System.out.println("B"); // 실행한 후 탈출
//        } else if (x == 7) {
//            System.out.println("C");
//        } else{
//            System.out.println("D");
//        }
        //break가 포함되지 않았을 때
//        int value1 = 3;
//        switch (value1){
//            case 1:
//                System.out.println("A");
//                break;
//            case 2:
//                System.out.println("B"); //점프한 후 계속 실행
//                break;
//            case 3:
//                System.out.println("C");
//                break;
//            default:
//                System.out.println("D");
//        }
//        System.out.println();
        //if-else if-else 구문으로 변환
//        if (value1 == 1){
//            System.out.println("A");
//        } else if (value1 ==2) {
//            System.out.println("B");
//        } else if (value1 ==3) {
//            System.out.println("C");
//        } else {
//            System.out.println("D");
//        }

//        int i;
//        for (i=0; i<3; i++){
//            System.out.println("실행");
//        }
//        System.out.println(i); //3

//        for(int i=0; i<3; i++){
//            System.out.println("실행");
//        }
//        System.out.println(i); //오류

//        for (int i=0; ; i++){
//            if (i>10){
//                break;
//            }
//            System.out.println(i+""); // 0 1 2 3 4 5 6 7 8 9 10
//        }

//        for (int i = 0; ; i++){
//            if (i>10){
//                break;
//            }
//            System.out.println(i+" "); // 0 1 2 3 4 5 6 7 8 9 10

//        int x;
//        for (x=0; x<3; x++){
//            System.out.println(x+" ");
//        }
//        System.out.println();
//
//        for(int i=0; i<100; i++){
//            System.out.println(i + " ");
//        }
//        System.out.println();

//        for (int i =10; i > 0; i-- ){
//            System.out.println(i+" ");
//        }
//        System.out.println();

//        for (int i =0; i<10; i+=2){
//            System.out.println(i+" ");
//        }
//        System.out.println();

//        for (int i=0, j = 0; i < 10; i++, j++){
//            System.out.println(i + j + " ");
//        }
//        System.out.println();

//        for (int i = 0; ; i++){
//            System.out.println(i+" ");
//        }
//        for(;;) {
//            System.out.println("무한 루프");
//        }
//        System.out.println();
        //무한 루프 탈출
        for (int i=0; ; i++){
            if (i>10){
                break;
            }
        System.out.println(i +" ");
        }
        System.out.println("무한 루프 탈출");
    }
}
