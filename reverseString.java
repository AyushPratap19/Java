public class reverseString {
    
        public static String reverseEachWord(String str) {
            String[] words = str.split(" ");
            StringBuilder reversedSentence = new StringBuilder();
    
            for (int i = words.length - 1; i >= 0; i--) {
                reversedSentence.append(words[i]);
    
                if (i > 0) {
                    reversedSentence.append(" ");
                }
            }
    
            return reversedSentence.toString();
        }
    
        public static void main(String[] args) {
            String str = "all cows eat grass";
            System.out.println(reverseEachWord(str));
        }
    }
    

