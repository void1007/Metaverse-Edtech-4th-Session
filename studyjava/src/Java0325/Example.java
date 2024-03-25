package Java0325;

public class Example {
    public static void main(String[] args) {
        //첫번째 미션
        //아래 코드가 실행될 수 있도록 Student 클래스를 완성하시오
        // 힌트 : 세터메서드를 만들어야함. toString()는 오버라이딩 필요.
        Students students0 = new Students();
        students0.setName("Steve");
        students0.setDepartment("Physics");
        students0.setStudentId(10001);
//        System.out.println(students0.toString()); // Steve, Physics, 10001\
        
        //두번째 미션
        //아래 메서드를 완성하시오
        //주어진 배열을 이용하여 Students타입의 배열을 만들고 for문으로 출력해야함
        createStudentsInfo();
    }

    public static void createStudentsInfo() {
        String[] names = {"Steve", "tom", "Laura", "Susie"};
        String[] departments = {"Physics", "Computer", "English", "Law"};
        int[] studentsIds = {10001, 10002, 10003, 10004};
        //데이터베이스의 raw data(가공되지 않은 순수 데이터)를
        //Student 객체형태로 만들고 이를 배열에 담는다.

//        // 배열의 길이를 기반으로 Students 객체 배열을 생성합니다.
        Students[] students = new Students[names.length];
//
//        // 배열을 순회하면서 각 요소마다 Students 객체를 생성하고 값들을 설정합니다.
        for (int i = 0; i < names.length; i++) {
//            Students student = new Students();
            students[i] =  new Students(names[i],departments[i],studentsIds[i]);
            students[i].setName(names[i]);
            students[i].setDepartment(departments[i]);
            students[i].setStudentId(studentsIds[i]);
            System.out.println(students[i].toString());
//            student.setName(names[i]);
//            student.setDepartment(departments[i]);
//            student.setStudentId(studentsIds[i]);
//            students[i] = student; // 배열에 객체를 할당합니다.
        }
//        // 배열을 순회하면서 객체 정보를 출력합니다.
        for (Students student : students) {
            System.out.println(student.toString());
        }
    }
}
