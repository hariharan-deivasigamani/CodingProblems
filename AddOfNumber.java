import java.util.Scanner;

class AddOfNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = add(a,b);
            System.out.print("The Addition of two number A: "+a +" and B: "+b +" is: "+result);
    }
    public static int add(int a,int b){
            return a+b; 
    }
}