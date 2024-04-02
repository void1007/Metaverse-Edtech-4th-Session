package Java20240402;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    //-User의 로그인ID처럼 teacherId 필요
    //-이름 필드 필요
    //-기타 필요한 필드는 각자 만들어주세요
    public static void main(String[] args) {
        List<Teacher> teachers = new  ArrayList<>(); // --> Teacher객체를 저장하기 위한 ArrayList를 생성
        teachers.add(new Teacher("T1","John"));
        teachers.add(new Teacher("T2","Emma"));
        teachers.add(new Teacher("T3","Michael")); // --> Teacher 객체를 생성하여 ArrayList에 추가합니다.


        List<Lecture> lectures = new ArrayList<>(); // -->Lecture 객체를 저장하기 위한 ArrayList를 생성합니다.
        lectures.add(new Lecture("L1","Mathematics"));
        lectures.add(new Lecture("L2","Science"));
        lectures.add(new Lecture("L3","History")); // -->Lecture 객체를 생성하여 ArrayList에 추가합니다.

        LectureTeacher lectureTeacher = new LectureTeacher(); // -->LectureTeacher객체를 생성합니다.

        //임의의 선생인과 임의의 과목 매칭
        Random random = new Random(); // -->무작위 수를 생성하기 위한 Random객체를 생성합니다.

        for (Lecture lecture : lectures){ // -->lectures리스트에 있는 각 Lecture객체에 대해 반복합니다.

            Teacher teacher = teachers.get(random.nextInt(teachers.size())); // --> teachers리스트에서 무작위로 Teacher객체를 선택합니다.

            lectureTeacher.assignTeacherToLecture(lecture , teacher); // --> 선택된 Teacher객체와 현재의 LectureTeacher클래스의 assignTeacherToLecture메서드에 전달하여 매칭합니다.
        }

        //특정 과목의 담당 선생님 이름 출력
        String lectureID = "L1"; //특정 과목ID를 설정합니다.

        String teacherName = lectureTeacher.getTeacherNameByLectureID(lectureID); // --> LectureTeacher클래스의 getTeacherNameByLectureId메서드를 사용하여 특정 과목의 담당 선생님 이름을 가져옵니다.

        System.out.println("과목 ID " + lectureID + "의 담당 선생님은 " + teacherName + "입니다"); // -->특정 과목의 담당 선생님 이름을 출력합니다.

        //특정 선생님이 가르치는 과목 리스트 출력
        String teacherID = "T2"; // --> 특정 선생님 ID를 설정합니다.

        List<String> lectureTitles = lectureTeacher.getLectureTitlesByTeacherID(teacherID); // --> LectureTeacher클래스의getTeacherNameByLectureId 메서드를 사용하여 특정 과목의 담당 선생님 이름을 가져옵니다.

        System.out.println("선생님 ID " + teacherID + "가 가르치는 과목 리스트: " + lectureTitles + "입니다"); // -->특정 선생님Id를 출력합니다
    }
}
class Teacher{
    private String teacherId; // -->선생님의 Id를 나타내는 문자열 필드입니다.
    private String name; // --> 선생님의 이름을 나타내는 문자열 필드입니다.

    public Teacher(String teacherId, String name) // --> 'Teacher'생성자는 선생님의Id와 이름을 매개변수로 받아 초기화합니다.
    {
        this.teacherId = teacherId;
        this.name = name;
    }

    public String getTeacherId() // -->선생님의Id를 반환하는 메서드입니다.
     {
        return teacherId;
    }

    public String getName() // -->선생님의 이름을 반환하는 메서드입니다.
    {
        return name;
    }
    //-어느 teacher가 어느 과목을 가르치는지 관계를 저장하는 클래스
}

class Lecture // -->
{
    private String LectureID; // --> 강의의 Id를 나타내는 문자열 필드입니다.
    private String title; // --> 강의의 제목을 나타내는 문자열 필드입니다.

    public Lecture(String LectureID , String title) // --> 생성자는 강의의Id와 제목을 매개변수로 받아 초기화합니다.
    {
        this.LectureID = LectureID;
        this.title = title;
    }
    public String getLectureID() // --> 강의의Id를 반환하는 메서드입니다.
    {
        return LectureID;
    }

    public String getTitle() // --> 강의의 제목을 반환하는 메서드입니다.
    {
        return title;
    }
}

class LectureTeacher // -->
{
    private List<Lecture> lectures; // --> 강의 리스트를 저장하는 List<Lecture> 필드입니다.
    private List<Teacher> teachers; // --> 선생님 리스트를 저장하는 List<Teacher> 필드입니다.
    public LectureTeacher() // --> LectureTeacher 생성자는 lecture와 teacher를 초기화합니다.
    {
        this.lectures = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }
    public void assignTeacherToLecture(Lecture lecture, Teacher teacher) // --> 강의와 선생님 간의 관계를 맺는 메서드입니다. 강의와 선생님을 매개변수로 받아 리스트에 추가합니다.
    {
        lectures.add(lecture);
        teachers.add(teacher);
    }
    public String getTeacherNameByLectureID(String lectureID) // -->강의Id를 받아 해당 강의를 가르치는 선생님의 이름을 반환하는 메서드입니다.
    {
        for (int i =0;i < lectures.size(); i++){
            if (lectures.get(i).getLectureID().equals(lectureID)){
                return teachers.get(i).getName();
            }
        }
        return "해당 과목을 가르치는 선생님이 없습니다.";
    }
    public List<String> getLectureTitlesByTeacherID(String teacherID) // --> 선생님Id를 받아 해당 선생님이 가르치는 모든 강의의 제목을 받환하는 메서드 입니다.
    {
        List<String> lectureTitles = new ArrayList<>();
        for (int i = 0; i < teachers.size(); i++){
            if (teachers.get(i).getTeacherId().equals(teacherID)){
                lectureTitles.add(lectures.get(i).getTitle());
            }
        }
        return lectureTitles;
    }
}
//관련 메서드 만들기
//3-1)getTeacherByLectureId : 특정 과목ID로 해당 과목을 가르치는 teacher의 이름출력
//3-2)getLectureTitleListByTeacherId : 특정 teacher가 가르치는 과목명 리스트 출력(반드시 String[]또는 List<String>에 담아서 리턴)