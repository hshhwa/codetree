import java.util.Scanner;
public class Main {

    public static void answerMethod(int N) {
        int num = 1;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                System.out.print(num + " ");
                num++;
                if(num > 9) {
                    num = 1;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        answerMethod(n);
    }
}