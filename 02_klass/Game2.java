import java.util.Scanner;

    // parem klõps -> refractor -> rename
public class Game2 {
    // main --> pakub
    public static void main(String[] args) {
        // sout --> pakub

        // String -- sõnaline muutuja
        // char -- üks täht
        // double -- 15kohaline komakohaga number
        // float -- 7kohaline komakohaga number
        // int -- täiskohaline number 2.1mlj
        // byte -- 128kohta
        // short -- 32000kohta
        // long -- 9,223,372,836,854,775,807
        // boolean -- true/false


        World world = new World(5, 10);
        Player mangija1 = new Player(world.worldHeight, world.worldWidth);
        Player mangija2 = new Player(world.worldHeight,world.worldWidth);


        Enemy vaenlane1 = new Enemy(world.worldHeight, world.worldWidth);

        world.printMap(mangija1.coordinateY, mangija1.coordinateX, vaenlane1.coordinateY, vaenlane1.coordinateX);

        //klasside tegemise tund 2
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        while (!input.equals("end")) {
            mangija1.movePlayer(input,world.worldHeight,world.worldWidth);
            world.printMap(mangija1.coordinateY, mangija1.coordinateX, vaenlane1.coordinateY, vaenlane1.coordinateX);
            input = scanner.nextLine();
        }
    }



}