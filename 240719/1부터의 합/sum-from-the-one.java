import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i=1; i<=100; i++){
            sum+=i;
            if(sum>=5){
                System.out.println(i);
                break;
            }
        }
    }
}