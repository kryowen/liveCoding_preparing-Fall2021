import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileInputStream stream_1 = null;
		FileInputStream stream_2 = null;
		
		InputStreamReader reader_1 = null;
		InputStreamReader reader_2 = null;
		
		try {
			stream_1 = new FileInputStream("Phone.txt");
			File file = new File("Phone.txt");
			stream_2 = new FileInputStream("Phone - 복사본.txt");
			
			reader_1 = new InputStreamReader(stream_1, "UTF-8");
			reader_2 = new InputStreamReader(stream_2, "UTF-8");
			int cnt = 0, a, b;
			
			while ((a = reader_1.read()) != -1 && (b = reader_2.read()) != -1) {
				if(a == b) {
					cnt++;
				}
			}
			
			if(cnt == file.length()) {
				System.out.println("Same");
			} else {
				System.out.println("Not Same");
			}

			reader_1.close(); stream_1.close();
			reader_2.close(); stream_2.close();
			
		} catch (IOException e) {
			System.out.println("파일 입출력 오류 발생!");
			e.printStackTrace();
		}
		
		scanner.close();
	}
}
