import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* 
        System.out.println("Enter a string:");
        String s1 = sc.nextLine();

        // Case conversion
        System.out.println("Upper case: " + s1.toUpperCase());
        System.out.println("Lower case: " + s1.toLowerCase());

        // Character access with safety check
        if (s1.length() > 7) {
            System.out.println("Character at index 7: " + s1.charAt(7));
        } else {
            System.out.println("String too short for index 7.");
        }

        if (s1.length() > 5) {
            System.out.println("Unicode value at index 5: " + s1.codePointAt(5));
        } else {
            System.out.println("String too short for index 5.");
        }

        // Index search
        System.out.println("Index of character 'c': " + s1.indexOf('c'));
        System.out.println("Last index of character 'a': " + s1.lastIndexOf('a'));

        // Substring examples
        if (s1.length() >= 5) {
            System.out.println("Substring from index 2: " + s1.substring(2));
            System.out.println("Substring from index 2 to 5: " + s1.substring(2, 5));
        }

        // Char array and loop
        char[] ch = s1.toCharArray();
        System.out.println("Characters in the string:");
        for (char c : ch) {
            System.out.println(c);
        }

        // Splitting string
        System.out.println("Splitting the string by commas:");
        String[] st = s1.split(",");
        for (String i : st) {
            System.out.println(i);
        }

        // Reconstructing string from char array
        String str = new String(ch);
        System.out.println("Character array to string: " + str);

        // Length
        System.out.println("Length of the string: " + s1.length());
        */
        // StringBuffer and StringBuilder are classes Which is used to store mutable strings inside it .
         StringBuffer sb = new StringBuffer();

        // Initial capacity
        System.out.println("Initial capacity: " + sb.capacity()); // Should print 16

        // Append first string
        sb.append("varsha");
        System.out.println("After appending 'varsha': " + sb);

        // Append second string
        sb.append("papa subramanyam");
        System.out.println("After appending 'papa subramanyam': " + sb);

        // Capacity after expansion
        System.out.println("Capacity after expansion: " + sb.capacity()); // Should be 34

        // Delete characters from index 2 to 13
        sb.delete(2, 13);
        System.out.println("After deletion from index 2 to 13: " + sb); // Expected: vabramanyam

    }
}
