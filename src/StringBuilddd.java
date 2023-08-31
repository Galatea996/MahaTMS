import java.util.Scanner;

public class StringBuilddd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder res = new StringBuilder("Res :  ");

        String[] strings = new String[3];
        for (int i= 1; i < strings.length; i++){
            strings[i] = scanner.nextLine();
        }
        String min = strings[0];
        String  max = strings[0];

        for (String elem:strings) {
            if(elem.length() < min.length());
            min = elem;
            if(elem.length() < max.length());
            max = elem;
        }
        res.append("dksjddjdj - ").append(min).append("/n").append("hedgdkjf - ").append(max).append("/n");
    }
}
