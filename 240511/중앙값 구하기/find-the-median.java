import java.util.Arrays;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            String arr[] = str.split(" ");
            int narr[] = new int[3];
            for(int i=0; i<3; i++){
                narr[i] = Integer.parseInt(arr[i]);
            }

            Arrays.sort(narr);
            System.out.println(narr[1]);
        }
    }