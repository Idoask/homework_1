import java.util.Scanner;
public class exercie9 {
    public static void main(String[] args) {
        int x=ifpostive();
        for (int i = 2; i<x ; i++) {
            if (isprime(x)){
                System.out.println(x);
            }
        }
    }
    public static int ifpostive(){//ex9
        Scanner se=new Scanner(System.in);
        int postive=se.nextInt();//collect value
        while (postive<0){
            System.out.println("Please enter postive number");
            postive=se.nextInt();
        }
        return postive;
    }
    public static boolean isprime(int input){
        for (int i = 2; i <=input/2 ; i++) {
            if (isDivied(input,i)){
                return false;
            }
        }
        return true;
    }
    public static boolean isDivied(int input,int input1){
        if (input%input1==0){
            return true;
        }
        return false;
    }
}
