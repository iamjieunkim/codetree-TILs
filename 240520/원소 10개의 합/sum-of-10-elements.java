import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        int sum[] = new int[arr.length];
        for(int i=0; i< arr.length; i++){
            sum[i] = Integer.parseInt(arr[i]);
        }
        int answer = 0;

        for(int i : sum){
            answer+=i;
        }
        System.out.println(answer);
    }
}