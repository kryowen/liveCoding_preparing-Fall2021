import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileOutputStream outputStream = null;
		OutputStreamWriter writer = null;
		
		try {
			outputStream = new FileOutputStream("Phone.txt");
			writer = new OutputStreamWriter(outputStream, "UTF-8");
			
			String msg = scanner.nextLine();
			writer.write(msg);
			writer.write("\r\n", 0, 2);
			
			writer.flush();
			writer.close();
			outputStream.close();
		} catch (IOException e) {
			System.out.println("파일 입출력 오류 발생!");
			e.printStackTrace();
		}
		
		scanner.close();
	}
}
