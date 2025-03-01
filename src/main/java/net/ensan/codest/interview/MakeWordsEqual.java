package net.ensan.codest.interview;

/**
 * Write a function in Java:
 * <p>
 * <blockquote><pre>
 * class Solution { public String solution(String[] words); }
 * </pre></blockquote>
 * <p>
 * that, given an array words made of N strings, each of length K, returns a string of length K
 * that differs from every string in the array in at most one position.
 * The returned string should consist of lowercase English letters.
 * If there are multiple such strings, the function can return any. If no such string exists, the
 * function should return an empty string.
 * <p>
 * Examples:
 * <ol>
 *     <li>Given words = ["aaka", "aaka", "aaja", "aaxa", "aaba"], one of the correct result is "aaba".
 *  Note that "b" can be replaced by any other letter and the solution will remain correct.</li>
 *     <li>Given words = ["bay", "zaz", "bab"], the function should return "baz".</li>
 *     <li>Given words = ["aya", "aba", "abb", "zba"], the function should return "aba".</li>
 *     <li>Given words = ["zzz", "bcb", "zzc"], the function shoud return "" (empty string)</li>
 * </ol>
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <ul>
 *     <li>each string in the array words is of length K and consists only of lowercase English letters.</li>
 *     <li>N is an integer within the range [2..100,000];</li>
 *     <li>K in an integer within the range [1..100,000];</li>
 *     <li>N*K is an integer within the range [2..1,000,000].</li>
 * </ul>
 */
public class MakeWordsEqual {

    /**
     * <ul>
     *     <li>Iterate over each character position (K positions)</li>
     *     <li>Check validity</li>
     *     <li>Return the first valid candidate</li>
     *     <li>O(K * N) in the worst case</li>
     * </ul>
     * <p>
     * Why don't we need to repeat for other words?
     * <ul>
     *     <li>
     *         If modifying words[0] doesn't yield a valid answer, then trying with another word wouldn't help,
     *         because any valid string must be close to every word. If one word can't be modified to be valid,
     *         none can.
     *     </li>
     *     <li>
     *         The algorithm already explores different characters from all words in each position, meaning it's
     *         not biased toward words[0]. It systematically checks all possible small variations.
     *     </li>
     * </ul>
     */
    public String solution(String[] words) {
        int K = words[0].length();
        char[] candidate = words[0].toCharArray();

        for (int i = 0; i < K; i++) {
            char originalChar = candidate[i];

            for (char c = 'a'; c <= 'z'; c++) { // Try all lowercase letters
                candidate[i] = c;
                if (isValid(candidate, words)) {
                    return new String(candidate);
                }
            }

            /* Not sure if this is a good idea instead of trying all characters?
            Set<Character> seen = new HashSet<>();
            for (String word : words) {
                seen.add(word.charAt(i));
            }
            for (char c : seen) {
                candidate[i] = c;
                if (isValid(candidate, words)) {
                    return new String(candidate);
                }
            }
            */
            candidate[i] = originalChar; // Restore original
        }

        return ""; // No valid string found
    }

    private boolean isValid(char[] candidate, String[] words) {
        int K = candidate.length;

        for (String word : words) {
            int diffCount = 0;
            for (int i = 0; i < K; i++) {
                if (candidate[i] != word.charAt(i)) {
                    diffCount++;
                    if (diffCount > 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /**
     * This solution reached 50% score at Codility:<p>
     * Correctness: 60% | Performance: 33%
     * */
    public String solution50Percent(String[] words) {
        int k = words[0].length();

        // Try generating a string that differs from each word by at most one position
        for (final String word : words) {
            char[] newWord = word.toCharArray();

            for (int j = 0; j < k; j++) {
                char originalChar = newWord[j];

                for (char ch = 'a'; ch <= 'z'; ch++) {
                    if (ch != originalChar) { // Modify only one position
                        newWord[j] = ch;
                        String candidate = new String(newWord);

                        // Ensure it differs by at most one character from every word in the list
                        if (isValid50Percent(candidate, words)) {
                            return candidate;
                        }
                    }
                }

                // Restore the original character
                newWord[j] = originalChar;
            }
        }

        return ""; // If no such string exists
    }

    private boolean isValid50Percent(String candidate, String[] words) {
        for (String word : words) {
            if (countDifferences(candidate, word) > 1) {
                return false;
            }
        }
        return true;
    }

    private int countDifferences(String s1, String s2) {
        int diffCount = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffCount++;
                if (diffCount > 1) {
                    return diffCount; // Early exit
                }
            }
        }
        return diffCount;
    }
}
