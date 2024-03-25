package Java0325;

public class Students {
private String name;
private String department;
private int studentId;

    // 세터 메서드
//public void setName(String name){
//    this.name = name;
//}
//
//public void setDepartment(String department){
//    this.department = department;
//}
//
//public void setStudentId(int studentId){
//    this.studentId = studentId;
//}

    public Students() {
    }

    public Students(String name, String department, int studentId) {
        this.name = name;
        this.department = department;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // toString() 메서드 오버라이딩
//@Override
//    public String toString(){
//    return name + "," + department + ","  + studentId;
//}


    @Override
    public String toString() {
        return this.name +"," + this.department + "," + this.studentId;
    }
}
