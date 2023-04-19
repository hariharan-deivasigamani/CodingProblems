import java.util.Scanner;

class OddOrEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = OddorEven(a);
        if(result == 1){
            System.out.print("The given number is Even: "+a);
        }
        else{
            System.out.print("The given number is Odd: "+a);
        }
    }
    public static int OddorEven(int a){
        if(a%2==0)
        {
            return 1;
        }
        return 0;

    }
}