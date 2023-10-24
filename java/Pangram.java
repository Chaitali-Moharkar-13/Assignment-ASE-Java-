import java.util.*;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
        System.out.print("Enter a string: "); //The quick brown fox jumps over the lazy dog 
        String str= sc.nextLine();        
        if (isPangram(str)) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }

    public static boolean isPangram(String s) {
        s = s.replaceAll(" ", "").toLowerCase();

        boolean[] letters = new boolean[26];
        int uniqueCount = 0;

        for (char c : s.toCharArray()) {
            if ('a' <= c && c <= 'z') {
                int index = c - 'a';
                if (!letters[index]) {
                    letters[index] = true;
                    uniqueCount++;
                }
            }
        }

        return uniqueCount == 26;
    }
}