import java.util.*;

class Student {
	String name, department;
	int studentNum;
	double avgGrade;
	
	public Student(String name, String info) {
		String[] infos = info.split(", ");
		this.name = name;
		this.department = infos[0];
		this.studentNum = Integer.parseInt(infos[1]);
		this.avgGrade = Double.parseDouble(infos[2]);
	}

	@Override
	public String toString() {
		return "이름:" + name + "\n"
			 + "학과:" + department + "\n"
			 + "학번:" + studentNum + "\n"
			 + "학점평균:" + avgGrade + "\n"
			 + "----------------------------";
	}
	
}

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Student> hashMap = new HashMap<>();
		
		System.out.println("학생 이름, 학과, 학번, 학점평균을 입력하시오.");
		for(int i = 0; i < 1; i++) {
			System.out.print(">> ");
			String name = scanner.next().replace(',', ' ').trim();
			hashMap.put(name, new Student(name, scanner.nextLine()));
		}
		System.out.println("----------------------------");
		
		Set<String> keys = hashMap.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			System.out.println(hashMap.get(it.next()));
		}
		
		String msg;
		while(true) {
			System.out.print("학생 이름 >> ");
			msg = scanner.nextLine();
			if(msg.equals("그만")) {
				break;
			}
			
			if(hashMap.containsKey(msg)) {
				System.out.println(hashMap.get(msg).name + ", " + hashMap.get(msg).department + ", " + hashMap.get(msg).studentNum + ", " + hashMap.get(msg).avgGrade);
			}
			
		}
		
		
		scanner.close();
	}
}
