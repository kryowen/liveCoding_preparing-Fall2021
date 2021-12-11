import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileInputStream inputStream = null;
		InputStreamReader reader = null;
		
		try {
			inputStream = new FileInputStream("Phone.txt");
			reader = new InputStreamReader(inputStream, "UTF-8");
			
			int c;
			while((c = reader.read()) != -1) {
				System.out.print((char) c);
			}
			
			
		} catch (IOException e) {
			System.out.println("파일 입출력 오류 발생!");
			e.printStackTrace();
		}
		
		scanner.close();
	}
}
