public class WordFormation {
    public static int solution(char[] chars, String sentence) {
        int count = 0;
        String charString = new String(chars);
        String[] words = sentence.split("\\s+"); // Split the sentence into words

        for (String word : words) {
            boolean canFormWord = true;
            for (char c : word.toCharArray()) {
                if (charString.indexOf(c) == -1) { // Check if character is present in the char array
                    canFormWord = false;
                    break;
                }
            }
            if (canFormWord) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        /*char[] chars = {'e', 'i', 'h', 'l', 'o', 's'};
        String sentence = "Hello, this is codesignal!";*/
        char[] chars = {'r', 's', 't', 'c', 'h'};
        String sentence = "Hi, this is cheris";

        int result = solution(chars, sentence);
        System.out.println("Number of words that can be formed: " + result);
    }
}

