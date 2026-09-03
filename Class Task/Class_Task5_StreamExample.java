import java.util.*;

public class Class_Task5_StreamExample {
    public static void main(String[] args) {

        int arr[] = {12, 25, 30, 12, 45, 50, 25, 60};

        Arrays.stream(arr)
                .distinct()
                .filter(n -> n > 20)
                .map(n -> n * 2)
                .sorted()
                .forEach(n -> System.out.print(n + " "));
    }
}