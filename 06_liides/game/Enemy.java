package game;

public class Enemy extends Character implements WorldObject {
    int coordinateY;
    int coordinateX;

    public Enemy(int worldHeight, int worldWidth) {
        super(worldHeight, worldWidth);
    }


}
