import java.util.Scanner;

public class exercie10 {
    public static void main(String[] args) {
        guessNumber();
    }
    public static void guessNumber() {//ex10
        Scanner se = new Scanner(System.in);
        int counter = 1;
        int cout = 1;
        double number = (Math.random() * 1000);//the compter chose a random number
        int casted = (int) number;//convert the compter number into int
        System.out.println("enter the first user guess");
        int user1 = se.nextInt();//collect first
        System.out.println("enter the second user guess");
        int user2 = se.nextInt();//collect second value
        while (user1 != casted && user2 != casted) {//if first user guess  and second user guess are not true then enter the loop if one is true then  exit
            counter = counter + 1;//add to the amount of guess for the first user
            cout = cout + 1;//add to the amount of guess for the second user
            if (casted < user1) {//if the first user guess is smaller then the compter number
                System.out.println("the first user number is smaller then the compter number try another number");
                counter =counter+1;//add to the amount of guess for the first user
                user1 = se.nextInt();//ask the first user for another number
                if (user1==casted){//if it true then exit this loop and go to the total
                    break;
                }
            }
            if (casted > user1) {//if the first user guess is higher then the compter number
                System.out.println("the first user number is higher then the compter number try another number");
                counter = counter+1;//add to the amount of guess for the first user
                user1 = se.nextInt();//ask the first user for another number
                if (user1==casted){//if it true then exit this loop and go to the total
                    break;
                }
            }
            if (casted < user2) {//if the second user guess is smaller then the compter number
                System.out.println("the second user number is smaller then the compter number try another number");
                cout = cout+1;//add to the amount of guess for the second user
                user2 = se.nextInt();//ask the second user for another number
                if (user2==casted){//if it true then exit this loop and go to the total
                    break;
                }
            }
            if (casted > user2) {//if the second user guess is higher then the compter number
                System.out.println("the second user number is higher  then the compter number try another number");
                cout = cout + 1;//add to the amount of guess for the second user
                user2 = se.nextInt();//ask the second user for another number
                if (user2==casted){//if it true then exit this loop and go to the total
                    break;
                }
            }
        }
        if (user1 == casted){//print the total of tries of the first user until he guess the right answer
            System.out.println("the first user win after" + counter + "times");
        }
        if (user2 == casted){//print the total of tries of the second user until he guess the right answer
            System.out.println("the second user win after" + cout + "times");
        }
    }
}
