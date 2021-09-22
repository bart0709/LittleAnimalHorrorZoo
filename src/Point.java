/**represents the animal as a pair of coordinates*/
public class Point {
    int x;
    int y;
    int old_x;
    int old_y;
    int priority;
    String name;

    public Point(String name, int initialX, int initialY) { // this will default priority to 0
        this(name, initialX, initialY, 0);
    }
    public Point(String name, int initialX, int initialY, int priority) {
        x = initialX;
        y = initialY;
        old_x = x;
        old_y = y;
        this.name = name; 
        this.priority = priority; 
    }

    /**prints the point's name and coordinates*/
    public void print() {
        System.out.println(name + " - " + this.toString() + "\n");
    }

    /**shifts this point's location by the given amount*/
    public void move(int dx, int dy) {
        old_x = x;
        old_y = y;
        x += dx;
        y += dy;
    }

    /**returns a String representation of this Point*/
    public String toString() {
        return "("+ x + ", " + y + ")";
    }

    /**returns the distance between two points*/
    public double distanceFromPoint(Point secondPoint) {
        return Math.sqrt(Math.pow(this.x - secondPoint.x, 2) + Math.pow(this.y - secondPoint.y, 2)); // simple Pythagoras formula
    }
}