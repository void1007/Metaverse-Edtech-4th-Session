package Java20240404;

import java.io.*;

public class DataIOStream {
    public static void main(String[] args) throws IOException {
        File dataFile = new File(FileObject.CURRENT + "/fileData.data");
        OutputStream os = new FileOutputStream(dataFile);
        InputStream is = new FileInputStream(dataFile);

        // 기존의 IO Stream들은 바이트단위로만 읽고 쓸 수 있는 반면,
        // DataInputStream/DataOutputStream은 여러 원시자료형의 형태에 맞춰 읽고 쓸 수 있음
        DataOutputStream dos = new DataOutputStream(os);
        DataInputStream dis =  new DataInputStream(is);

        //쓰기
        dos.writeInt(74);
        dos.writeDouble(6.9);
        dos.writeChar('G');
        dos.writeUTF("AY");
        dos.flush();

        //읽기
        int a = dis.readInt();
        double b = dis.readDouble();
        char c = dis.readChar();
        String d =dis.readUTF();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        os.close();
        dos.close();
        is.close();
        dis.close();
    }
}
