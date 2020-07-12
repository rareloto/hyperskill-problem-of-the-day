// https://hyperskill.org/learn/daily/4347?history=true
import java.util.Arrays;
import java.util.Scanner;

public class PatternMatcher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();

        boolean matchFound = Arrays.stream(line.split("[^A-Za-z]+")).anyMatch(word -> word.length() == size);
        System.out.println(matchFound ? "YES" : "NO");
    }
}
