package Homework;
import java.util.Scanner;

public class GameProcess implements DiceGame{
    String firstPlayer;
    String secondPlayer;
    int firstPlayerRes;
    int secondPlayerRes;

    public GameProcess(){
        System.out.println("Welcome to dice game");
        System.out.println("Player 1 - your name: ");
        Scanner input = new Scanner(System.in);
        this.firstPlayer = input.nextLine();
        System.out.println("Player 2 - your name: ");
        this.secondPlayer = input.nextLine();
        gameResult();
    }

    public void gameResult(){
        firstPlayerRes = random();
        secondPlayerRes = random();
        if(firstPlayerRes > secondPlayerRes){
            System.out.println(firstPlayer + " - winner");
            resultOutput();
        }
        if(firstPlayerRes < secondPlayerRes){
            System.out.println(secondPlayer + " - winner");
            resultOutput();

        }
        if(firstPlayerRes == secondPlayerRes){
            System.out.println(firstPlayer + " and " + secondPlayer +  " - draw");
            resultOutput();
        }

    }

    public void resultOutput(){
        System.out.println("Result: " + firstPlayer + " - " + firstPlayerRes + " | " + secondPlayer + " - " + secondPlayerRes);
    }

}
