public class Run {
    static Point Snake = new Point("Snake", 9, 9, 1); // 1st level of priority, 1 > 0
    static Point Rabbit = new Point("RABBIT", 0, 0); // default priority = 0
    static Grid Axis = new Grid();

    public static void main(String[] args) {
        Screen.clear();
        Axis.addPoint(Snake, 'S');
        Axis.addPoint(Rabbit, 'R');
        Screen.sleepTimer = 1500; // change it to make the game's turns longer

        while (!measureDanger()) { // as long as rabbit is alive the game continues
            Screen.display(Axis, Snake, Rabbit);
            Rabbit.move(1, 1);
            Axis.movePoint(Rabbit, Snake);
            if (measureDanger()) { // check after rabbit's move to see if he's still alive
                break;
            }
            Screen.display(Axis, Snake, Rabbit);
            Snake.move(-1, -1);
            Axis.movePoint(Snake, Rabbit);
        }
        Screen.display(Axis, Snake, Rabbit);
    }

    /**checks if the Rabbit is dead, in danger, or safe; true if dead, else false, sets dangerStatus in Screen to make display() show danger messages */
    static public boolean measureDanger() {
        if (Rabbit.distanceFromPoint(Snake) == 0) {
            Screen.dangerStatus = 2;
            return true;
        }
        else if (Rabbit.distanceFromPoint(Snake) <= 1.42) { // ~1.41 = sqrt(2)
            Screen.dangerStatus = 1;
        }
        return false;
    }
}