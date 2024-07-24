import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int q=n; q>=i; q--){
                for(int j=n; j>=i; j--){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }


    }
}