import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = sc.nextLine();

        str = str.replaceAll(" ", "");
        s = s.replaceAll(" ", "");
        System.out.println(str.concat(s));
    }
}