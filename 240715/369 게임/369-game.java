import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            if(i%3==0){
                System.out.print(0+" ");
            }else if(Integer.toString(i).indexOf("3")!=-1){
                System.out.print(0+" ");
            }else if(Integer.toString(i).indexOf("6")!=-1){
                System.out.print(0+" ");
            }else if(Integer.toString(i).indexOf("9")!=-1){
                System.out.print(0+" ");
            }else{
                System.out.print(i+" ");
            }
        }
    }
}