import java.util.Scanner;
public class Main {

    public static void answer(int a, int b) {

        int num = a;
        int count = 0;

        while(num <= b) {
            if(num % 3 == 0) {
                count++;
                num++;
                continue;
            }

            int tmpNum = num;
            boolean flag = false;
            while(tmpNum != 0) {
                int check = tmpNum % 10;
                if(check == 3 || check == 6 || check == 9) {
                    flag = true;
                    break;
                }
                tmpNum = tmpNum / 10;
            }
            if(flag) {
                count++;
            }
            num++;    
        }
        System.out.print(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        answer(A,B);
    }
}