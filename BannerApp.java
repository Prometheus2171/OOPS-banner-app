class CharacterPatternMap {
    char character;
    String[] pattern;

    public CharacterPatternMap(char character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    public char getCharacter() { return character; }
    public String[] getPattern() { return pattern; }
}

public class BannerApp {

    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        printMessage("OPS ", charMaps);
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] maps = new CharacterPatternMap[4];

        // Defining 5-row patterns for 'O', 'P', 'S', and space
        maps[0] = new CharacterPatternMap('O', new String[]{
            "  OOO  ", " O   O ", " O   O ", " O   O ", "  OOO  "
        });
        maps[1] = new CharacterPatternMap('P', new String[]{
            " OOOO  ", " O   O ", " OOOO  ", " O     ", " O     "
        });
        maps[2] = new CharacterPatternMap('S', new String[]{
            "  OOOO ", " O     ", "  OOO  ", "     O ", " OOOO  "
        });
        maps[3] = new CharacterPatternMap(' ', new String[]{
            "       ", "       ", "       ", "       ", "       "
        });

        return maps;
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == Character.toUpperCase(ch)) {
                return map.getPattern();
            }
        }
        return charMaps[3].getPattern(); // Return space pattern as default
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        int patternHeight = 5; // All patterns have 5 rows

        // Loop through each row of the banner
        for (int row = 0; row < patternHeight; row++) {
            StringBuilder line = new StringBuilder();
            
            // For the current row, append that specific row for each character in the message
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                line.append(pattern[row]).append(" "); // Add a space between characters
            }
            System.out.println(line.toString());
        }
    }
}