import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        boolean s = true;
        
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
            if(arr[i]%3!=0){
                s=false;
            }
        }
        
        
        if(s==true){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
        
    }
}