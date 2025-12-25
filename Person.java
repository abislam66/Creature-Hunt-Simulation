package edu.temple.datastructures.dyee.oop.assignment.episode1;

public class Person extends Creature {

    private int currentDirection;

    public Person(Model model, int row, int column) {
        super(model, row, column);
        currentDirection = Model.random(Model.MIN_DIRECTION, Model.MAX_DIRECTION);
    }

    // if we see a monster, run opposite; otherwise keep going or find a clear way.
    int decideMove() {

        // 1) Look in all directions for a monster
        for (int i = Model.MIN_DIRECTION; i <= Model.MAX_DIRECTION; i++) {
            if (look(i) == Model.MONSTER) {
                int away = Model.turn(i, 2);  // 4 quarter-turns = opposite direction as it has 8 directions to move to
                if (canMove(away)) {
                    currentDirection = away;
                    return away;
                } else if (canMove(Model.turn(away, 1))) {
                    currentDirection = Model.turn(away, 1);
                    return currentDirection;
                } else if (canMove(Model.turn(away, -1))) {
                    currentDirection = Model.turn(away, -1);
                    return currentDirection;
                }
                // If all three blocked, fall through to general movement below.
            }
        }

        // 2) No monster seen keep moving / find a path
        if (canMove(currentDirection)) {
            return currentDirection;
        } else if (canMove(Model.turn(currentDirection, 1))) {
            currentDirection = Model.turn(currentDirection, 1);
            return currentDirection;
        } else if (canMove(Model.turn(currentDirection, -1))) {
            currentDirection = Model.turn(currentDirection, -1);
            return currentDirection;
        } else {
            // Pick a new direction and try up to 8 options
            currentDirection = Model.random(Model.MIN_DIRECTION, Model.MAX_DIRECTION);
            for (int i = 0; i < 8; i++) {
                if (canMove(currentDirection)) return currentDirection;
                currentDirection = Model.turn(currentDirection, 1);
            }
        }

        return Model.STAY; // truly stuck
    }

    public static String getName() { return "Person"; }
}
