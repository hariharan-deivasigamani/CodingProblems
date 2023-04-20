import java.util.*;

class StudentMark{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of subject:");
        int n = sc.nextInt();
        
        int count =0;
        System.out.println("Enter no of marks in: "+n+" Subjects");
        for(int i=0;i<n;i++){
            count += sc.nextInt();
        }
        System.out.println("COUNT TOTL MARK:"+ count);

        int result = percentage(count,n);

        if(result>=91){
            System.out.println("AA Grade");
        }else if((81 >= result) && (result<= 90)){
            System.out.println("AB Grade");
        }else if((71 >= result) && (result<= 80)){
            System.out.println("BB Grade");
        }else if((61 >= result) && (result<= 70)){
            System.out.println("BC Grade");
        }else if((51 >= result) && (result<= 60)){
            System.out.println("CD Grade");
        }else if((4 >= result) && (result<= 50)){
            System.out.println("DD Grade");
        }else if((result <= 40)){
            System.out.println("FAIL");
        }
    }

    public static int percentage(int count,int n){
        float formula = ((count/n)*100)/100; //(count/n);
        System.out.println(formula);
        return (int)formula;
    }
}

// ((count/n)*100)/100;