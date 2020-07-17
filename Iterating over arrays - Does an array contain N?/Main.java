// https://hyperskill.org/learn/daily/2131?history=true

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = Integer.parseInt(scanner.nextLine());
        int[] ints = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int num = Integer.parseInt(scanner.nextLine());
        
        System.out.println(Arrays.stream(ints).anyMatch(n -> n == num));
    }
}
