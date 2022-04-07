package Homework;

public interface DiceGame {

    default int random() {
        int max = 6;
        int min = 1;
        int range = max - min + 1;
        return (int)(Math.random() * range) + min;
    }

}
