import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n[] = new int[10];
        for(int i=0; i<10; i++){
            n[i]=sc.nextInt();
        }
        
        int sum =0;
        
        for(int i=0; i<10; i++){
            sum+=n[i];
        }

        System.out.println(sum);



    }
}