import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean s = false;

        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                s=true;
            }
        }

        if(s==true){
            System.out.println("C");
        }else{
            System.out.println("N");
        }
    }
}