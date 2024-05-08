import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int age1 = sc.nextInt();
        String m1 = sc.next();
        int age2 = sc.nextInt();
        String m2 = sc.next();

        if(age1>=19){
            if(m1.charAt(0)=='M'){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }else if(age2>=19){
            if(m2.charAt(0)=='M'){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }

        

    }
}