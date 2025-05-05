import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int num = 1;

        for(int i = 1; i <= N; i++) {
            for(int j = 0; j < N; j++) {
                System.out.print(num);
                if( j != N - 1) {
                    if(i % 2 == 0) {
                    num--;
                    }
                    else {
                    num++;
                    }
                }
            }
            System.out.println();
        }
    }
}