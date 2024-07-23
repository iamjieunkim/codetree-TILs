import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<5; i++){
            for(int j=5-i; j>0; j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }


    }
}