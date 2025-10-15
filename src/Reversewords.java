public class Reversewords {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        String[] words = new String[10];
        int wordCount = 0;
        String word = "";
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch != ' ') {
                word += ch;
            }
            else {
                words[wordCount++] = word;
                word = "";
            }
        }
        words[wordCount++] = word;
        System.out.print("Reversed: ");
        for (int i = wordCount - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
