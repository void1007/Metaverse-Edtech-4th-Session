public class Student {
    private String name;
    private int age;
    private String address;
    private String personalNum;

    public Student() { //기본생성자
    }

    public Student(String name, int age, String address, String personalNum) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.personalNum = personalNum;
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPersonalNum() {
        return personalNum;
    }


    public void displayName(){ // 메소드
        System.out.println(this.name);
    }
    public void displayage(){
        System.out.println(this.age);
    }
    public void displayaddress(){
        System.out.println(this.address);
    }

    public void displayAll(){
        System.out.println(this.name + " " + this.age + " " + this.address);
    }

    //getter : 읽는명령어 read
    //setter : 쓰는명령어 write

    //pubicl void 메소드 이름(파라미터)  //parameter == 매개변수

    //Ststem.out.println("Java");
    //Ststem.out.println(a);

    public static void main(String[] args) {
        int[] numberList = {12 , 34 ,56, 32 , 84 , 99 , 73, 69};
        int[] numberList2 = {123, 345, 235, 7898, 467};
        getSumAvg(numberList);
        getSumAvg(numberList2);
    }
    public static void getSumAvg(int[] numberList){
        //7. 아래 배열의 총합과 평균을 출력
        int sum = 0;
        for (int i =0; i<numberList.length; i++){
            sum = sum + numberList[i];
        }
        int average = sum / numberList.length;
        System.out.println("합계: " + sum + ", 평균: " + average);
    }

}

