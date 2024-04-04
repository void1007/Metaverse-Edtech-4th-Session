package Java20240404;

import java.io.*;

public class FileInputStream1 {
    public static void main(String[] args) throws IOException {
        // 파일 데이터 입력
        // 1.파일 대상 설정
        File inFile = new File(FileObject.CURRENT + "/Gay1.txt");
        if (!inFile.exists()){
            inFile.createNewFile();
        }
        // 2. 대상에 연결되는 stream 생성
        InputStream is = new FileInputStream(inFile);
        // 3. 데이터 읽기
        int data;
        byte[] arr = new byte[2];
        while((data=is.read(arr)) !=-1) {
            System.out.println("읽은 데이터 :" + (char)data +
                    "남은 바이트 :" + is.available());
        }
        // 4. stream 종료
        is.close(); // 쓸데없는 오류를 피하기 위해 닫는 습관을 들이자
    }
}
