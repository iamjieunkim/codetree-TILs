import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean s = true;

        for(int i=a; i<=b; i++){
            if(i%c==0){
                s=false;
            }
        }

        if(s==true){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}