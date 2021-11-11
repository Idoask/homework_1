import java.util.Scanner;

public class exercie4 {
    public static void quadraticEquation(){//ex4
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a value");
        int a= sc.nextInt();//collect the first value
        System.out.println("please enter b value");
        int b= sc.nextInt();//collect second
        System.out.println("please enter c value");
        int c= sc.nextInt();//collect third
        if (b*b-4*a*c<0){ // no sol
            System.out.println("no solution");
        }
        if (b*b-4*a*c==0){ //one sol
            System.out.println("there is a single solution");
            System.out.println(-b/2*a);
        }
        if (b*b-4*a*c>0){ //two sol
            System.out.println("there are two solution");
            double sqrt=Math.sqrt(b*b-4*a*c);
            System.out.println("first solution is..");
            System.out.println(-b+sqrt/2*a);
            System.out.println("second solution is..");
            System.out.println(-b-sqrt/2*a);
        }
    }
}
