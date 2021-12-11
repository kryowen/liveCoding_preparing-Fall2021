import java.util.*;

class Ex {
	private HashMap<String, String> hashMap;
	private Scanner scanner;
	
	public Ex(Scanner scanner) {
		this.scanner = scanner;
		hashMap = new HashMap<>();
		
		System.out.println("***** 수도 맟추기 게임을 시작합니다. *****");
		operate(scanner);
	}
	
	void operate(Scanner scanner) {
		boolean flag = true;
		
		while(flag) {
			System.out.println("** 입력: 1, 퀴즈: 2, 종료: 3 **");
			int choice = scanner.nextInt();
			
			switch (choice) {
				case 1:
					input(scanner);
					break;
				case 2:
					quiz(scanner);
					break;
				case 3:
					flag = false;
					break;
				default:
					break;
			}
		}
	}
	
	void input(Scanner scanner) {
		String city, capital;
		
		System.out.println("현재 " + hashMap.size() + "개의 나라와 수도가 입력되어 있습니다.");
		while(true) {
			System.out.print("나라와 수도 입력 >> ");
			city = scanner.next();
			if(city.equals("그만")) {
				break;
			}
			capital = scanner.next();
			
			if(hashMap.containsKey(city)) {
				System.out.println(city + "는 이미 있습니다.");
			} else {
				hashMap.put(city, capital);
			}
		}
	}
	
	void quiz(Scanner scanner) {
		Set<String> keys = hashMap.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.print(key + "의 수도는? ");
			String ans = scanner.next();
			if(ans.equals("그만")) {
				break;
			}

			if(hashMap.get(key).equals(ans)) {
				System.out.println("정답!!");
			} else {
				System.out.println("아닙니다!!");
			}
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Ex ex = new Ex(scanner);
		scanner.close();
	}
}
