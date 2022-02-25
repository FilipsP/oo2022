import java.util.Arrays;
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
        Player mangija1 = new Player(world.height, world.width);
        Player mangija2 = new Player(world.height,world.width);
        Enemy vaenlane1 = new Enemy(world.height, world.width);
        Item sword = new Item(world.height, world.width, ItemType.SWORD);
        Item hammer = new Item(world.height, world.width, ItemType.HAMMER);
        Item dagger = new Item(world.height, world.width, ItemType.DAGGER);
        world.items = Arrays.asList(sword,hammer,dagger);

        world.printMap(mangija1.coordinateY, mangija1.coordinateX, vaenlane1.coordinateY, vaenlane1.coordinateX);

        //klasside tegemise tund 2
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        while (!input.equals("end")) {
            mangija1.movePlayer(input,world.height,world.width);
            for (Item item:world.items){
                if (item.coordinateX == mangija1.coordinateX && item.coordinateY == mangija1.coordinateY){
                    mangija1.addItem(item);
                }
            }
            world.printMap(mangija1.coordinateY, mangija1.coordinateX, vaenlane1.coordinateY, vaenlane1.coordinateX);
            input = scanner.nextLine();
        }
    }



}