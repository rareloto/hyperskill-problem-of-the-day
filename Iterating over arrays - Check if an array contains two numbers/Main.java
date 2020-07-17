// https://hyperskill.org/learn/daily/2129?history=true

import java.util.stream.IntStream;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = Integer.parseInt(scanner.nextLine());
        int[] numbers = IntStream.range(0, size).map(num -> scanner.nextInt()).toArray();
        int[] nm = IntStream.range(0, 2).map(num -> scanner.nextInt()).toArray();
        
        System.out.println(IntStream.range(0, size - 1)
            .anyMatch(i -> numbers[i] == nm[0] && numbers[i + 1] == nm[1]
                || numbers[i] == nm[1] && numbers[i + 1] == nm[0]));
    }
}
