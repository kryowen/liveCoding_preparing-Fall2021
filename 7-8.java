import java.util.*;

class Ex {
	private HashMap<String, Integer> hashMap;
	
	public Ex() {
		Scanner scanner = new Scanner(System.in);
		
		hashMap = new HashMap<>();
		System.out.println("** 포인트 관리 프로그램 입니다. **");
		while(true) {
			System.out.print("이름과 포인트 입력 >> ");
			String name = scanner.next();
			if(name.equals("그만")) {
				break;
			}
			int points = scanner.nextInt();
			
			if(hashMap.containsKey(name)) {
				hashMap.put(name, hashMap.get(name) + points);
			} else {
				hashMap.put(name, points);
			}
			
			search(scanner);
			System.out.println();
		}
		
		scanner.close();
	}
	

	
	void search(Scanner scanner) {
		Set<String> keys = hashMap.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			System.out.print("(" + name + "," + hashMap.get(name) + ")");
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Ex ex = new Ex();
	}
}
