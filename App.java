import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("World? Hello!");
        List<String> list = Arrays.asList(" One", " Two", " Three", " Four", " Five");
        printListInReverse(list);
    }
    
    public static void printListInReverse(List<String> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }
        System.out.println();
    }
}