import java.util.*;

class PrimeNumber{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        
            if(p>=1){
                boolean result = prime(p);
                if(!result){
                    System.out.print("This is a prime number:"+p);
                }
                else    
                    System.out.print("This is Not a prime number:"+p);
            }else{
        System.out.print("Enter the number greater than 1");
     }
    }
    public static boolean prime(int p){
        for(int i=0;i<p/2;i++){
            if(p%2 == 0){
              return true;
            }   
        }
        return false;
    }

}