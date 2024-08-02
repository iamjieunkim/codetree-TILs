import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=n; i>0; i--){
            for(int q=0; q<n-i; q++){
                System.out.print("  ");
            }
            for(int j=0; j<2*i-1; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        for(int i=1; i<=n-1; i++){
            for(int q=0; q<n-i-1; q++){
                if(i==n-1){
                    break;
                }
                System.out.print("  ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }



    }
}