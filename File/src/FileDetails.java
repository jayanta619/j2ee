
	import java.io.File;
	public class FileDetails {
	 public static void main(String[] args) {
	 File file = new File("C:\\temp");
	System.out.println("File exists: "+file.exists());
	System.out.println("File Path: " + file.getAbsolutePath());
	System.out.println("File readable: " + file.canRead());
	System.out.println("File writable: " +file.canWrite());
	System.out.println("File executable: " +file.canExecute());
	System.out.println("File length: " +file.length());
	 }
	}

