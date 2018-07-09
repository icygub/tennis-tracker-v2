package cs295capstone.tennistracker.models;

import java.util.ArrayList;

public class Game {

    private int[] score;
    private ArrayList<Point> points;
    private Point currentPoint;
    private boolean player1IsServing;

    public Game(boolean player1IsServing) {
        this.score = new int[2];
        this.player1IsServing = player1IsServing;
        this.points = new ArrayList<>();
    }

    public void startNewPoint() {
        Point point = new Point();
        currentPoint = point;
        points.add(point);
    }

    public void ace() {

    }
}
