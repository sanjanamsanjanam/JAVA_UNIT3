import java.io.*;
public class BufferedByteWriteDemo {
public static void main(String[] args) throws IOException {
FileOutputStream fos = new FileOutputStream("bufferedBytes.dat");
BufferedOutputStream bos = new BufferedOutputStream(fos);
bos.write(68); // 'D'
bos.write(69); // 'E'
bos.write(70); // 'F'
bos.close(); // Automatically flushes buffer
System.out.println("Buffered byte writing completed");

}
}
