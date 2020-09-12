/* https://hyperskill.org/learn/step/5730
 * Knuth-Morris-Pratt algorithm in Java
   Alice plays letter cubes (v2)
 */
import java.util.Arrays;
import java.util.Scanner;

public class KMPDistinctSubstrings {
    public static int[] calculatePrefixFunc(String text) {
        int[] prefixFunc = new int[text.length()];
        
        for (int i = 1; i < text.length(); i++) {
            int j = prefixFunc[i - 1];
            
            if (j > 0 && text.charAt(i) != text.charAt(j)) {
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
        final Scanner scanner = new Scanner(System.in);
        
        String text = scanner.nextLine();
        
        // Calculate number of distinct substrings
        int substrings = 1;  // initialize with 1 for empty string 
        // Traversing through text
        for (int i = 1; i <= text.length(); i++) {
            // Reverse substring 
            StringBuilder transformedText = new StringBuilder(text.substring(0, i)).reverse();
            // Calculate prefix function
            int[] prefixFunc = calculatePrefixFunc(transformedText.toString());
            // Compute for the number of different substrings
            substrings += i - Arrays.stream(prefixFunc).max().getAsInt();
        }
        
        System.out.println(substrings);
    }
}
