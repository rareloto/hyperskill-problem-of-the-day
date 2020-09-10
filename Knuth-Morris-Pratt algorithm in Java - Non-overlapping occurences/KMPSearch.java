/* Knuth-Morris-Pratt algorithm in Java - Non-overlapping occurrences 
 * https://hyperskill.org/learn/step/5729
 */
import java.util.ArrayList;
import java.util.Scanner;

public class KMPSearch {
    public static int[] calculatePrefixFunc(String text) {
        int[] prefixFunc = new int[text.length()];
        prefixFunc[0] = 0;
        
        for (int i = 1; i < text.length(); i++) {
            int j = prefixFunc[i - 1];
            
            if (j > 0 && text.charAt(i) != text.charAt(j)) {
                // j = prefixFunc[j - 1];
                j = 0;
            }
            
            if (text.charAt(i) == text.charAt(j)) {
                j++;
            }
            
            prefixFunc[i] = j;
        }
        
        return prefixFunc;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String pattern = scanner.nextLine();
        String text = scanner.nextLine();
        ArrayList<Integer> occurrences = new ArrayList<>();
        
        // Calculate prefix function
        int[] prefixFunc = calculatePrefixFunc(pattern + "#" + text);
        
        // Traverse through prefix function
        for (int i = pattern.length() + 1; i < prefixFunc.length; i++) {
            // Record index of pattern occurrence in text
            if (prefixFunc[i] == pattern.length()) {
                occurrences.add(i - 2 * pattern.length());
            }
        }
        
        // Print occurrences
        System.out.println(occurrences.size());
        occurrences.forEach(m -> System.out.print(m + " "));   
    }
}
