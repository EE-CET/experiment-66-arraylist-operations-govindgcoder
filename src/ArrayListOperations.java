import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();
        String[] inputItems = input.split("\\s+");
        String item = sc.nextLine();
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, inputItems);
        Collections.sort(list);
        System.out.println("Sorted Items: " + list);
        int index = list.indexOf(item);
        if (index != -1) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
        sc.close();
    }
}
