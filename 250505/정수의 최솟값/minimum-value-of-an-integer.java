import java.util.Scanner;

public class Main {

    public static int answer(int a, int b, int c) {
        if(a < b && a < c) {
          return a;  
        }
        else if(b < a && b < c) {
            return b;
        }
        else if(c < a && c < b) {
            return c;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print(answer(a,b,c));
    }
}