// https://hyperskill.org/learn/daily/2852?history=true 
import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int year = scanner.nextInt();
        int dayOfYear = scanner.nextInt();
        
        LocalDate date = LocalDate.ofYearDay(year, dayOfYear);
        boolean isEndOfMonth = date.getDayOfMonth() == date.lengthOfMonth();
        System.out.println(isEndOfMonth);
    }
}
