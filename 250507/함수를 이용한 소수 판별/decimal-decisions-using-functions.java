import java.util.Scanner;
import java.util.*;

public class Main {

    public static void answer(int a, int b) {
        boolean[] check = new boolean[b + 1];
        Arrays.fill(check,true);
        check[0] = false;
        check[1] = false;

        for(int i = 2; i * i <= b; i++) {
            if(check[i]) {
                for(int j = i * i; j <= b; j += i) {
                    check[j] = false;
                }
            }
        }

        int sum = 0;
        for(int i = a; i <= b; i++) {
            if(check[i]) {
                sum += i;
            }
        }
        System.out.print(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        answer(a,b);
    }
}