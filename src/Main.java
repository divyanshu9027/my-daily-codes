import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER THE STRING");
        String a=scanner.nextLine();
        int b;
        System.out.println("ENTER THE INTEGER TYPE VALUE");
        b=scanner.nextInt();
        int length=a.length();
        if(length==b) {
            System.out.println("HELLO MY LOVE");
        }
        else {
            System.out.println("HELLO MY HATE");
        }


    }
}
