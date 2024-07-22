import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int row = sc.nextInt();
            int height = sc.nextInt();
            String c = sc.next();

            System.out.println(row*height);

            if(c.equals("C")){
                break;
            }
        }
    }
}