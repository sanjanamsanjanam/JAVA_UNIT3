import java.io.*;
public class WriteCharsDemo {
public static void main(String[] args) throws IOException {
FileWriter fw = new FileWriter("message.txt");
fw.write("Java File Handling\n");
fw.write("Writing characters to a file");
fw.close();
System.out.println("Characters written successfully");
}
}
