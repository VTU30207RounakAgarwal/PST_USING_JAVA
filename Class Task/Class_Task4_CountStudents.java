import java.util.*;

public class Class_Task4_CountStudents {
    public static void main(String[] args) {
        int marks[] = { 75, 80, 65, 90, 85 };

        long count = Arrays.stream(marks).filter(mark -> mark > 75).count();

        System.out.println("Count" + count);
    }
}
