import java.util.*;

class Location {
	int x, y;
	
	public Location(int x, int y) {
		this.x = x; 
		this.y = y;
	}

	@Override
	public String toString() {
		return x + " " + y;
	}
	
}

class Ex {
	private HashMap<String, Location> hashMap;
	
	public Ex() {
		Scanner scanner = new Scanner(System.in);
		
		hashMap = new HashMap<>();
		for(int i = 0; i < 1; i++) {
			hashMap.put(scanner.next(), new Location(scanner.nextInt(), scanner.nextInt()));
		}
		System.out.println("--------------------------------------");
		
		print();
		System.out.println("--------------------------------------");
		
		search(scanner);
		scanner.close();
	}
	
	void print() {
		Set<String> keys = hashMap.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String city = it.next();
			System.out.println(city + " " + hashMap.get(city));
		}
	}
	
	void search(Scanner scanner) {
		String searchKey;
		
		while(true) {
			System.out.print("도시 이름 >> ");
			searchKey = scanner.next();
			if(searchKey.equals("그만")) {
				break;
			}
			
			if(hashMap.containsKey(searchKey)) {
				System.out.println(searchKey + " " + hashMap.get(searchKey));
			} else {
				System.out.println( searchKey + "는 없습니다. ");
			}
		}
	}
}

public class Main {
	public static void main(String[] args) {
		new Ex();
	}
}
