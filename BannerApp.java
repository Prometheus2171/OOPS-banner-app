import java.util.HashMap;

public class BannerApp {

    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        displayBanner("SOS", charMap);
    }

    /**
     * Initializes a HashMap where each character is mapped 
     * to its corresponding ASCII pattern.
     */
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();

        // Populate with patterns for 'S' and 'O'
        charMap.put('S', new String[]{
            "  OOOO ", " O     ", "  OOO  ", "     O ", " OOOO  "
        });
        charMap.put('O', new String[]{
            "  OOO  ", " O   O ", " O   O ", " O   O ", "  OOO  "
        });
        // Adding a space pattern for safety
        charMap.put(' ', new String[]{
            "       ", "       ", "       ", "       ", "       "
        });

        return charMap;
    }

    /**
     * Renders the banner by looping through each row of the pattern height.
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        int patternHeight = 5;

        // Loop through each line (row) of the ASCII art
        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder();

            // Assemble the current row for every character in the message
            for (char ch : message.toUpperCase().toCharArray()) {
                // retrieve pattern from map; default to space if char not found
                String[] pattern = charMap.getOrDefault(ch, charMap.get(' '));
                sb.append(pattern[line]).append("  "); 
            }
            
            // Print the completed horizontal line
            System.out.println(sb.toString());
        }
    }
}