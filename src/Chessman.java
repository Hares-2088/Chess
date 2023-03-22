public abstract class Chessman {
    private int positionX;
    private int positionY;
    private boolean alive;
    private String color;
    private String name;

    public Chessman(int positionX, int positionY, boolean alive, String color, String name) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.alive = alive;
        this.color = color;
        this.name = name;
    }
    public Chessman(){

    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Chessman{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                ", alive=" + alive +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
