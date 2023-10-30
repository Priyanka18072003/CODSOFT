//TASK 1 - NUMBER GAME
import java.util.Random;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args){
        Random rand= new Random();
        int random_num= rand.nextInt(100);
        guess(random_num);
    }
    //method for guessing the number
    public static void guess(int random_num){
        Scanner sc= new Scanner(System.in);
        System.out.println("GUESS THE NUMBER");
        System.out.println("Enter number of tries");
        int tries=sc.nextInt();
        System.out.println("Guess a number between 0-100:");
        int user_guess=sc.nextInt();
        System.out.println("");
        //if invalid number is entered
        while(user_guess<0 || user_guess>100){
            System.out.println("Guess a number between 0-100:");
            user_guess=sc.nextInt();
        }
        //checking condition
        int t=0;
        while(user_guess!=random_num){
            // limiting numbers of tries
            if(t<tries){
                t++;
                System.out.println("Wrong Guess!");
                if(user_guess < random_num){
                    System.out.println("too low...think greater number");
                }
                else{
                    System.out.println("too high...think lesser number");
                }
                System.out.println("Guess again: ");
                user_guess=sc.nextInt();
                System.out.println("");

                while(user_guess<0 || user_guess>100){
                System.out.println("Guess a number between 0-100:");
                user_guess=sc.nextInt();
                System.out.println("");}
            }
            else{
                System.out.println("Time out!!!");
                break;
            }
    }
    if(user_guess==random_num){
        System.out.println("Correct Answer!!!");
        //number of tries
        System.out.println("number of tries:"+ t);
    }
    sc.close();
}
}
