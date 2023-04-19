import java.util.Scanner;

class ProductOfNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = mul(a,b);
            System.out.print("The Multiplication of two number A: "+a +" and B: "+b +" is: "+result);
    }
    public static int mul(int a,int b){
            return a*b; 
    }
}