import java.lang.reflect.Array;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=1; i<=a; i++){
            int s = i/8;
            if(i%2==0 && i%4!=0){
                continue;
            }else if(s%2==0){
                continue;
            }else if((i%7)<4){
                continue;
            }

            arr.add(i);


        }


        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}