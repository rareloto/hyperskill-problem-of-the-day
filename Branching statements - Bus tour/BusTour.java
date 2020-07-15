// https://hyperskill.org/learn/daily/3820?history=true
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Scanner;

public class BusTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] tour = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] bridges = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        IntStream.range(0, bridges.length)
                .filter(i -> tour[0] >= bridges[i])
                .findAny()
                .ifPresentOrElse(i -> System.out.println("Will crash on bridge " + (i + 1)), 
                    () -> System.out.println("Will not crash"));
    }
}
