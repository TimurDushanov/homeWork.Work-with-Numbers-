import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Integer> inList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        positiveNumbers(inList);

    }

    public static void positiveNumbers(List<Integer> list) {
        List<Integer> list1 = new ArrayList<>();
        for (int x : list) {
            if (x > 0 && x % 2 == 0) {
                list1.add(x);
            }
        }
        Collections.sort(list1);
        System.out.println(list1);
    }

}