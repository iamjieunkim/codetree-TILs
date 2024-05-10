import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();

        int arr[] = new int[3];
        arr[0]=s1.length();
        arr[1]=s2.length();
        arr[2]=s3.length();

        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}