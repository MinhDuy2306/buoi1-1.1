import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String name = input.nextLine();
        String formattedName = formatName(name);
        System.out.println(formattedName);
    }

    public static String formatName(String name) {
        String[] nameArr = name.toLowerCase().split(" ");
        StringBuilder formattedName = new StringBuilder();

        for (String str : nameArr) {
            formattedName.append(str.substring(0, 1).toUpperCase());
            formattedName.append(str.substring(1)).append(" ");
        }

        return formattedName.toString().trim();
    }
}