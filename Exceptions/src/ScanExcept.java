// Listing 69
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ScanExcept {
    public static void main(String[] args) {
        // no checked exception here
        //@SuppressWarnings("resource")
        Scanner console = new Scanner(System.in);

        Scanner scfile = null;
        try {
            scfile = new Scanner(Paths.get("C:\\Users\\azima\\OneDrive\\Рабочий стол\\fileJava.txt"), "UTF-8");

            int count = 0;
            while (scfile.hasNextLine()) {
                System.out.printf("%2d: %s%n", ++count,
                        scfile.nextLine());
            }
        } catch (IOException em) {
            System.out.println("Exception: " + em);
            System.out.println("\n*** Now the stack: ***");
            em.printStackTrace();
            System.out.println("\n*** CONTINUING... ***");
        } finally {
            System.out.println("FINALLY executed");
        }

        System.out.println("\nEnter anything...");
        String s = console.next();
        System.out.println("Read from console: " + s);

        // active only when run with '-ea' option!
        // Should be used for debugging only.
        // No side effects allowed!
        assert scfile != null : "apparently no file";

        if (scfile != null) scfile.close();
    }
}
