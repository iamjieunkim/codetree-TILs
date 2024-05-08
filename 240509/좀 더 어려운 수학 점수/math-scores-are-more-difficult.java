import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int ma = sc.nextInt();
        int ea = sc.nextInt();
        int mb = sc.nextInt();
        int eb = sc.nextInt();
        
        if(ma>mb){
            System.out.println("A");
        } else if (ma<mb) {
            System.out.println("B");
        } else{
            if(ea>eb){
                System.out.println("A");
            }else{
                System.out.println("B");
            }
        }
    }
}