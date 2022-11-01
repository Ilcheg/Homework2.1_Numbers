import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        int pos = 0;
        for (int i : intList) {
            if (i > 0) {
                pos++;
            }
        }
        int[] arrpos = new int[pos];
        int countpos = 0;
        for (int x : intList) {
            if (x > 0) {
                arrpos[countpos] = x;
                countpos++;
            }
        }
        int countEvenNumbers = 0;
        for (int y : arrpos) {
            if (y % 2 == 0) {
                countEvenNumbers++;
            }
        }
        int[] arrEvenNumbers = new int[countEvenNumbers];
        int evenNumbers = 0;
        for (int j : arrpos) {
            if (j % 2 == 0) {
                arrEvenNumbers[evenNumbers] = j;
                evenNumbers++;
            }
        }
        Arrays.sort(arrEvenNumbers);
        for (int a : arrEvenNumbers)
        System.out.println(a);
    }
}