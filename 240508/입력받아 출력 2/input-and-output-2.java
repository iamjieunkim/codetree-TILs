import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        int birth = sc.nextInt();
        int ssn = sc.nextInt();
        System.out.printf("%d%d",birth,ssn);

    }
}