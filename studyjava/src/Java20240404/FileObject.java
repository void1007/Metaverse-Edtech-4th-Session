package Java20240404;


import java.io.File;
import java.io.IOException;

public class FileObject {
    public static final String CURRENT = "C:/Users/user/Documents/GitHub/java/studyjava/Hellogays";
    public static void main(String[] args) {
        String currenPath =  System.getProperty("user.dir");
        System.out.println(currenPath);

        // 절대경로
        File HellogaysDir = new File("C:/Users/user/Documents/GitHub/java/studyjava/Hellogays");
        if(HellogaysDir.exists()){
            System.out.println("폴더가 이미 존재합니다.");
        }else {
            System.out.println("폴더를 생성합니다.");
           HellogaysDir.mkdir(); //mkdir = make directory
        }

        //파일생성
        File newGays = new File(CURRENT + "/newGays.txt");
        if (!newGays.exists()){
            try{
                newGays.createNewFile();
            } catch (IOException e){
                System.out.println("IOException 예외");
            }
        }else {
            System.out.println("이미 있다 게이야!");
        }

        //File 객체가 가르키는 대상(폴더 또는 파일)의 절대경로 확인
            System.out.println("절대경로 위치: " + newGays.getAbsoluteFile());
    }
}
