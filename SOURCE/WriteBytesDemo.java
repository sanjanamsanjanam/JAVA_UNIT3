import java.io.*;
public class WriteBytesDemo {
public static void main(String[] args) throws IOException {
FileOutputStream fos = new FileOutputStream("bytes.dat");
fos.write(65); // Writes ASCII value of 'A'
fos.write(66); // Writes ASCII value of 'B'
fos.write(67); // Writes ASCII value of 'C'
fos.close();
System.out.println("Bytes written successfully");
}
}
