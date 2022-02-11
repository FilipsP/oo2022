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

        char symbol; //deklareerib 1x kord muutuja, mitte iga kord deklareerib
        // fori --> pakub
        for (int y = 0; y < worldHeight; y++) {
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight - 1){ // primitiiv || andmebaasipäring
                    symbol = '-';
                    System.out.print(symbol);
                }else if(x == 0 || x == worldWidth - 1){
                    symbol = '|';
                    System.out.print(symbol);
                }else {
                    symbol = ' ';
                    System.out.print(symbol);
                }
            }
            System.out.println();
        }
    }
}