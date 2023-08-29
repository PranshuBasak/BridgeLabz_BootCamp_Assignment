public class pattern_initials {
    public static void main(String[] args) {
        // Define the height of the pattern
        int height = 9;
        // Define the width of each letter
        int width = 5;
        // Define the gap between letters
        int gap = 2;
        // Loop through each row
        for (int i = 0; i < height; i++) {
            // Loop through each column
            for (int j = 0; j < width * 3 + gap * 2; j++) {
                // Check if the current position is part of the first letter
                if (j < width && (i == 0 || i == height / 2 || j == width / 2)) {
                    // Print an asterisk
                    System.out.print("*");
                }
                // Check if the current position is part of the second letter
                else if (j >= width + gap && j < width * 2 + gap && (i == 0 || i == height - 1 || j == width + gap || j == width * 2 + gap - 1)) {
                    // Print an asterisk
                    System.out.print("*");
                }
                // Check if the current position is part of the third letter
                else if (j >= width * 2 + gap * 2 && (i == height / 2 || j == width * 2 + gap * 2 || j == width * 3 + gap * 2 - 1)) {
                    // Print an asterisk
                    System.out.print("*");
                }
                // Otherwise, print a space
                else {
                    System.out.print(" ");
                }
            }
            // Move to the next line
            System.out.println();
        }
    }
}
