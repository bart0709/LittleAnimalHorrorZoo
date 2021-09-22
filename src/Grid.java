/**holds 2d array representarion of the grid on which animals move*/
public class Grid {
    char[][] grid  = new char[10][10];

    public Grid() {  // constructor fills the grid array with "+" symbol
        for (char y = 0; y < grid.length; y++) {
            for (char x = 0; x < grid.length; x++) {
                grid[y][x] = '+';
            }
        }
    }

    /**displays the graph*/
    public void print() {
        for (int y = 0; y < grid.length; y++) {
            System.out.printf("%d ", grid.length-1-y); // printing vertical numbers
            for (int x = 0; x < grid.length; x++) { // grid is square, so we can use grid.length since it's the same
                System.out.printf("%c ",grid[y][x]);
            }
            System.out.println("");
        }
        System.out.printf("X ");
        for (int x = 1; x < grid.length+1; x++) { // printing horizontal numbers
            System.out.printf("%d ", x-1);
        }
        System.out.println("");
    }

    /**adds point to the grid*/
    public void addPoint(Point point, char symbol) {
        grid[grid.length -1 - point.y][point.x] = symbol;
    }

    /**removes point from the grid*/
    public void removePoint(Point point) {
        grid[grid.length - 1 - point.y][point.x] = '+';
    }

    /**changes point's location on the grid*/
    public void movePoint(Point mainPoint, Point secondaryPoint) {
        char symbol = grid[grid.length - 1 - mainPoint.old_y][mainPoint.old_x]; // saving the point's symbol
        grid[grid.length - 1 - mainPoint.old_y][mainPoint.old_x] = '+'; // resetting the old location
        if (grid[grid.length - 1 - mainPoint.y][mainPoint.x] == '+' || checkPriority(mainPoint, secondaryPoint)) { // checks if location is empty or if higher priority point is there
            this.addPoint(mainPoint, symbol);
        }
    }

    /**checks if point is higher priority*/
    public static boolean checkPriority(Point point1, Point point2) {
        if (point1.priority >= point2.priority) {
            return true;
        }
        return false;
    }
}