import java.util.Scanner;
import java.util.Random;
public class GuessNumber {
    int n;
    public void guessNumber(){
        Random random = new Random();
        int number = random.nextInt(100)+1;
        if(n==number)
            System.out.println("Yes, you are right, I was thinking of " + number + "!");
        else System.out.println("No, the number I was thinking of was " + number + "\nYou were off by " + (number-n));

    }
    public GuessNumber(int n){
        this.n=n;
    }
}
 class Main{
     public static void main(String[] args) {
         System.out.println("I am thinking of a number between 1 and 100 (including both):");
         Scanner scanner=new Scanner(System.in);
         int num;
         System.out.println("Can you guess what it is? ");
         num=scanner.nextInt();
         GuessNumber guessNumber=new GuessNumber(num);
         guessNumber.guessNumber();


     }
}