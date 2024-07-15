import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int n = a;
        

        while(n<b+1){
            if(n%2==1){
                System.out.print(n+" ");
                n*=2;
            }else{
                System.out.print(n+" ");
                n+=3;
            }
        }
    }
}