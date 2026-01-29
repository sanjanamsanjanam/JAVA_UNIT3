import java.io.*;
public class BufferedCharWriteDemo {
public static void main(String[] args) throws IOException {
FileWriter fw = new FileWriter("bufferedText.txt");
BufferedWriter bw = new BufferedWriter(fw);
bw.write("Buffered writing improves performance");
bw.newLine();
bw.write("Especially for large files");
bw.close();
System.out.println("Buffered character writing completed");
}
}
