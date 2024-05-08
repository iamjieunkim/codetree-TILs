import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        String m1 = sc.next();
        int n2 = sc.nextInt();
        String m2 = sc.next();

        if((m1.charAt(0)=='M'&&n1>=19)||(m2.charAt(0)=='M'&&n2>=19)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}