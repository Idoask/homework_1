import java.util.Scanner;
public class exercie6 {
    public static void main(String[] args) {
        Scanner se=new Scanner(System.in);
        System.out.println("enter first number");
        int firstNum= se.nextInt(); // first number input
        System.out.println("please enter the gpe");
        int d=se.nextInt();//gpe input
        System.out.println("amunt of number in series");
        int n=se.nextInt();//input nums
        prog(firstNum,d,n);
    }
    public static void prog(int a1,int d,int n){//ex6
        int counter=0;
        while (n>counter){
            counter=counter+1;
            System.out.print(a1+",");
            a1=a1+d;
        }
    }
}
