package FunctionalPrograms;

public class WindChill {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide two double command-line arguments: t (temperature in Fahrenheit) and v (wind speed in miles per hour).");
            return;
        }

        try {
            double t = Double.parseDouble(args[0]);
            double v = Double.parseDouble(args[1]);

            if (Math.abs(t) > 50 || v > 120 || v < 3) {
                System.out.println("The values are out of the valid range. Ensure that |t| <= 50, 3 <= v <= 120");
                return;
            }
            double windChill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);

            System.out.println("The wind chill is: " + windChill);
        } catch (NumberFormatException e) {
            System.out.println("Both arguments should be valid double values.");
        }
    }
}

