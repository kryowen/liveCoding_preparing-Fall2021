import java.util.*;

class RainfallAvg {
    Vector<Integer> vector;

    public RainfallAvg() {
        Scanner scanner = new Scanner(System.in);
        vector = new Vector<>();
        int input = -1, sum = 0;
        while (true) {
            System.out.print("강수량 입력: (0 입력 시, 종료) >> ");
            input = scanner.nextInt();
            if(input == 0) {
                break;
            }

            sum += input;
            vector.add(input);

            for(int i = 0; i < vector.size(); i++) {
                System.out.print(vector.get(i) + " ");
            }
            System.out.println();

            System.out.println("현재 평균: " + sum / vector.size());
        }

        scanner.close();
    }
}

public class Main {
    public static void main(String[] args) {
        RainfallAvg rainfallAvg = new RainfallAvg();
    }
}
