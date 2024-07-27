public class E5CountVowels {
    public static void main(String[] args) {
        String sentence = "Saveetha School of Engineering";
        int vowelCount = 0;
        for (char c : sentence.toCharArray()) {
            if (isVowel(c)) {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
