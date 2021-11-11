import java.util.Scanner;
public class exercie5 {
    public static void main(String[] args) {
                Scanner se=new Scanner(System.in);
        System.out.println("which worker are you 0 for beginner 1 for senior");
        int type= se.nextInt(); // type input
        System.out.println("how many hours you been working");
        int hours=se.nextInt();//hours input
        System.out.println("how many day you reach you goal");
        int days=se.nextInt();//days input
        workerPaymant(type,hours,days);
    }

    public static void workerPaymant (int type,int hour,int days){//ex5
        int sum=0;
        if (type==0){//case1
            sum=hour*50;
            sum=sum+days*250;//caluting wage
            System.out.println(sum);
        }
        if (type==1){//case2
            sum=hour*200;//caluting wage
            sum=sum+days*250;//caluting bonuse
        }
        System.out.println(sum);
    }
}
