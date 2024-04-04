package Java20240404;

import java.io.*;
import java.nio.charset.Charset;

public class FileInputOutput {
    public static void main(String[] args) throws IOException {
        File file = new File(FileObject.CURRENT + "/gayio.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        OutputStream os = new FileOutputStream(file);
        //byte[] arrayByte = "Hello gays, Let's go to the gaybar".getBytes();
        byte[] arrayByte = "반갑다 게이야!".getBytes(Charset.forName("UTF-8"));
        os.write(arrayByte);
        os.flush();
        os.close();

        //읽기
        InputStream is = new FileInputStream(file);
        int GayData = 0;
        byte[] buffer = new byte[1000];
        String str = "";
        while (GayData !=-1){
            GayData = is.read(buffer);
            if (GayData >= 0){
            str = str + new String(buffer, 0 , GayData
                    ,Charset.forName("UTF-8"));
            }
        }
        System.out.println(str);

        //위와 아래의 수식의 결과값은 똑같다

        /*while ((GayData = is.read(buffer)) !=-1){
            System.out.println(buffer);
        }*/

        is.close();
    }
}
