import java.util.Scanner;
public class exercie8 {
    public static void main(String[] args) {
        printTringle(choseNumber());
    }
    public static void printTringle(int num){//ex8
        for (int i = 0; i <num ; i++) {
            for (int j = i; j >=0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static int choseNumber(){
        Scanner se=new Scanner(System.in);
        int num=se.nextInt();
        while (num<5 || num>20){
            num=se.nextInt();
        }
        return num;
    }
}
