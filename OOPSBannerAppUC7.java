import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppUC7 {

    // Static Inner Class to encapsulate character and pattern
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Centralized Pattern Storage
        Map<Character, CharacterPatternMap> patternLibrary = new HashMap<>();

        patternLibrary.put('O', new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        patternLibrary.put('P', new CharacterPatternMap('P', new String[]{
                " ******",
                "*     *",
                "*     *",
                " ******",
                "*      ",
                "*      ",
                "*      "
        }));

        patternLibrary.put('S', new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        }));

        String word = "OOPS";
        String[] banner = new String[7];

        // Build banner row by row
        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {

                CharacterPatternMap cp = patternLibrary.get(ch);

                if (cp != null) {
                    lineBuilder.append(cp.getPattern()[row]).append("   ");
                }
            }

            banner[row] = lineBuilder.toString();
        }

        // Display banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}