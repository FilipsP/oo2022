package game;

// abstract - ei saa teha new Character();
public abstract class Character {
    int coordinateX;
    int coordinateY;

    public Character(int worldHeight, int worldWidth) {
        super(); // super on sama mis new Character();
        this.coordinateY = generateRandomCoordinate(worldHeight);
        this.coordinateX = generateRandomCoordinate(worldWidth);
    }

    public int generateRandomCoordinate(int worldSize) {
        return (int) ((Math.random()*(worldSize-2))+1);
    }
}
