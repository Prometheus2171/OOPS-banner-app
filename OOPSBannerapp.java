/**
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Store banner lines inside a String array
        String[] banner = {
            " ***     ***     ******     ***** ",
            "**   **  **   **  **   **    **   **",
            "**   **  **   **  **   **    **   **",
            "**   **  **   **  ******     ***** ",
            "**   **  **   **  **         **   **",
            "**   **  **   **  **         **   **",
            " ***     ***     **         ***** "
        };

        // Print using loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
