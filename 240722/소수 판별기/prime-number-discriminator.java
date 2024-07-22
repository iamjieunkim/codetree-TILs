import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean s = true;

        for(int i=2; i<n; i++){
            if(n%i==0){
                s=false;
            }
        }

        if(s==true){
            System.out.println("P");
        }else{
            System.out.println("C");
        }
    }
}