import java.util.*;

class Student {
	String name, department;
	int studentNum;
	double avgGrade;
	
	public Student(String info) {
		String[] infos = info.split(", ");
		this.name = infos[0];
		this.department = infos[1];
		this.studentNum = Integer.parseInt(infos[2]);
		this.avgGrade = Double.parseDouble(infos[3]);
	}

	@Override
	public String toString() {
		return "이름 :" + name + "\n"
			 + "학과 :" + department + "\n"
			 + "학번 :" + studentNum + "\n"
			 + "학점평균 :" + avgGrade + "\n"
			 + "----------------------------";
	}
	
}

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<>();
		
		System.out.println("학생 이름, 학과, 학번, 학점평균을 입력하시오.");
		for(int i = 0; i < 1; i++) {
			System.out.print(">> ");
			list.add(new Student(scanner.nextLine()));
		}
		System.out.println("----------------------------");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		String msg;
		while(true) {
			System.out.print("학생 이름 >> ");
			msg = scanner.nextLine();
			if(msg.equals("그만")) {
				break;
			}
			
			for(int i = 0; i < list.size(); i++) {
				if(msg.equals(list.get(i).name)) {
					System.out.println(list.get(i).name + ", " + list.get(i).department + ", " + list.get(i).studentNum + ", " + list.get(i).avgGrade);
					break;
				} else {
					System.out.println(msg + "라는 사람은 없습니다. ");
				}
			}
			
		}
		
		
		scanner.close();
	}
}
