import java.util.Scanner;
public class exercie7 {
    public static void createAppointment(){//ex7
        System.out.println("in which day you like to come");
        Scanner se=new Scanner(System.in);
        int day=se.nextInt();
        if (day>7 ||day<1){
            System.out.println("invalid day");
            return;
        }
        if (day>5){
            System.out.println("we are close");
            return;
        }
        System.out.println("which hour is the earliest you can come");
        int early=se.nextInt();
        System.out.println("which hour is the latest you can come");
        int late=se.nextInt();
        if (early>late || early<0 || late>23 ||early>23 || late<0){
            System.out.println("invalid hours");
            return;
        }
        if (day!=3 && early>17 || late<9){
            System.out.println("we work from 9:00 until 17:00");
            return;
        }
        if (day==3 && early>12 || late<8){
            System.out.println("we work from 8:00 until 12:00");
            return;
        }
        System.out.println("appointmet approved");
    }
}
