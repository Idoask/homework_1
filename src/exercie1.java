import java.util.Scanner;

public class exercie1 {
    public static void absolutenValue (){ //ex1
        Scanner sc=new Scanner(System.in);
//        Math.abs()
        int input= sc.nextInt(); //collect number
        if (input>=0){//case 1 : greater than zero
            System.out.println(input);
        }
        else { // case 2: smaller then zero
            input =input*-1;
            System.out.println(input);
        }
    }
}
