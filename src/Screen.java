/**display the game in console*/
public abstract class Screen {
    static byte dangerStatus;
    static int sleepTimer;

    /**clears screen*/
    public static void clear() {  // taken from the internet
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**display the program*/
    static public void display(Grid grid, Point point1, Point point2) {
        Screen.sleep(sleepTimer);
        Screen.clear();
        grid.print();
        System.out.println();
        point2.print();
        point1.print();
        switch (dangerStatus) {
            case 2:
                System.out.println("The Rabbit has been eaten!");
                break;
            case 1:
                System.out.println("The Rabbit is about to get eaten!");
                break;
            default:
                break;
        }
    }

    /**pause the program for given amount of milliseconds, used for updating display*/
    public static void sleep(int milliseconds)
    {
        try {
            Thread.sleep(milliseconds);
        } catch (Exception e) {}
    }
}
