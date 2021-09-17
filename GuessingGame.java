/** 
 * GuessingGame
 * @author Han Kang
 * @id 1712993
 * @author Konstantin Stoyanov
 * @id 1677543
 * @date 21/09/2021
 */
import java.util.*; 

class GuessingGameBasic{

    Scanner scan = new Scanner(System.in);
    Random randomGenerator;

    public void run(){
    System.out.println("Do you want to enter the secret code yourself?")
    
    String answer;
    int integer;
    int y;
    answer = scan.next();
    int y = scan.nextInt();
    int integer = scan.nextInt();
    
    if (answer.equals("yes")) {
        System.out.println("Secretly type the code")
        int integer = scan.nextInt();
        System.out.println("Start guessing!");

    } 
    else if (answer.equals("no")) {
        System.out.println("Type an arbitrary number")
    }
    }
    
    public static void main(String[] args){
        (new GuessingGameBasic()).run();
    }
}