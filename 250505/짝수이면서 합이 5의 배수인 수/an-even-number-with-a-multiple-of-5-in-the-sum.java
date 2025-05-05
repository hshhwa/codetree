import java.util.Scanner;
public class Main {

    public static void answer(int n) {

        int checkNum = 0;
        checkNum += n % 10;
        checkNum += n / 10;
        if(n % 2 == 0 && checkNum % 5 == 0) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        answer(n);
    }
}