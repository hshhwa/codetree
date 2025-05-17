import java.util.Scanner;
public class Main {

    public static void answer(int a, int b) {
        boolean[] check = new boolean[101];
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            check[i] = true;
        }
        check[0] = false;
        check[1] = false;


        for (int i = 2; i * i <= 100; i++) {
            if (check[i]) {
                for (int j = i * i; j <= 100; j += i) {
                    check[j] = false;
                }
            }
        }
        
        for(int i = a; i <= b; i++) {
            if(check[i]) {
                int num = i;
                int sum = 0;
                while(num != 0) {
                    sum += num % 10;
                    num = num / 10;
                }
                if(sum % 2 == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        answer(a,b);
    }
}