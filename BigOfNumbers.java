import java.util.*;

class BigOfNumbers{
    public static void main(String[] args ){
    Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int large = largest(a,b,c);
        int small = small(a,b,c);
        System.out.println("Biggest of 3 number is:"+large);
        System.out.print("Biggest of 3 number is:"+small);
   }

     public static int largest( int a, int b, int c){
            if(a>b && a>c)
            {
                return a;
            }else if(b>a && b>c){
                return b;
            }else if(c>a && c>b){
                return c;
            }else{
                return 0;
            }

        }
        

        public static int small( int a, int b, int c){
            if(a<b && a<c)
            {
                return a;
            }
            else if(b<a && b<c)
            {
                return b;
            }
            else if(c<a && c<b){
                return c;
            }
            else{
                return 0;
            }

        }
 
}