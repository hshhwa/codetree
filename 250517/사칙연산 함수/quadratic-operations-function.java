import java.util.Scanner;
public class Main {


    public static void answer(int a, char o, int c) {
        int num = 0;
        boolean flag = true;

        switch(o) {
            case '+' :
                num = a + c;
                break;
            case '-' :
                num = a - c;
                break;
            case '/' :
                num = a / c;
                break; 
            case '*' :
                num = a * c;
                break;
            default:
                System.out.println("False");
                flag = false;
                break; 
        }
        if(flag) {
            System.out.println(a + " " + o + " " + c + " = " + num);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        answer(a,o,c);
    }
}