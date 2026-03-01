public class OOPSBannerAppUC6 {

    public static void main(String[] args) {

        // Generate character patterns using helper methods
        String[] o = buildO();
        String[] p = buildP();
        String[] s = buildS();

        // Create final banner by combining letters
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("  ", o[i], o[i], p[i], s[i]);
        }

        // Render banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Helper method for letter O
    public static String[] buildO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Helper method for letter P
    public static String[] buildP() {
        return new String[]{
                " ******",
                "*     *",
                "*     *",
                " ******",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Helper method for letter S
    public static String[] buildS() {
        return new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };
    }
}

