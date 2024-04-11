import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        // start coding here
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
        }
        System.out.println(sum);
    }
}