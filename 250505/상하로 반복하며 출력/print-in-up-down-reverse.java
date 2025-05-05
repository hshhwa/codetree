import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int numLeft = 1;
        int numRight = N;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                int printNum = 0;
                if(j % 2 != 0) {
                    printNum = numRight;
                }
                else {
                    printNum = numLeft;
                }
                System.out.print(printNum);
            }
            numLeft++;
            numRight--;
            System.out.printf("\n");
        }
    }
}