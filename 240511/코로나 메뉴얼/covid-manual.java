import java.util.Scanner;

    public class Main {
        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;

            for(int i=0; i<3; i++){
                String str = sc.next();
                int degree = sc.nextInt();


                if(str.equals("Y") && degree>=37){
                    a++;
                } else if (str.equals("N")&&degree>=37) {
                    b++;
                } else if (str.equals("A") && degree<37) {
                    c++;
                } else {
                    d++;
                }
            }

            if(a>=2){
                System.out.println("E");
            }else{
                System.out.println("N");
            }



        }
    }