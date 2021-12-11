import java.util.*;

class Country {
    HashMap<String, Integer> hashMap;

    public Country() {
        Scanner scanner = new Scanner(System.in);
        hashMap = new HashMap<>();

        while(true) {
            System.out.print("국가 이름, 인구 >>");
            String inputStr = scanner.next();
            if(inputStr.equals("그만")) {
                break;
            }
            int inputPop = scanner.nextInt();

            hashMap.put(inputStr, inputPop);
        }

        Operate(scanner);
        scanner.close();
    }

    public void Operate(Scanner scanner) {
        while(true) {
            System.out.print("인구 검색 >>");
            String searchKey = scanner.next();
            if(searchKey.equals("그만")) {
                break;
            }

            if(hashMap.containsKey(searchKey)) {
                System.out.println(searchKey + "의 인구는 " + hashMap.get(searchKey));
            } else {
                System.out.println(searchKey + "나라는 없습니다.");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Country country = new Country();
    }
}
