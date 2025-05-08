import java.util.Scanner;

public class Main {

    public static void answer(int y) {
        boolean check = true;
        
        if(y % 4 != 0) {
            check = false;
        }
        else if(y % 100 == 0 && y % 400 != 0) {
            check = false;
        }

        System.out.print(check);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        answer(y);
    }
}