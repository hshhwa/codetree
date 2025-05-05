import java.util.Scanner;

public class Main {

    public static void printMathod(int N) {
        String word = "12345^&*()_";

        for(int i = 0; i < N; i++) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        printMathod(n);
    }
}