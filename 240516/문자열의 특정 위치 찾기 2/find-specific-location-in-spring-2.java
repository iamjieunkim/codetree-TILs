import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String arr[] = {"apple", "banana", "grape", "blueberry", "orange"};
        String a = sc.next();

        int cnt = 0;
        for(int i=0; i<5; i++){
            if((arr[i].substring(2,4)).contains(a)){
                System.out.println(arr[i]);
                cnt++;
            }
        }

        System.out.println(cnt);
    }


}