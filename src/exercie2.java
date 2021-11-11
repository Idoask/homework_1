import java.util.Scanner;

public class exercie2 {
    public static void evenOrOddSum(){ //ex2
        Scanner sc=new Scanner(System.in);
        int firstNum= sc.nextInt();//collect first number
        int secondNum=sc.nextInt();//collect second number
        int sum=firstNum+secondNum;//calculate sum
        if (sum%2==0){//if even
            System.out.println("even");
        }
        else {//if odd
            System.out.println("odd");
        }
    }
}
