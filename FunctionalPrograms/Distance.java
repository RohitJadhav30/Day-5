package FunctionalPrograms;

public class Distance {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two integer arguments: x and y.");
            return;
        }

        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            double distance = calculateDistance(x, y);
            System.out.println("The Euclidean distance from the point (" + x + ", " + y + ") to the origin (0, 0) is " + distance);
        } catch (NumberFormatException e) {
            System.out.println("Both arguments should be integers.");
        }
    }

    public static double calculateDistance(int x, int y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}

