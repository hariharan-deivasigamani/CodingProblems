import java.util.Scanner;

class AreaAndCircum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter a Value R:");
        int r= sc.nextInt();
        double result = Area(r);
        double result1 = Circum(r);
            System.out.print("The Area and Circumfrence of cricle:"+result +" and : " +result1);
    }
    public static double Circum(int r){
            return (2 * 3.14 * r); 
    }
    public static double Area(int r){
            return (3.14 * r * r); 
    }
}