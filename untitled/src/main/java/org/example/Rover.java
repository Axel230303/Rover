package org.example;

import java.util.ArrayList;

class Rover {
    private Position position;
    private Direction direction;
    private Deplacement deplacement;

    private Grille grille;

    public Rover(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }

    public void deplacer(Grille grille) {
        deplacement.deplacer(this, grille);
    }

    public void avancer(Grille grille) {
        //to do
    }

    public void reculer(Grille grille) {
        //to do
    }

    public Direction tournerDroite() {
        if (direction == Direction.E){
            direction = Direction.S;
        } else if (direction == Direction.S) {
            direction = Direction.W;
        }else if (direction == Direction.W) {

            direction = Direction.N;
        }else if (direction == Direction.N){
            direction = Direction.E;
        }
        return direction;
    }

    public Direction tournerGauche() {
        if (direction == Direction.E){
            direction = Direction.N;
        }else if (direction == Direction.S){
            direction = Direction.E;
        }else if (direction == Direction.W){
            direction = Direction.S;
        }else if (direction == Direction.N){
            direction = Direction.W;
        }
        return direction;
    }

    public void deplacement(Deplacement deplacement){

    }

    public void Instruction(ArrayList<Character> charList){
        //Pass
        for (int i = 0; i < charList.size(); i++) {
            char currentChar = charList.get(i);
            if (currentChar == 'f') {
                avancer(grille);
            }
            else if(currentChar == 'r'){
                tournerDroite();
            }
            else if (currentChar == 'l'){
                tournerGauche();
            }
            else if (currentChar == 'b'){
                reculer(grille);
            }
        }
}
}