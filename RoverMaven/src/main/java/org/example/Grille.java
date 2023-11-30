package org.example;

import java.util.ArrayList;
import java.util.List;

class Grille {
    private List<Obstacle> obstacles = new ArrayList<>();

    // Ajouter un obstacle à la grille
    public void ajouterObstacle(Position position) {
        obstacles.add(new Obstacle(position));
    }

    // Vérifier si une position contient un obstacle
    public boolean contientObstacle(Position position) {
        for (Obstacle obstacle : obstacles) {
            if (obstacle.getX() == position.getX() && obstacle.getY() == position.getY()) {
                return true;
            }
        }
        return false;
    }
}
