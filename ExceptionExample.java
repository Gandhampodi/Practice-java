import java.util.Scanner;

public class ExceptionExample {
    public static void main(String agr[]) {
        int num1;
        int num2;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter num1");
        num1=in.nextInt();
        System.out.println("Enter num2");
        num2= in.nextInt();

        System.out.println(num1+ num2);
    }


}
