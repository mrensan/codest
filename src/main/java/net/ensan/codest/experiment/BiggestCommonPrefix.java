package net.ensan.codest.experiment;


//Write a function returns biggest common prefix for a given String[] words
public class BiggestCommonPrefix {

    public String solution(String[] data) {
        if (data.length == 0) {
            return "";
        }
        final StringBuilder result = new StringBuilder();
        for(int charIndex = 0; charIndex < data[0].length(); charIndex++) {
            char currentChar = data[0].charAt(charIndex);
            for(int wordIndex = 1; wordIndex < data.length; wordIndex++) {
                if (currentChar != data[wordIndex].charAt(charIndex)) {
                    return result.toString();
                }
            }
            result.append(currentChar);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String result = new BiggestCommonPrefix().solution(new String[] {
                "newyork",
                "newseason",
                "newyear",
                "newton",
                "neon"
        });
        System.out.printf("The biggest common prefix is: `%s`", result);
    }
}
