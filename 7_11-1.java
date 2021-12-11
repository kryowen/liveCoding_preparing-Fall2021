import java.util.*;

class Nation {
	String country, capital;
	
	public Nation(String country, String capital) {
		this.country = country;
		this.capital = capital;
	}
}

class Ex {
	private Vector<Nation> vector;
	
	public Ex() {
		Scanner scanner = new Scanner(System.in);
		vector = new Vector<>();
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
		
		System.out.println("현재 " + vector.size() + "개의 나라와 수도가 입력되어 있습니다.");
		while(true) {
			System.out.print("나라와 수도 입력 >> ");
			city = scanner.next();
			if(city.equals("그만")) {
				break;
			}
			capital = scanner.next();
			
			int cnt = 0;
			for(int i = 0; i < vector.size(); i++) {
				if(vector.get(i).country.equals(city)) {
					System.out.println(city + "는 이미 있습니다.");
					break;
				}
				cnt++;
			}
			
			if(cnt == vector.size()) {
				vector.add(new Nation(city, capital));
			}
			
		}
	}
	
	void quiz(Scanner scanner) {
		int cnt = 0;
		while(true) {
			if(cnt == vector.size()) {
				System.out.println("출제 할 문제가 없습니다.");
				break;
			}
			
			System.out.print(vector.get(cnt).country + "의 수도는 ? ");
			String ans = scanner.next();
			if(ans.equals("그만")) {
				break;
			}
			
			if(vector.get(cnt).capital.equals(ans)) {
				System.out.println("정답!!");
			} else {
				System.out.println("아닙니다!!");
			}
			
			cnt++;
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Ex ex = new Ex();
	}
}
