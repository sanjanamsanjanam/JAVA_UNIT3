import java.io.*;
public class RandomAccessDemo {
public static void main(String[] args) throws IOException {
RandomAccessFile raf = new RandomAccessFile("random.txt", "rw");
raf.writeUTF("Java Programming");
raf.seek(0); // Move pointer to beginning
String data = raf.readUTF();
raf.close();
System.out.println("Read from file: " + data);
}
}
