import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String a1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();

        int min = a1.length();
        if(s2.length()<s3.length()){
            if(min>s2.length()){
                min=s2.length();
            }
        }else{
            if(min>s3.length()){
                min=s3.length();
            }
        }
        System.out.println(min);
    }
}