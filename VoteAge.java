import java.util.Scanner;

class VoteAge{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = VoteAge(a);
        if(result == 1){
            System.out.print("The Person is eligible to vote: "+a);
        }
        else{
            System.out.print("Thr Person is not elgible to vote:"+a);
        }
    }
    public static int VoteAge(int a){
        if(a>=18)
        {
            return 1;
        }
        return 0;

    }
}