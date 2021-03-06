package game;

import gameoflife.Simulator;

public class Main {

    public static void main(String[] args) {
        PersonalBoard board = new PersonalBoard(200, 180);
        board.initiateRandomCells(0.05);

        Simulator simulator = new Simulator(board);
        simulator.simulate();
    }
}