import java.io.*;
public class FileConcatDemo {
public static void main(String[] args) throws IOException {
FileInputStream fis1 = new FileInputStream("file1.txt");
FileInputStream fis2 = new FileInputStream("file2.txt");
FileOutputStream fos = new FileOutputStream("combined.txt");
int ch;
while((ch = fis1.read()) != -1) {
fos.write(ch);
}
while((ch = fis2.read()) != -1) {

fos.write(ch);
}
fis1.close();
fis2.close();
fos.close();
System.out.println("Files concatenated successfully");
}
}
