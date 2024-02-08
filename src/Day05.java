import java.io.IOException;

public class Day05 {
    /**
     * Solve this day's problem.
     * @param input the input for this day's problem
     * @return the solution to the problem
     */
    public static String solve(String input) {
        String solution = "";

        // Solve the problem here

        return solution;
    }

    public static void main(String[] args) {
        // Get the last two digits from thisClass's simple name as a string
        Class<?> thisClass = java.lang.invoke.MethodHandles.lookup().lookupClass();        
        String className = thisClass.getSimpleName();
        String day = className.substring(className.length() - 2);

        // Use the last two digits from the name of the class to get the input file's name
        String filename = "input" + day + ".txt";
        
        // Try to read the input file
        String input = "";
        try {
            input = Helper.readFile(filename);
        } catch (IOException e) {
            // If the file can't be read, print an error message and exit
            System.out.println("Could not read file: " + e.getMessage());
            System.exit(1);
        }

        System.out.println("Solution: [" + solve(input) + "]");
    }
}
