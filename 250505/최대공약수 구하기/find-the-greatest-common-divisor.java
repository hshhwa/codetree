import java.util.Scanner;

public class Main {

    public static void answer(int n, int m) {
        for(int i = n; i > 0; i--) {
            if(n % i == 0 && m % i == 0) {
                System.out.print(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        answer(n,m);
    }
}