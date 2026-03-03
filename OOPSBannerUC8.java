import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC8 {

    // Centralized Pattern Storage
    private static Map<Character, String[]> patternMap = new HashMap<>();

    public static void main(String[] args) {

        // Load all patterns
        loadPatterns();

        // Print Banner
        printBanner("OOPS");
    }

    // Load all character patterns into HashMap
    private static void loadPatterns() {

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });
    }

    // Print banner using nested loops
    private static void printBanner(String word) {

        int height = 7;

        for (int i = 0; i < height; i++) {
            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(Character.toUpperCase(ch));

                if (pattern != null) {
                    System.out.print(pattern[i] + "  ");
                } else {
                    System.out.print("        ");
                }
            }
            System.out.println();
        }
    }
}