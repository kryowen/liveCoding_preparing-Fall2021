import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, String> hashMap;
		FileInputStream inputStream = null;
		InputStreamReader reader = null;
		
		try {
			inputStream = new FileInputStream("Phone.txt");
			reader = new InputStreamReader(inputStream, "UTF-8");
			Scanner Fscanner = new Scanner(reader);
			
			hashMap = new HashMap<>();
			while(Fscanner.hasNext()) {
				String[] tmp = Fscanner.nextLine().split(" ");
				hashMap.put(tmp[0], tmp[1]);
			}
			
			System.out.println("총 " + hashMap.size() + "개의 전화번호를 읽었습니다. ");
			while(true) {
				System.out.print("이름 >> ");
				String name = scanner.next();
				if(name.equals("그만")) {
					break;
				}
				
				if(hashMap.containsKey(name)) {
					System.out.println(hashMap.get(name));
				} else {
					System.out.println("찾는 이름이 없습니다.");
				}
			}
			
			Fscanner.close();
			reader.close();
			inputStream.close();
			
		} catch (IOException e) {
			System.out.println("파일 입출력 오류 발생!");
			e.printStackTrace();
		}
		
		scanner.close();
	}
}
