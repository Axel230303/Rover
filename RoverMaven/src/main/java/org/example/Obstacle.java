package org.example;

public class Obstacle {
    private Position position;
    public Obstacle(Position position) {
        this.position = position;
    }

    public int getX() {
        return position.getX();
    }

    public int getY() {
        return position.getY();
    }
}
