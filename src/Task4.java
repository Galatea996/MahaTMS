import java.util.Locale;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder res = new StringBuilder();

        String[] str = new String[3];
        for (int i = 0; i < str.length;i++){
            str[i] = scanner.nextLine();
        }
        res.append(str[2]).append("/n ").append(str[1].toUpperCase()).append("/n").append(str[0].toLowerCase()).append("/n ");
        System.out.println(res);
    }
}
