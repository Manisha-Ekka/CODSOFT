import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();

        //specifications declaration
        int lRange=1, hRange=100, maxAttempts=5, score=0;

        System.out.println("Hello and WELCOME....Let us check whether you can guess the number!!");
        do{
            int target= rand.nextInt(hRange - lRange + 1) + lRange;
            int attempts=0;
            while(attempts<maxAttempts){
                System.out.print("\nAttempt " + (attempts+1)+"/5");
                System.out.println("\nEnter your guess: ");
                int guess= sc.nextInt();
                sc.nextLine();

                if(guess== target){
                    System.out.println("HURRAYYYYY! "+ target+" is the right guess");
                    score++;
                    break;
                }
                else if(guess< target){
                    System.out.println("Too low! Go higher");
                }
                else{
                    System.out.println("Too high! Go lower");
                }
                attempts++;
            }

            if(attempts==maxAttempts){
                System.out.println("Sorry! The number of attempts have been fulfilled. \nThe correct number is "+target);
            }

            System.out.println("Do you want to play for one more round? (y/n):");
        }while(sc.nextLine().equalsIgnoreCase("y"));

        System.out.println("Thank you for playing. Your score is: "+score);
        sc.close();

        
    }

    
}
