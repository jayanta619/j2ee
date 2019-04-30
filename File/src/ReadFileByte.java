
import java.io.FileInputStream;
import java.io.IOException;
public class ReadFileByte {
public static void main(String[] args) throws IOException {
FileInputStream fis = new
FileInputStream("C:\\temp\\brave.txt");
int x=0;
while((x=fis.read())!=-1){
System.out.print((char)x);
 }
 }
} 



