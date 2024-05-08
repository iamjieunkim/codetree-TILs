import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        if(m>=3 && m<=5){
            System.out.println("Spring");
        } else if (m>=4 && m<=8) {
            System.out.println("Summer");
        } else if (m>=9 && m<=11 ) {
            System.out.println("Fail");
        } else {
            System.out.println("Winter");
        }
    }
}