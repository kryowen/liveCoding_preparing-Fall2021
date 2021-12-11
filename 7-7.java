import java.util.*;

class Ex {
	private HashMap<String, Double> hashMap;
	
	public Ex() {
		Scanner scanner = new Scanner(System.in);
		
		hashMap = new HashMap<>();
		for(int i = 0; i < 5; i++) {
			System.out.print("이름과 학점 >> ");
			hashMap.put(scanner.next(), scanner.nextDouble());
		}

		search(scanner);	
		scanner.close();
	}
	

	
	void search(Scanner scanner) {
		Set<String> keys = hashMap.keySet();
		Iterator<String> it = keys.iterator();
		
		System.out.print("장학생 선발 학점 기준 입력 >> ");
		double standard = scanner.nextDouble();
		
		System.out.print("장학생 명단 : ");
		while(it.hasNext()) {
			String name = it.next();
			if(hashMap.get(name) >= standard) {
				System.out.print(name + " ");
			}
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Ex ex = new Ex();
	}
}
