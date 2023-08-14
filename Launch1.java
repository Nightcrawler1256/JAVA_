import java.util.*;
class Guesser{
    int guessnum;
    int GuessingNumber(){
        System.out.println("Gusser!! kindly guess the number !! ");
        Scanner scan = new Scanner(System.in);
        guessnum=scan.nextInt();
        return guessnum;
    }

}
class Player{
    int guessnum;
    int GuessingNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Player !! Kindly guess the number");
        guessnum= scan.nextInt();
        return guessnum;

    }
}
class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
     void collectNumFromGuesser(){
         Guesser g=new Guesser();
         numFromGuesser=g.GuessingNumber();

     }
     void CollectNumFromPlayer(){
         Player p1=new Player();
         Player p2=new Player();
         Player p3=new Player();
         numFromPlayer1=p1.GuessingNumber();
         numFromPlayer2=p2.GuessingNumber();
         numFromPlayer3=p3.GuessingNumber();


     }
     void Compare(){
         if(numFromGuesser==numFromPlayer1)
         {
             System.out.println("Player 1 won the game!!");
         }
         else if(numFromGuesser==numFromPlayer2)
         {
             System.out.println("Player 2 won the game !!!");
         }
         else if (numFromGuesser==numFromPlayer3){
             System.out.println("Player 3 Won the game!!!");
         }
         else {
             System.out.println("NO one won the game !!!! ");
         }
     }
}

public class Launch1 {
    public static void main(String[] args) {
        System.out.println("Game Started!!!");
        Umpire u=new Umpire();
        u.collectNumFromGuesser();
        u.CollectNumFromPlayer();
        u.Compare();
    }
}
