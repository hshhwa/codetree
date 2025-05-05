import java.util.Scanner;

public class Main {

    public static void answer(int n, int m) {
    
        int numA = n;
        int numB = m;

        while(true) {
            if(numA > numB) {
                numB += m;
            }
            else if(numA < numB) {
                numA += n;
            }
            else if(numA == numB) {
                System.out.print(numA);
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