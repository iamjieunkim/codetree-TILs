import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = n;
        for(int i=1; i<=n; i++){
            s/=i;
            if(s>1){
                continue;
            }else{
                System.out.print(i);
                break;
            }
        }

    }
}