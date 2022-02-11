import java.util.Scanner;

public class Game {
    // main --> pakub
    public static void main(String[] args) {
        // sout --> pakub
        System.out.println("Hello world");
        // String -- sõnaline muutuja
        // char -- üks täht
        // double -- 15kohaline komakohaga number
        // float -- 7kohaline komakohaga number
        // int -- täiskohaline number 2.1mlj
        // byte -- 128kohta
        // short -- 32000kohta
        // long -- 9,223,372,836,854,775,807
        // boolean -- true/false
        int worldHeight = 5;
        int worldWidth = 10;
        int playerCoordinateY = generateRandomCoordinate(worldHeight);
        int playerCoordinateX = generateRandomCoordinate(worldWidth);
        int enemyCoordinateY = generateRandomCoordinate(worldHeight);
        int enemyCoordinateX = generateRandomCoordinate(worldWidth);

        //klasside tegemise tund 2
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        while (!input.equals("end")) {
            //kontrollib ühte muutujat mingite väärtuste vastu
            switch (input){

                case "a" -> playerCoordinateX--;
                case "s" -> playerCoordinateY++;
                case "d" -> playerCoordinateX++;
                case "w" -> playerCoordinateY--;
            }
            printMap(worldHeight, worldWidth, playerCoordinateX, playerCoordinateY, enemyCoordinateX, enemyCoordinateY);
            input = scanner.nextLine();
        }
    }

    public static int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random() * (worldSize - 2)) + 1;
    }

    public static void printMap(int worldHeight, int worldWidth, int playerCoordinateX, int playerCoordinateY, int enemyCoordinateX, int enemyCoordinateY){
        char symbol; //deklareerib 1x kord muutuja, mitte iga kord deklareerib
        // fori --> pakub
        for (int y = 0; y < worldHeight; y++) {
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight - 1){ // primitiiv || andmebaasipäring
                    symbol = '-';
                }else if(x == 0 || x == worldWidth - 1){
                    symbol = '|';
                }else {
                    symbol = ' ';
                }
                if(playerCoordinateY == y && playerCoordinateX == x){
                    symbol = 'x';
                }
                if(enemyCoordinateY == y && enemyCoordinateX == x){
                    symbol = 'o';
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

}