import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

class BluePrintOfSet {
    public static String removeDuplicatesPreserveOrder(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (char c : set) {
            result.append(c);
        }
        return result.toString();
    }

    public static void removeAllDuplicatesAndPrintThemInIncreasingOrder(int[] a) {
        TreeSet<Integer> t = new TreeSet<>();
        for (int x : a) {
            t.add(x);
        }

        System.out.println("After removing duplicates (in increasing order):");
        for (int x : t) {
            System.out.print(x + " ");
        }
        System.out.println(); // newline after output
    }

    public static void removeDuplicateWords(String str) {
        TreeSet<String> t = new TreeSet<>();
        String[] s = str.split("\\s+");
        for (String x : s) {
            t.add(x);
        }

        System.out.println("After removing duplicate words (sorted):");
        for (String i : t) {
            System.out.print(i + " ");
        }
        System.out.println(); // newline after output
    }
}

public class Collections_Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Uncomment one section at a time to test
        /*
        System.out.println("Enter string:");
        String str = sc.nextLine();
        String result = BluePrintOfSet.removeDuplicatesPreserveOrder(str);
        System.out.println("Result: " + result);
        */

        /*
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int[] ar = new int[size];
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            ar[i] = sc.nextInt();
        }
        BluePrintOfSet.removeAllDuplicatesAndPrintThemInIncreasingOrder(ar);
        */

        System.out.println("Enter string:");
        String str = sc.nextLine();
        BluePrintOfSet.removeDuplicateWords(str);
    }
}
