import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 2;
        int cnt = 0;

        for(int i=1; i<n; i++){
            if(n==Math.pow(s,i)){
                cnt = i;
                break;
            }
        }
        System.out.println(cnt);


    }
}