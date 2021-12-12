import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileInputStream streamA = null;
		FileInputStream streamB = null;
		FileOutputStream out = null;
		
		System.out.print("파일 1: ");
		String fileA = scanner.nextLine();
		System.out.print("파일 2: ");
		String fileB = scanner.nextLine();
		
		try {
			streamA = new FileInputStream(fileA);
			streamB = new FileInputStream(fileB);
			out = new FileOutputStream("appended.txt");
			int c;
			
			while((c = streamA.read()) != -1) {
				out.write((char) c);
			}
			out.write('\n');
			while ((c = streamB.read()) != -1) {
				out.write((char) c);
			}
			
			streamA.close();
			streamB.close();
			
			System.out.println("프로젝트 폴더 안에 appended.txt 파일에 저장하였습니다. ");
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("입출력 오류가 발생했습니다.");
			e.printStackTrace();
		}
		
		scanner.close();
	}
}
